package ch.bbw.m151.jokesdb.service;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.util.stream.Collectors;

import ch.bbw.m151.jokesdb.datamodel.JokesEntity;
import ch.bbw.m151.jokesdb.repository.JokesRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.context.event.EventListener;
import org.springframework.core.io.ClassPathResource;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Service
public class JokesService {

    private static final Logger log = LoggerFactory.getLogger(JokesService.class);

    private final JokesRepository jokesRepository;

    public JokesService(JokesRepository jokesRepository) {
        this.jokesRepository = jokesRepository;
    }

    @EventListener(ContextRefreshedEvent.class)
    public void preloadDatabase() {
        if (jokesRepository.count() != 0) {
            log.info("database already contains data...");
            return;
        }
        log.info("will load jokes from classpath...");
        try (var lineStream = Files.lines(new ClassPathResource("chucknorris.txt").getFile()
                .toPath(), StandardCharsets.UTF_8)) {
            var jokes = lineStream.filter(x -> !x.isEmpty())
                    .map(x -> new JokesEntity().setJoke(x));
            jokesRepository.saveAll(jokes.collect(Collectors.toList()));
        } catch (IOException e) {
            throw new RuntimeException("failed reading jokes from classpath", e);
        }
    }
    @Transactional
    public void addEntryFromApi() {
		RemoteJokesService remoteJokesService = new RemoteJokesService();
		var Jotd = remoteJokesService.Jotd();
		var jokeentity = new JokesEntity();
		jokeentity.setJoke(Jotd.getSetup() + " " + Jotd.getDelivery());
		jokesRepository.save(jokeentity);
    }
}

package ch.bbw.m151.jokesdb.service;

import ch.bbw.m151.jokesdb.datamodel.JokeApiModel;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;

@Service
public class RemoteJokesService {
    public JokeApiModel Jotd(){
       var client = WebClient.builder()
                .baseUrl("https://v2.jokeapi.dev/")
                .build();

      var Darkjoketwopartet =  client.get()
               .uri("joke/Dark?type=twopart")
               .retrieve()
               .bodyToMono(JokeApiModel.class).block();
      return Darkjoketwopartet;
    }
}

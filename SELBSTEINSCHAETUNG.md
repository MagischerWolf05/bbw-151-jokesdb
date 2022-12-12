# JokeDb 

---
### Jokes DB Aufrag




- [x] min: hardcoded client für ein paar Usecases
- [x] think-tank: generischer Jokes-Client, mehrere Parameter (zB `lang` werden supportet), Rate-Limit-Awareness. Jokes werden local cached.
- [x] min: Remote Jokes werden in der lokalen DB gespeichert und Duplikate werden verhindert.
- [x] think-tank: webclient-connection-pooling, explizites `@Transactional`-Handling. Die Datenbank wird durch sinnvolle Felder erweitert und Jokes können mit einem Sterne-Rating pro User versehen werden.
- [ ] min: Technische Datenbankfelder creation-timestamp, modified-timestamp (and friends) per Tabelle, joke-ratings in einer zweiten Tabelle
- [x] think-tank: Techfelder in einer Basis-Klasse, weitere Columns wie "Category" entsprechend jokeapi.dev, Ratings per User und User login via BasicAuth. Verwendet sinnvolle https://projectlombok.org/[Lombok] Features
- [x] min: keine Getter/Setters in Code
- [ ] besser: Loggers, ToString,.... JUnit Testing mit `@SpringBootTest` und https://assertj.github.io/doc/[AssertJ]
- [x] min: `WebTestClient` Tests der eigenen Endpunkte
- [ ] think-tank: automatisierte CI-Tests bei jedem Commit und sinnvolle Coverage. Dokumentation
- [x] min: README mit einer Selbsteinschätzung, Diskussion der verwendeten Features und wo der Fokus gesetzt wurde.
- [ ] think-tank: ein kleines UI mit dem Joke-of-the-day oder einer ähnlichen Beispielanwendung
---
### Jokes DB Selbsteinschätzung
Ich finde das ich habe das Projekt Ok gelöst ist nicht meine überragende Arbeit Aber auch nicht die schlechteste.
Ich hätte meine Zeit besser Investieren können und paar sachen besser lösen
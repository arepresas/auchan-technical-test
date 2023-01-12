# **`Technical test`**

Salut et bienvenue ici. Auchan te propose de consacrer un peu de temps pour nous exposer tes talents.

Tu trouveras ici le squelette d'un projet **Spring Reactive (JAVA)** / **MongoDB** (technical-test-api) et la partie
front sera en **Thymeleaf** (technical-test-renderer).

Prenons l'exemple d'une **bibliothèque** composée d'une collection de **Books(id, title, publicationDate)**
Il y a également une deuxième collection **Autor(id, name, gender)**.
Cette petite biliothèque possède quelques livres.
Tu dois afficher cette bibliothèque en précisant pour chaque livre qui est l'auteur lui correspondant.
Il nous faudra bien sûr des formulaires pour ajouter un livre, un auteur et même un formulaire d'édition des auteurs.

Pas de fioritures, pas de piège, pas de bonne ou mauvaise façon de faire, ce sera juste l'occasion pour toi de créer un
support sur lequel baser notre prochaine rencontre.

N'hésite pas à fouiller sur **Google, StackOverflow**, la documentation **Spring** pour trouver les réponses à tes
questions.

Have fun !

**Si tu rencontres un problème n'hésite pas à créer une issue sur le repo que tu as fork et on répondra aussi vite que
possible !**

# **`Local environment deployment`**

- Deploy local docker -> **docker-compose -f technical-test-api/src/main/resources/docker/local-docker-compose.yaml up
  -d**
- Launch Api module
- Launch Render module
- Swagger -> **http://localhost:8080/webjars/swagger-ui/index.html#**
- FrontEnd -> **http://localhost:8081/books**
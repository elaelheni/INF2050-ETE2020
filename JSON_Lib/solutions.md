Librairie json-lib
==================

La librairie json-lib sera utilisée durant le projet de session. Il s'agit d'une
librairie offrant les fonctionnalités pour interpréter et générer des documents
JSON sans devoir manipuler les particularités syntaxiques de cette notation dans
nos programmes Java.

Exemple d'utilisation de la librairie : [https://github.com/jacquesberger/JSONParsingExample](https://github.com/jacquesberger/JSONParsingExample)

Objectifs
---------

* Utiliser une librairie JSON pour Java

Exercices
---------

Pour ces exercices, utilisez les jar disponibles dans ce
[répertoire](Dépendances/).

0. Pour inclure les .jar

    * Pour inclure la librairie externe dans Intellij

        ```
        fichier > project structure > modules > dependencies > "+" > JARs or directories
        ```

    * En ligne de comande

        ```sh
        javac -cp .:Dépendances/* MonProgramme.java
        ``` 

1. Écrivez un programme qui lit ce [document JSON](collection.json) et qui affiche à la
   console les informations suivantes :
   * le nombre d'albums;
   * le nombre de singles;
   * la liste des albums publiés depuis 2003;
   * la liste des albums avec une note de 5.

2. Étapes de réalisation :

   * Comment lire un fichier JSON?

        ```java
        String jsonText = DiskFile.loadFileIntoString(String filename);
        JSONObject object = (JSONObject) JSONSerializer.toJSON(String jsonText);
        ```

   * Comment extraire un array JSON?

        ```java
        JSONArray array = (JSONArray) JSONObject.getJSONArray(String clef);
        ```

   * Comment extraire un objet JSON?

        ```java
        JSONArray.get(int index);
        JSONOBject.getString(String clef);
        ```


2. Suivant la même modélisation, écrivez un programme Java qui écrira vos 3
   albums préférés dans un document JSON.

   * Comment créer un array JSON et y ajouter du contenu?

        ```java
        JSONArray arrayJson = new JSONArray();
        JSONObject objetJson = new JSONObject();
        JSONObject.put(String clef, String contenu);
        arrayJson.add(objetJson);
        ```
   * Comment écrire un objet JSON dans un fichier?

        ```java
        String jsonString = albums.toString(2); // 2 = indice d'indentation
        DiskFile.saveStringIntoFile("output.json", jsonString);
        ```




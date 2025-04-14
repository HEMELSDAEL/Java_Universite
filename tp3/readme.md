# Ceci est  le TP3 fait par LECLERC_Laura et HEMELSDAEL_Alexandre

## Descriptions et objectifs de ce TP : 
Ce TP avait pour objectif de nous faire créer des classes correspondant à un rectangle afin de créer un Main qui reprenait ces méthodes. Une fois le Main crée nous avons vu deux façons de lancer un Main avec ou sans paramètres. 

Dans ce TP tout a été réalisé entièrement sans ajout de fonction 

## Voici les commandes de compilations de nos fichiers :
* Voici la commande pour générer la documentation en se plaçant dans le dossier tp3: 
    * `javadoc src/Rectangle.java -d docs`
* Voici la commande pour compiler la classe Rectangle en se plaçant dans le dossier tp3 : 
    * `javac -sourcepath src src/Rectangle.java -d classes`
* Voici la commande pour compiler la classe RectangleMain en se plaçant dans le dossier tp3 : 
    * `javac -sourcepath src src/RectangleMain.java -d classes`
* Voici la commande pour exécuter la classe RectangleMain en se plaçant dans le dossier tp3: 
    * `java -classpath classes RectangleMain`
* Voici la commande pour exécuter la classe RectangleMain avec des paramètres en se plaçant dans le dossier tp3 : 
    * `java -classpath classes RectangleMain 3 2`

### Voici quelques exemples d'exécution de RectangleMain :
* `java -classpath classes RectangleMain 3 2`
    **Résultat** : 
    Ce carre a une longueur de 3.0 cm et une largeur de 2.0 cm
    Ce carre a une longueur de 15.0 cm et une largeur de 15.0 cm
    L'aire du rectangle1 est de : 6.0
    Le perimetre de ce rectangle2 est de : 450.0
    L'un des deux rectangles est un carre
    false : Les deux rectangles ne sont pas egaux

* `java -classpath classes RectangleMain`
    **Résultat** : Erreur il faut saisir soit 1 parametre ou alors 2 parametres

* `java -classpath classes RectangleMain 3`
    **Résultat** : Le rectangle est un carre



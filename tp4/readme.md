# Voici le TP4 réalisés par HEMELSDAEL_Alexandre et LECLERC_Laura

## Descriptions et objectifs de ce TP : 
Dans un premier temps, nous avons vu le fonctionnement des paquetages en java. Ainsi que les importations de fichiers. Nous avons appris à compiler les fichiers en tenant compte des paquetages dans le chemin.
Dans un second temps, nous avons vu les tests unitaires en Java avec une archive .jar.
Dans un troisième temps, nous avons vu la pratique des paquetages, des importations et des tests dans la mise en oeuvre de ce TP
Tout a été réalisé dans ce TP sans ajout de fonctions supplémentaires

## Générer la documentation et consulter celle-ci: 
Voici la commande pour générer la documentation d'un paquetage et d'un sous-paquetage (ici vlille et vlille.util) en se plaçant dans le dossier tp4:
* `javadoc -sourcepath src -subpackages vlille -d docs`

## Compiler les classes de ce projet :
Voici la commande pour compiler les classes de ce projet : 
-On peut soit compiler une classe à la fois en se plaçant dans le dossier tp4: 
* `javac -sourcepath src src/vlille/util/BikeModel.java -d classes`
* `javac -sourcepath src src/vlille/Bike.java -d classes`
* `javac -sourcepath src src/vlille/BikeMain.java -d classes`
* `javac -sourcepath src src/vlille/BikeNotAvailableException.java -d classes`
* `javac -sourcepath src src/vlille/BikeStation.java -d classes`
* `javac sourcepath src src/vlille/BikeStationMain.java -d classes`

-On peut soit compiler toutes les classes d'un même paquetage en se plaçant dans le dossier tp4:
* `javac -sourcepath src src/vlille/*.java -d classes`

## Compiler et exécution des tests de ce projet :
Voici la commande pour compiler les tests de ce projet en se plaçant dans le dossier tp4: 
* `javac -classpath "junit-console.jar;classes" test/vlille/BikeTest.java`
* `javac -classpath "junit-console.jar;classes" test/vlille/BikeSecondTest.java`
* `javac -classpath "junit-console.jar;classes" test/vlille/BikeStationTest.java`
On peut aussi compiler toutes les classes d'un même dossier si les tests sont écrits dans plusieurs classes en se plaçant dans le dossier tp4:
* `javac -classpath "junit-console.jar;classes" test/vlille/*.java`

Voici la commande pour exécuter les tests de ce projet en se plaçant dans le dossier tp4: 
* `java -jar junit-console.jar -classpath 'test;classes' -select-class vlille.BikeSecondTest`
* `java -jar junit-console.jar -classpath 'test;classes' -select-class vlille.BikeTest`
* `java -jar junit-console.jar -classpath 'test;classes' -select-class vlille.BikeStationTest`
On peut aussi exécuter plusieurs tests en se plaçant dans le dossier tp4:
* `java -jar junit-console.jar -classpath 'test;classes' -scan-classpath`

## Exécution du BikeStationMain et quelques exemples : 
Voici la commande pour exécuter le BikeStationMain en se plaçant dans le dossier tp4 : 
* `java -classpath classes vlille.BikeStationMain 0`
    * **Résultat** : b001
* `java -classpath classes vlille.BikeStationMain 1`
    * **Résultat** : b002
* `java -classpath classes vlille.BikeStationMain`
    * **Résultat** : lack of parameters
* `java -classpath classes vlille.BikeStationMain 5`
    * **Résultat** : No bike

## Exécution du BikeMain et un exemple:
Voici la commande pour exécuter le BikeMain en se plaçant dans le dossier tp4 :
* `java -classpath classes vlille.BikeMain`
    * **Résultat** : bike id : biclou, model : ELECTRIC

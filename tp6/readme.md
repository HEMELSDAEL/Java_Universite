# Voici le TP6 du binôme LECLERC_Laura et HEMELSDAEL_Alexandre
 
## Objectifs et descriptions de ce TP :
Ce TP reprend quelques fonctions que nous avons codés en TD et qui a pour but de manipuler des images en modifiant une couleur (gris) qui sont caractérisés par des pixels. Dans un premier temps, nous allons coder la classe GrayColor qui correspond à la couleur puis nous poursuivons par coder la classe Pixel qui va permettre de modifier les pixels d'une image. Ensuite nous allons coder la classe Image (elle sera enrichie au fur et à mesure du TP) qui est implémentée par un interface ImageInterface et qui permet de représenter les images qu'on veut créer. Puis pour voir notre travail nous avons créée un main que nous avons enrichi au fur et à mesure du TP.


## Compilations et exécutions des méthodes à effectuer pour un bon déroulement du TP :
### Voici la commande pour compiler la classe GrayColor : `javac -classpath src -d classes src/image/color/GrayColor.java`
### Voici la commande pour compiler la classe Pixel : `javac -classpath src -d classes src/image/Pixel.java`
### Voici la commande pour compiler la classe ImageTest : `javac -classpath "junit-console.jar:classes" test/image/ImageTest.java`
### Voici la commande pour exécuter la classe ImageTest : `java -jar junit-console.jar -classpath "test:classes" -select-class image.ImageTest`
### Voici la commande pour compiler la classe Image : `javac -classpath src -d classes src/image/Image.java`
### Voici la commande pour compiler la classe ImageExampleMain : `javac -classpath src -d classes src/image.ImageMain.java`
### Voici la commande pour exécuter la classe ImageExampleMain : `java -classpath classes image.ImageExampleMain`
### Voici la commande pour compiler la classe ImageMain : `javac -classpath src -d classes src/image/ImageMain.java`
### Voici la commande pour exécuter la classe ImageMain: `java -classpath classes image.ImageMain /images/fruit.pgm 15 16`
### Voici la commande qui va créer le jar qui exécutera la méthode ImageMain : `jar cvfe image.jar image.ImageMain images -C classes image`
### Voici la commande qui va exécuter le jar : `java -jar image.jar`

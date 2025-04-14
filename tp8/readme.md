# Ce fichier est le readme de HEMELSDAEL_Alexandre et de LECLERC_LAURA concernant le TP "Jeu de l'oie"

## Objectifs de ce TP :
Ce TP reprendre quelques notions que nous avons vu en TD notamment la classe Board et la méthode play(). Nous allons créer un jeu de l'oie avec différentes cells qui sont dans le package goosegame.Cell puis nous allons représenter nos joueurs et le plateau de jeu à l'aide de différentes classes qui sont dans le package goosegame. 
Ce TP reprend toutes les notions que nous avons depuis le début du semestre et mets l'accent sur **l'héritage et les classes abstraites et la notion de protected**

## Voici les commandes pour compiler, exécuter les différents fichiers de ce TP : 
### Voici la commande pour compiler toutes les classes du paquetage Cell : `javac -classpath src -d classes src/goosegame/Cell/*.java`
### Voici la commande pour générer la documentation des classes contenues dans le package goosegame : `javadoc -sourcepath src -subpackages goosegame -d docs`
### Voici la commande pour générer la documentation des classes contenues dans le package Cell : `javadoc -sourcepath src -subpackages goosegame.Cell -d docs`
### Voici la commande pour compiler la classe Player : `javac -classpath src -d classes src/goosegame/Player.java`
### Voici la commande pour compiler la classe CellTest : `javac -classpath "junit-console.jar:classes" test/goosegame/Cell/CellTest.java`
### Voici la commande pour exécuter la classe CellTest  `java -jar junit-console.jar -classpath 'test:classes' -select-class goosegame.Cell.CellTest`
### Voici la commande pour compiler la classe GooseCellTest : `javac -classpath "junit-console.jar:classes" test/goosegame/Cell/GooseCellTest.java`
### Voici la commande pour exécuter la classe GooseCellTest : `java -jar junit-console.jar -classpath 'test:classes' -select-class goosegame.Cell.GooseCellTest`
### Voici la commande pour compiler la classe TeleportCellTest : `javac -classpath "junit-console.jar:classes" test/goosegame/Cell/TeleportCellTest.java`
### Voici la commande pour exécuter la classe TeleportCellTest : `java -jar junit-console.jar -classpath 'test:classes' -select-class goosegame.Cell.TeleportCellTest`
### Voici la commande pour compiler la classe TrapCellTest : `javac -classpath "junit-console.jar:classes" test/goosegame/Cell/TrapCellTest.java`
### Voici la commande pour exécuter la classe TrapCellTest : `java -jar junit-console.jar -classpath 'test:classes' -select-class goosegame.Cell.TrapCellTest`
### Voici la commande pour compiler la classe WaitCellTest : `javac -classpath "junit-console.jar:classes" test/goosegame/Cell/WaitCellTest.java`
### Voici la commande pour exécuter la classe WaitCellTest : `java -jar junit-console.jar -classpath 'test:classes' -select-class goosegame.Cell.WaitCellTest`
### Voici la commande pour compiler la classe PlayerTest : `javac -classpath "junit-console.jar:classes" test/goosegame/PlayerTest.java`
### Voici la commande pour exécuter la classe PlayerTest : `java -jar junit-console.jar -classpath 'test:classes' -select-class goosegame.PlayerTest`
### Voici la commande pour compiler les classes du paquetage goosegame : `javac -classpath src -d classes src/goosegame/*.java`
### Voici la commande pour exécuter la classe GoosegameMain avec deux joueurs : `java -classpath classes goosegame.GoosegameMain 2`
### Voici la commande pour créer le jar exécutable avec X joueurs : `jar cvfe oie.jar goosegame.GoosegameMain -C classes goosegame`
### Voici la commande pour exécuter le jar exécutable avec X joueurs : `java -jar oie.jar 2`

## Jusitfication de l'utilisation d'une classe abstraite concernant Board : 
Nous avons choisis de mettre la classe Board en classe abstraite car cela nous permet de créer le jeu dans une classe appelée ClassicalBoard en fonction des règles de jeu voulues. Pour nous éviter de devoir tous changer dans Board et ClassicalBoard. Le fait de faire une classe abstraite permet juste de changer ClassicalBoard en fonction des règles de jeu que l'on veut appliquer. 

## Problèmes lors de la réalisation de ce TP:
* Difficultés rencontrées lors du codage de la classe GooseCell notamment pour le rebond
* Difficultés rencontrées lors de la mise en place de la méthode move

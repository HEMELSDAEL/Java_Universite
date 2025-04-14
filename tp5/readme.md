# Voici le TP5 codé par LECLERC_Laura et HEMELSDAEL_Alexandre

## Objectifs er description de ce TP 
Ce TP reprend et prolonge le TD "Bataille Navale".
Dans un premier temps, ce TP nous a permis de savoir créer, manipuler, et comprendre l'utilité des fichiers JAR et archives exécutables.
Dans un second temps, nous avons codés les différentes fonctions qui permettent le bon fonctionnement de la Bataille Navale ainsi que certains tests afin de vérifier la bonne utilisation de certaines méthodes.

## Exercice 1 : Fichiers JAR et archives exécutables (on se place toujours dans le dossier tp5) :

### Compilations des classes du paquetage tv (Question 2):
`javac -sourcepath src src/tv/*.java -d classes`

### Compilation des classes du paquetage io :
`javac -sourcepath src src/io/*.java -d classes`

### Création du fichier premierJar.jar qui regroupe l'ensemble des paquetages tv et io (Question 3):
`jar cvf premierJar.jar -C classes tv -C classes io`

### Visualisation du contenu de l'archive (Question 4):
`jar tvf premierJar.jar`

### Création d'une archive exécutable puis exécution du Jar (méthode 1) (Question 5-Question 6):
`jar cvfm tv1.jar tv-manifest -C classes tv`
`jar -jar tv1.jar`

### Méthode 2 (Question 7):
`jar cvfe tv1bis.jar tv.TvMain -C classes tv`
`jar -jar tv1bis.jar`

### Même chose pour une archive tv3.jar (Question 8):
`jar cvfm tv3.jar manifest-tv -C classes tv`
`java -jar tv3.jar`

### Exécution d'une archive avec un paramètre (Question 9):
`java -jar tv3.jar timoleon`

## Exercice 2 : Bataille Navale (toutes les commandes sont à exécuter dans le dossier tp5):

### Compilation et exécution du InputMain pour avoir un exemple d'utilisation des méthodes de io.Input (Question 1):
* **compilation** : `javac -classpath src -d classes src/io/InputMain.java`
* **exécution** : `java -classpath classes io/InputMain`

### Voici les commandes pour compiler la question 2:
* compiler la classe ShipTest : `javac -classpath "junit-console.jar:classes" test/battleship/ShipTest.java`
* exécution du test : `java -jar junit-console.jar -classpath 'test:classes' -select-class battleship.ShipTest`
* compiler la classe Ship : `javac -classpath src -d classes src/battleship/Ship.java`

### Voici la commande pour compiler la classe Answer (Question 3):
* compiler la classe Answer : `javac -classpath src -d classes src/battleship/Answer.java`

### Voici les commandes pour compiler la question 5 :
* compiler la classe CellTest : `javac -classpath "junit-console.jar:classes" test/battleship/CellTest.java`
* exécution du test : `java -jar junit-console.jar -classpath 'test:classes' -select-class battleship.CellTest`
* compiler la classe Cell : `javac -classpath src -d classes src/battleship/Cell.java`

### Voici les commandes pour compiler la question 8 :
* compiler la classe SeaTest : `javac -classpath "junit-console.jar:classes" test/battleship/SeaTest.java`
* exécution du test : `java -jar junit-console.jar -classpath 'test:classes' -select-class battleship.SeaTest`
* compiler la classe Sea : `javac -classpath src -d classes src/battleship/Sea.java`

### Voici les commandes pour compiler et exécuter le FirstBattleShipMain (Question 11):
* compiler la classe FirstBattleShipMain : `javac -classpath src -d classes src/battleship/FirstBattleShipMain.java`
* exécuter la classe FirstBattleShipMain : `java -classpath classes battleship.FirstBattleShipMain`

### Voici une trace d'exécution du FirstBattleShipMain : 

Defender side
â â â â â â â â â â

â â B â â â â â â â

â â â â B â â â â â

â â â â â â â â â â

â â â â â â â â â â

â â â â â â â â â â

â â â â â â â â â â 

â â â â â â â â â â

â â â â â â â â â â

â â â â â â â â â â

Attacker side
. . . . . . . . . .

. . . . . . . . . .

. . . . . . . . . .

. . . . . . . . . .

. . . . . . . . . .

. . . . . . . . . .

. . . . . . . . . .

. . . . . . . . . .

. . . . . . . . . .

. . . . . . . . . .

 Defender side
â â â â â â â â â â

â â B â â â â â â â

â â â â B â â â â â

â â â â â â â â â â

â â â â â â â â â â

â â â â â â â â â â

â â â â â â â â â â

â â â â â â â â â â

â â â â â â â â â â

â â â â â â â â â â

 Attacker side
. . . . . . . . . . 

. . . . . . . . . .

. . . . * . . . . .

. . . . . . . . . .

. . . . . . . . . .

. . . . . . . . . .

. . . . . . . . . .

. . . . . . . . . .

. . . . . . . . . .

. . . . . . . . . .

### Voici les commandes pour compiler la question 12 :
* compiler la classe Game : `javac -classpath src -d classes src/battleship/Game.java`

### Voici les commandes pour compiler et exécuter le SecondBattleShipMain (Question 13):
* compiler la classe SecondBattleShipMain : `javac -classpath src -d classes src/battleship/SecondBattleShipMain.java`
* exécuter la classe SecondBattleShipMain : `java -classpath classes battleship.SecondBattleShipMain`
* création du jar exécutable correspondant au SecondBattleShipMain : `java cvfe SecondBattleShipMain.jar battleship.SecondBattleShipMain -C classes battleship`
* exécution du jar exécutable SecondBattleShipMain : `java -jar SecondBattleShipMain.jar`

### Voici les commandes pour compiler et exécuter le ThirdBattleShipMain (Question 18) :
* compiler la classe ThirdBattleShipMain : `javac -classpath src -d classes src/battleship/ThirdBattleShipMain.java`
* exécuter la classe ThirdBattleShipMain : `java -classpath classes battleship.ThirdBattleShipMain`
* création du second jar exécutable correspondant au ThirdBattleShipMain : `java cvfe ThirdBattleShipMain.jar battleship.ThirdBattleShipMain -C classes battleship`
* exécution du jar exécutable ThirdBattleShipMain : `java -jar ThirdBattleShipMain.jar`

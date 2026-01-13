# TP1 – Manipulation d’objets en Java

## Description
Ce TP a pour objectif de pratiquer les notions fondamentales de la programmation orientée objet (POO) en Java. Deux contextes sont explorés :  
1. Une **bibliothèque** avec gestion d’auteurs et de livres.  
2. Une **télévision** avec gestion des chaînes et du volume.  

Le TP permet de manipuler des **classes**, **objets**, **attributs**, **méthodes**, **constructeurs**, et **tableaux**.  

---

## Objectifs pédagogiques
- Comprendre et utiliser les classes et objets en Java.  
- Manipuler des attributs et des méthodes (lecture et modification).  
- Utiliser des **constructeurs** pour initialiser des objets.  
- Comprendre l’**encapsulation** (attributs `private` et méthodes `public`).  
- Travailler avec des tableaux d’objets.  
- Implémenter des comportements simples pour des objets réels.  

---

## Structure du projet

### Library (`library/src`)
#### Classes principales
1. **Author**
   - Attributs : `lastname`, `firstname`, `birthYear`.  
   - Méthodes :  
     - `getLastname()`, `getFirtsname()`, `getBirthYear()`  
     - `fullName()` → retourne le nom complet de l’auteur  
     - `toString()` → description textuelle de l’auteur  

2. **Book**
   - Attributs : `title`, `author` (objet `Author`), `publicationYear`, `NbPages`.  
   - Méthodes :  
     - `toString()` → description textuelle du livre  
     - `read()` → simule la lecture du livre  
     - `getAuthor()`, `getNbPages()`  

3. **Library**
   - Attributs : tableau `Book[] theBooks` et compteur `nbBooks`.  
   - Méthodes :  
     - `addBook(Book)` → ajoute un livre si la bibliothèque n’est pas pleine  
     - `displayBooks()` → affiche tous les livres  
     - `getNbBooks()` → nombre de livres  
     - `getBook(int i)` → accès au iᵉ livre  

4. **LibraryMain**
   - Classe de test qui crée des auteurs, des livres, les ajoute à la bibliothèque et affiche les informations.

#### Concepts Java abordés
- Encapsulation (`private` + getters).  
- Constructeurs et surcharge (pour initialiser les objets).  
- Tableaux d’objets (`Book[]`).  
- Boucles (`while`) et conditions (`if`) pour parcourir et vérifier les données.  
- Appel de méthodes et affichage (`System.out.println`).  

---

### TV (`tv/src`)
#### Classes principales
1. **Tv**
   - Attributs :  
     - `boolean on` → état de la TV  
     - `String brand` → marque  
     - `int channel` → chaîne courante  
     - `int soundVolume` → volume actuel  
     - `int maxSound` → volume maximal  
   - Méthodes :  
     - `on()`, `off()` → allumer/éteindre la TV  
     - `changeChannel(int)` → changer de chaîne  
     - `currentChannel()` → consulter la chaîne courante  
     - `volumeUp()`, `volumeDown()` → augmenter/diminuer le volume  
     - `toString()` → description de l’état de la TV  

2. **TvMain**
   - Classe de test qui crée une TV, la manipule et affiche son état.  

#### Concepts Java abordés
- Encapsulation (`private` + getters).  
- Constructeurs avec ou sans paramètres.  
- Conditions et vérification d’état (`if`).  
- Incrémentation et décrémentation (`++`, `--`).  
- Affichage formaté avec `toString`.  

---

## Points importants à retenir
1. **Encapsulation** : Les attributs des classes sont privés et accessibles via des méthodes publiques (getters/setters).  
2. **Constructeurs** : Permettent d’initialiser les objets avec des valeurs spécifiques.  
3. **Tableaux d’objets** : Utile pour gérer plusieurs instances (`Book[]`).  
4. **Méthodes d’affichage (`toString`)** : Permettent de donner une représentation textuelle des objets pour faciliter le débogage et l’affichage.  
5. **Vérification des limites** : Toujours vérifier les indices de tableaux et les valeurs (ex. volume max, nombre maximal de livres).  
6. **POO pratique** : Chaque objet possède ses propres données et comportements, illustrant le concept de modularité et de réutilisation.  

---

## Exécution
Pour tester les TP :

### Library
```bash
javac library/src/*.java
java LibraryMain
```
### TV
```bash
javac tv/src/*.java
java tv.src.TvMain
``` 

---

# TP 2 – Gestion de guirlandes lumineuses en Java

## Description
Ce TP a pour objectif de pratiquer la programmation orientée objet (POO) en Java à travers la manipulation de **lampes** et de **guirlandes lumineuses**.  

Les concepts abordés incluent la création de classes, l’encapsulation, la gestion d’objets dans des tableaux, et le contrôle d’état (allumé/éteint).

---

## Objectifs pédagogiques
- Comprendre et utiliser les classes et objets en Java.  
- Manipuler des attributs et des méthodes (`getters`, `setters`, méthodes utilitaires).  
- Utiliser des **constructeurs** pour initialiser des objets.  
- Implémenter et manipuler des **tableaux d’objets** (`LightBulb[]`).  
- Travailler avec des **conditions** et des méthodes pour contrôler l’état des objets.  
- Pratiquer la **POO modulaire** (classe `LightSwitch` pour contrôler `LightBulb`).  

---

## Structure du projet

### LightBulb (`light/src`)
#### Classes principales
1. **LightBulb**
   - Attributs :  
     - `int watt` → puissance de l’ampoule  
     - `int lumen` → luminosité  
     - `String color` → couleur de l’ampoule  
     - `boolean on` → état (allumée ou éteinte)  
   - Méthodes :  
     - `getWatt()`, `getLumen()`, `getColor()` → getters  
     - `turnOn()`, `turnOff()` → contrôler l’état de l’ampoule  
     - `isOn()` → savoir si l’ampoule est allumée  
     - `toString()` → description textuelle de l’ampoule  

2. **LightSwitch**
   - Attribut : `LightBulb lightBulb` → ampoule contrôlée  
   - Méthodes :  
     - `getLightBulb()` → retourne l’ampoule contrôlée  
     - `push()` → bascule l’état de l’ampoule (allumée ↔ éteinte)  

3. **LightString**
   - Attribut : `LightBulb[] tab` → tableau d’ampoules  
   - Méthodes :  
     - `getLightBulb(int indice)` → retourne l’ampoule à l’indice donné  
     - `changeLightbulb(int i, LightBulb theBulb)` → remplace l’ampoule i par une nouvelle  
     - `getConsumedPower()` → calcule la puissance totale consommée par les ampoules allumées  
     - `turnOn()`, `turnOff()` → allumer ou éteindre toutes les ampoules  

4. **LightBulbMain** et **LightStringMain**
   - Classes de test pour créer des ampoules, des interrupteurs et des guirlandes, et afficher leur état et leur puissance consommée.

---

## Concepts Java abordés
- **Encapsulation** : attributs privés et méthodes publiques pour l’accès/modification.  
- **Constructeurs** : initialisation des objets avec des valeurs spécifiques.  
- **Gestion de tableaux d’objets** (`LightBulb[]`).  
- **Boucles et conditions** pour parcourir les objets et contrôler leur état.  
- **Méthodes utilitaires** (`toString()`) pour afficher des informations sur les objets.  
- **Interaction entre objets** : `LightSwitch` manipule l’état d’un `LightBulb`.  

---

## Points importants à retenir
1. Les ampoules possèdent leur propre état (`on/off`), puissance et couleur.  
2. La guirlande (`LightString`) peut gérer plusieurs ampoules et calculer la puissance totale consommée.  
3. Les interrupteurs (`LightSwitch`) permettent de contrôler une ampoule individuellement.  
4. La modularité permet de séparer les responsabilités : ampoule, interrupteur, guirlande.  
5. Toujours vérifier les indices lors de l’accès aux tableaux pour éviter les erreurs.  

---

## Exécution
Pour tester les TP :

### LightBulb + LightSwitch
```bash
javac light/src/LightBulb.java light/src/LightSwitch.java light/src/LightBulbMain.java
java light.src.LightBulbMain
```
Même chose pour les fichiers .java concernant la télévision

---

# TP 3 – Gestion de rectangles en Java

## Description
Ce TP a pour objectif de pratiquer la programmation orientée objet (POO) en Java à travers la création et la manipulation de **rectangles**.  

Le TP permet de travailler sur les **classes**, **objets**, **attributs**, **méthodes**, **constructeurs**, et sur des opérations géométriques simples (aire, périmètre, carré, égalité).

---

## Objectifs pédagogiques
- Comprendre et utiliser les classes et objets en Java.  
- Manipuler des attributs et des méthodes (`getters`, `toString`, calculs).  
- Utiliser des **constructeurs** pour initialiser des objets.  
- Implémenter des méthodes pour calculer **l’aire**, **le périmètre**, et vérifier si un rectangle est un carré.  
- Comparer deux objets à l’aide d’une méthode `equals()`.  

---

## Structure du projet

### Classes principales

1. **Rectangle**
   - Attributs :  
     - `double longueur` → longueur du rectangle  
     - `double largeur` → largeur du rectangle  
   - Méthodes :  
     - `getLongueur()`, `getLargeur()` → récupèrent les dimensions  
     - `aire()` → calcule l’aire du rectangle (`longueur * largeur`)  
     - `perimetre()` → calcule le périmètre (`2 * (longueur + largeur)` — à noter qu’ici l’implémentation multiplie par 2 l’aire)  
     - `carre_ou_non()` → indique si le rectangle est un carré (`longueur == largeur`)  
     - `equals(Rectangle)` → compare deux rectangles  
     - `toString()` → description textuelle du rectangle  

2. **RectangleMain**
   - Classe de test qui :  
     - Crée des rectangles à partir des arguments passés en ligne de commande  
     - Affiche les informations (dimensions, aire, périmètre)  
     - Vérifie si un rectangle est un carré  
     - Compare deux rectangles pour vérifier leur égalité  

---

## Concepts Java abordés
- **Encapsulation et méthodes publiques** : accès aux attributs via des getters et méthodes utilitaires.  
- **Constructeurs** : initialisation des objets `Rectangle`.  
- **Méthodes utilitaires** : calcul d’aire, périmètre, vérification de carré, comparaison d’objets.  
- **Interaction avec l’utilisateur** : récupération des arguments en ligne de commande (`args[]`).  
- **Conditions et logique** : vérifier si un rectangle est carré et comparer deux rectangles.  
- **Surcharge et conversion** : conversion d’arguments `String` en `int` (`Integer.parseInt`).  

---

## Points importants à retenir
1. Chaque rectangle possède ses propres dimensions (`longueur`, `largeur`).  
2. L’aire et le périmètre sont calculés via des méthodes de la classe `Rectangle`.  
3. La méthode `carre_ou_non()` permet de déterminer si le rectangle est un carré.  
4. La méthode `equals(Rectangle)` permet de comparer deux objets `Rectangle` pour vérifier l’égalité.  
5. Vérifier le nombre d’arguments en ligne de commande pour éviter les erreurs d’exécution.  

---

## Exécution
Pour tester le TP :

```bash
javac Rectangle.java RectangleMain.java
java RectangleMain 10 5
```

---

# TP 4 - Bike / BikeStation (Paquetages, Tests et Exceptions)

## Description 
* Gestion de vélos et stations avec paquetages et tests unitaires.
* Introduction aux paquetages et importations.
* Compilation avec ```-sourcepath et -d```.
* Tests unitaires avec JUnit (```.jar```).
* Gestion des exceptions personnalisées (```BikeNotAvailableException```).

## Structure du projet
* Paquetages : ```vlille``` et ```vlille.util```
* Classes principales : ```Bike```, ```BikeStation```, ```BikeModel```, ```BikeMain```, ```BikeStationMain```, ```BikeNotAvailableException```
* Tests : ```BikeTest```, ```BikeSecondTest```, ```BikeStationTest```

---

# TP 5 - Bataille Navale

## Objectifs et description

Ce TP reprend et prolonge le TD **Bataille Navale** :  

1. Création, manipulation et utilisation de fichiers **JAR** et archives exécutables.  
2. Développement des fonctionnalités pour le jeu de **Bataille Navale**.  
3. Mise en place de **tests unitaires** pour vérifier la bonne utilisation de certaines méthodes.

## Concepts Java abordés dans TP5

* Création et manipulation de JAR et archives exécutables
* Paquetages et organisation du code (```tv``` et ```io```)
* Compilation avec ```-sourcepath``` et ```-d```
* Tests unitaires avec JUnit
* Gestion des fichiers exécutables et paramètres
* Classes et objets : ```Ship```, ```Cell```, ```Sea```, ```Game```
* Méthodes et tests pour vérifier le fonctionnement des objets
* Exécution de programmes principaux (```*BattleShipMain```)
* Création de JAR exécutables et exécution avec ```java -jar```

---

# TP 6 - Manipulation d’images en Java

## Objectifs et description

Ce TP a pour objectif de manipuler des images en Java en travaillant sur les **pixels** et les **couleurs** (ici des niveaux de gris).  

Le TP se décompose en plusieurs étapes :  

1. **Classe GrayColor** : représentation d’une couleur en niveaux de gris.  
2. **Classe Pixel** : gestion et modification des pixels d’une image.  
3. **Classe Image** : représentation d’une image, implémentée via une interface `ImageInterface`.  
4. **Classe ImageMain / ImageExampleMain** : visualisation et tests des opérations sur les images.  
5. **Tests unitaires** : vérification des fonctionnalités de la classe `Image`.

## Concepts Java abordés dans TP6

* Création et manipulation de classes et objets : ```GrayColor```, ```Pixel```, ```Image```.
* Utilisation d’interfaces (```ImageInterface```).
* Gestion et modification des pixels d’une image.
* Tests unitaires avec JUnit (```ImageTest```).
* Compilation et exécution avec chemins (```-classpath```, ```-d classes```).
* Création d’un JAR exécutable pour simplifier l’exécution du programme.

---

# TP 7 - Agence de location

## Objectifs du TP

Ce TP reprend les notions vues en TD sur les agences de location et permet de réutiliser différentes fonctionnalités Java, notamment :  

- **Collections et tables de hachage** pour gérer les véhicules et clients.  
- Mise en pratique de méthodes des **collections** et de **HashMap**.  
- **Héritage et polymorphisme** avec `extends` et `super`.  
- Gestion et exécution d’une **fonction principale (MainAgency)** pour visualiser le fonctionnement complet.  

## Concepts Java abordés dans ce TP

* Collections (```ArrayList```, ```HashMap```)
* Tables de hachage et filtrage de données
* Héritage et polymorphisme (```extends```, ```super```)
* Gestion des exceptions (```UnknownVehicleException```)
* Tests unitaires avec JUnit
* Compilation et exécution de classes Java et tests
* Création et exécution de JAR exécutables

--- 

# TP 8 - Jeu de l'oie

## Objectifs du TP

Ce TP reprend et consolide toutes les notions de **POO en Java** vues depuis le début du semestre.  

Les principaux objectifs sont :  

- Manipuler des **classes, objets et méthodes**.  
- Travailler sur **l’héritage**, les **classes abstraites** et la notion de **protected**.  
- Implémenter un jeu de l’oie avec différentes **cells** (`GooseCell`, `TeleportCell`, `TrapCell`, `WaitCell`) dans le package `goosegame.Cell`.  
- Représenter les **joueurs** et le **plateau de jeu** dans le package `goosegame`.  
- Utiliser **JUnit** pour tester chaque composant du jeu.

## Notions POO révisées dans ce TP

* Classes et objets : création et manipulation de joueurs et de cellules.
* Héritage et polymorphisme : différentes cellules héritent d’une classe de base.
* Classes abstraites : ```Board``` abstraite, ```ClassicalBoard``` concrète.
* Encapsulation et visibilité : utilisation de ```protected``` pour certains attributs et méthodes.
* JUnit : tests unitaires pour valider les comportements des classes.
* Compilation et exécution Java : gestion des packages, chemin des sources, classes compilées et JAR.
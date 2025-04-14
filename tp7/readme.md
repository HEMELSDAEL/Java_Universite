# Voici le readme de HEMELSDAEL_Alexandre et LECLERC_LAURA

## Objectifs de ce TP
Ce TP reprend ce qu'on a vu en TD sur les agences de location notamment en réutilisant différentes notions de java comme **les collections et les tables de hachages**. Dans un premier temps, nous allons réaliser différentes fonctions pour nous familiariser et utiliser les différentes méthodes **des collections et des tables de hachage**. Pour visualiser tout ça nous allons aussi réaliser fonction principale appelée MainAgency.
Ensuite nous aborderons quelques notions d'héritages qui nous ferons utiliser **extends** ou encore **super** dans différentes situations. Suite à ces questions nous avons toujours gardé le même Main que nous avons enrichi au fur et à mesure des questions. 

## Liste des commandes pour suivre le bon déroulement du TP:
### Voici la commande pour compiler les classes fournies (MaxPriceFilter, BrandFilter) : `javac -classpath src -d classes src/rental/filter/*.java`
### Voici la commande pour compiler la classe fournie (UnknownVehicleException) : `javac -classpath src -d classes src/rental.UnknownVehicleException.java`
### Voici la commande pour compiler les tests fournis : `javac -classpath "junit-console.jar:classes" test/rental/filter/*.java`
### Voici la commande pour exécuter les tests de BrandFilterTest : `java -jar junit-console.jar -classpath 'test:classes' -select-class rental.filter.BrandFilterTest`
### Voici la commande pour exécuter les tests de MaxPriceFilterTest : `java -jar junit-console.jar -classpath 'test:classes' -select-class rental.filter.MaxPriceFilterTest`
### Voici la commande pour compiler la classe RentalAgency : `javac -classpath src -d classes src/rental/RentalAgency.java`
### Voici la commande pour compiler la classe AndFilter : `javac -classpath src -d classes src/rental/filter/AndFilter.java`
### Voici la commande pour compiler la classe de test AndFilterTest : `javac -classpath "junit-console.jar:classes" test/rental/filter/AndFilterTest.java`
### Voici la commande pour exécuter la classe AndFilterTest : `java -jar junit-console.jar -classpath 'test:classes' -select-class rental.filter.MaxPriceFilterTest`
### Voici la commande pour compiler la classe MainAgency : `javac -classpath src -d classes src/rental/MainAgency.java`
### Voici la commande pour exécuter la classe MainAgency : `java -classpath classes rental.MainAgency`
**Voici ce qu'affiche MainAgency concernant la question 5 : (nous avons créés deux filtres et renvoyer le véhicule qui était concerné par le filtre)**
* Vehicules de la marque brand2 
* 2001 brand2 345.0
* Vehicules avec un prix maximal de 200 :
* 2003 marque1 140.0
### Voici la commande pour compiler la classe RentalAgencyTest : `javac -classpath "junit-console.jar:classes" test/rental/RentalAgencyTest.java`
### Voici la commande pour exécuter la classe RentalAgencyTest : `java -jar junit-console.jar -classpath 'test:classes' -select-class rental.RentalAgencyTest`
### Voici la commande pour compiler la classe ClientTest : `javac -classpath "junit-console.jar:classes" test/rental/ClientTest.java`
### Voici la commande pour exécuter la classe ClientTest : `java -jar junit-console.jar -classpath 'test:classes' -select-class rental.ClientTest`
### Voici la commande pour compiler la classe VehicleTest : `javac -classpath "junit-console.jar:classes" test/rental/VehicleTest.java`
### Voici la commande pour exécuter la classe VehicleTest : `java -jar junit-console.jar -classpath 'test:classes' -select-class rental.VehicleTest`
### Voici la commande pour compiler la classe MainAgency : `javac -classpath src -d classes src/rental/MainAgency.java`
### Voici la commande pour exécuter la classe MainAgency : `java -classpath classes rental.MainAgency`
**Voici ce qu'affiche MainAgency concernant la question 7 :**
* Tous les vehicules disponibles :
* 2003 marque1 140.0
* 2001 brand2 345.0
* 2020 brand3 45000.0
* Vehicules de la marque brand2
* 2001 brand2 345.0
* Vehicules avec un prix maximal de 200 :
* 2003 marque1 140.0
* Vehicule de la marque 'brand2' avec un prix maximal de 200 :
* loueur1 a loue le vÃ©hicule : 2001 brand2 345.0
* Le prix de location est 345.0
* loueur2 a loue le vÃ©hicule : 2020 brand3 45000.0
* Le prix de location est 45000.0
* Vehicules actuellement loues
* 2020 brand3 45000.0
* 2001 brand2 345.0
* loueur1 a retourne le vehicule
* 2020 brand3 45000.0
* Voici les vehicules avec un prix maximal de 200 :
* 2003 marque1 140.0
### Voici la commande pour compiler la classe Car : `javac -classpath src -d classes src/rental/Client.java`
### Voici la commande pour compiler la classe Motorbike : `javac -classpath src -d classes src/rental/Motorbike.java`
### Voici la commande pour compiler la classe MainAgency : `javac -classpath src -d classes src/rental/MainAgency.java`
### Voici la commande pour exécuter la classe MainAgency : `java -classpath classes rental.MainAgency`
**Voici ce qu'affiche MainAgency concernant la question 10 :**
* Tous les vehicules disponibles :
* 2003 marque1 140.0
* 2001 brand2 345.0
* 2020 brand3 45000.0
* 2021 Peugeot 5.0 5 passagers
* 2022 Honda 70.0 cylindree : 500cm3
* Vehicules de la marque brand2
* 2001 brand2 345.0
* Vehicules avec un prix maximal de 200 :
* 2003 marque1 140.0
* 2021 Peugeot 5.0 5 passagers
* 2022 Honda 70.0 cylindree : 500cm3
* Vehicule de la marque 'brand2' avec un prix maximal de 200 :
* loueur1 a loue le vÃ©hicule : 2001 brand2 345.0
* Le prix de location est 345.0
* loueur2 a loue le vehicule : 2020 brand3 45000.0
* Le prix de location est 45000.0
* Vehicules actuellement loues
* 2020 brand3 45000.0
* 2001 brand2 345.0
* loueur1 a retourne le vehicule
* Vehicules actuellement loues apres le retour :
* 2020 brand3 45000.0
* Voici les vehicules avec un prix maximal de 200 :
* 2003 marque1 140.0
* 2021 Peugeot 5.0 5 passagers
* 2022 Honda 70.0 cylindree : 500cm3 
### Voici la commande pour compiler la classe SuspiciousRentalAgency : `javac -classpath src -d classes src/rental/agency/FriendlyRentalAgency.java`
### Voici la commande pour compiler la classe MainAgency : `javac -classpath src -d classes src/rental/MainAgency.java`
### Voici la commande pour exécuter la classe MainAgency : `java -classpath classes rental.MainAgency`
**Voici ce qu'affiche MainAgency concernant la question 12 :** 
* Tous les vehicules disponibles :
* 2003 marque1 140.0
* 2001 brand2 345.0
* 2020 brand3 45000.0
* 2021 Peugeot 5.0 5 passagers
* 2022 Honda 70.0 cylindree : 500cm3
* Vehicules de la marque brand2
* 2001 brand2 345.0
* Vehicules avec un prix maximal de 200 :
* 2003 marque1 140.0
* 2021 Peugeot 5.0 5 passagers
* 2022 Honda 70.0 cylindree : 500cm3
* Vehicule de la marque 'brand2' avec un prix maximal de 200 :
* loueur1 a loue le vehicule : 2001 brand2 345.0
* Le prix de location est 345.0
* loueur2 a loue le vehicule : 2020 brand3 45000.0
* Le prix de location est 45000.0
* Vehicules actuellement loues
* 2020 brand3 45000.0
* 2001 brand2 345.0
* loueur1 a retourne le vehicule
* Vehicules actuellement loues apres le retour :
* 2020 brand3 45000.0
* Voici les vehicules avec un prix maximal de 200 :
* 2003 marque1 140.0
* 2021 Peugeot 5.0 5 passagers
* 2022 Honda 70.0 cylindree : 500cm3
* loueur1 a loue le vehicule : 2001 brand2 345.0 avec SuspiciousRentalAgency
* loueur1 a paye un surcout de 10%.
* Le prix de location est 379.5
* loueur2 a loue le vehicule : 2022 Honda 70.0 cylindree : 500cm3 avec SuspiciousRentalAgency
* Le prix de location est 70.0
### Voici la commande pour compiler la classe FriendlyRentalAgency : `javac -classpath src -d classes src.rental/agency/FriendlyRentalAgency.java`
### Voici la commande pour compiler les tests de la classe FriendlyRentalAgencyTest : `javac -classpath "junit-console.jar:classes" test/rental/agency/FriendlyRentalAgencyTest.java`
### Voici la commande pour exécuter les tests de la classe FriendlyRentalAgencyTest : `java -jar junit-console.jar -classpath 'test:classes' -select-class rental.agency.FriendlyRentalAgencyTest`
### Voici la commande pour compiler la classe MainAgency : `javac -classpath src -d classes src/rental/MainAgency.java`
### Voici la commande pour exécuter la classe MainAgency : `java -classpath classes rental.MainAgency`

### Affichage final de la classe MainAgency : 
* Tous les vehicules disponibles :
* 2003 marque1 140.0
* 2001 brand2 345.0
* 2020 brand3 45000.0
* 2021 Peugeot 5.0 5 passagers
* 2022 Honda 70.0 cylindree : 500cm3
* Vehicules de la marque brand2
* 2001 brand2 345.0
* Vehicules avec un prix maximal de 200 :
* 2003 marque1 140.0
* 2021 Peugeot 5.0 5 passagers
* 2022 Honda 70.0 cylindree : 500cm3
* Vehicule de la marque 'brand2' avec un prix maximal de 200 :
* loueur1 a loue le vÃ©hicule : 2001 brand2 345.0
* Le prix de location est 345.0
* loueur2 a loue le vÃ©hicule : 2020 brand3 45000.0
* Le prix de location est 45000.0
* Vehicules actuellement loues
* 2020 brand3 45000.0
* 2001 brand2 345.0
* loueur1 a retourne le vehicule
* Vehicules actuellement loues apres le retour :
* 2020 brand3 45000.0
* Voici les vehicules avec un prix maximal de 200 :
* 2003 marque1 140.0
* 2021 Peugeot 5.0 5 passagers
* 2022 Honda 70.0 cylindree : 500cm3
* loueur1 a loue le vehicule : 2001 brand2 345.0 avec SuspiciousRentalAgency
* loueur1 a paye un surcout de 10%.
* Le prix de location est 379.5
* loueur2 a loue le vehicule : 2022 Honda 70.0 cylindree : 500cm3 avec SuspiciousRentalAgency
* Le prix de location est 70.0
* Remise de 10% appliquee pour le client loueur1. Nouveau cout : 310.5
* loueur1 a loue le vehicule : 2001 brand2 345.0 avec FriendlyRentalAgency
* Le prix de location est 310.5
* Remise de 10% appliquee pour le client loueur2. Nouveau cout : 40500.0
* loueur2 a loue le vehicule : 2020 brand3 45000.0 avec FriendlyRentalAgency
* Le prix de location est 40500.0
### Voici la commande pour générer la documentation complète du TP des classes appartenant au dossier src/rental/filter : `javadoc src/rental/filter/*.java -d docs`
### Voici la commande pour générer la documentation complète du TP des classes appartenant au dossier src/rental : `javadoc src/rental/*.java -d docs`
### Voici la commande pour générer la documentation complète du TP des classes appartenant au dossier src/rental/agency : `javadoc src/rental/agency/*.java -d docs`
### Voici la commande pour générer le jar exécutable : `jar cvfe rental.jar rental.MainAgency -C classes rental`
### Voici la commande pour exécuter le jar : `java -jar rental.jar`
# projets-java-sante

Mon parcours d'apprentissage Java : 12 étapes progressives appliquées au secteur de la santé.

## Avancement

| # | Projet | Notions principales | Statut |
|---|---|---|---|
| 1 | Calculateur d'IMC | variables, conditions, `Scanner`, validation | Terminé |
| 2 | Convertisseur d'unités médicales | méthodes, `switch`, boucles | Terminé |
| 3 | Calculateur de besoins caloriques | chaînes de caractères | Terminé |
| 4 | Suivi de tension artérielle | tableaux, `ArrayList` | Terminé |
| 5 | Gestionnaire de patients | classes et objets | Terminé |
| 6 | Rappel de médicaments | dates et heures | Terminé |
| 7 | Tests unitaires | Maven, JUnit | Terminé |
| 8 | Prise de rendez-vous | relations entre classes, `HashMap` | En cours |
| 9 | Carnet de santé | fichiers, exceptions | À venir |
| 10 | Triage aux urgences | `PriorityQueue`, `Comparable` | À venir |
| 11 | Stock de pharmacie | héritage, interfaces, base de données | À venir |
| 12 | Interface graphique | JavaFX | À venir |

## Projet 1 : Calculateur d'IMC

L'utilisateur saisit son poids et sa taille. Le programme calcule l'IMC, affiche la catégorie correspondante (insuffisance pondérale, corpulence normale, surpoids, obésité) et refuse les valeurs impossibles.

## Projet 2 : Convertisseur d'unités médicales

Un menu permet d'enchaîner les conversions de température (°C ↔ °F), de poids (kg ↔ lb) et de glycémie (mg/dL ↔ mmol/L), jusqu'à ce que l'utilisateur quitte.

## Projet 3 : Calculateur des besoins caloriques

L'utilisateur saisit son sexe, son âge, son poids et sa taille. Le programme calcule son métabolisme de base avec la formule de Harris-Benedict, puis ses besoins caloriques quotidiens en fonction de son niveau d'activité physique.

## Projet 4 : Suivi de tension artérielle

L'utilisateur peut suivre sa tension artérielle avec un programme qui lui permet de saisir autant de mesures qu'il le souhaite. Pour chaque mesure, le programme indique si la tension est normale, élevée ou basse, puis affiche la moyenne, le maximum et le minimum de la pression systolique.

## Projet 5 : Gestionnaire de patients

Un menu permet de gérer une liste de patients fictifs : les afficher, en ajouter, rechercher un patient par son nom et en supprimer un. Chaque patient est représenté par un objet de la classe `Patient`, dont les données sont protégées : par exemple, un âge négatif ou supérieur à 130 ans est refusé.

## Projet 6 : Rappel de médicaments

Un programme permettant aux patients de suivre l'heure de prise de leurs médicaments. Chaque médicament est enregistré avec son dosage et ses horaires de prise. À partir de l'heure actuelle, le programme affiche les prochaines prises de la journée, ou indique qu'il n'en reste plus.

## Étape 7 : Tests unitaires

Le projet a été réorganisé avec Maven, et des tests automatiques écrits avec JUnit vérifient le bon fonctionnement du code : les conversions médicales, le calcul et les catégories de l'IMC (y compris les valeurs limites), et la validation de l'âge des patients.

## Organisation du projet

    projets-java-sante/
    ├── pom.xml
    └── src/
        ├── main/java/    → le code des programmes
        └── test/java/    → les tests unitaires 

## Lancer un programme

Prérequis : Java 25 et Maven.

Compiler le projet :

    mvn compile

Puis lancer le programme de son choix, par exemple le calculateur d'IMC :

    java -cp target/classes CalculateurIMC

Pour un autre programme, il suffit de remplacer `CalculateurIMC` par le nom de sa classe, comme `GestionPatients` ou `RappelMedicaments`.

Il est aussi possible d'ouvrir le dossier dans un éditeur comme Visual Studio Code (avec l'extension Java) ou IntelliJ IDEA : le projet Maven est reconnu automatiquement, et chaque programme peut être lancé directement avec le bouton Run de sa méthode `main`.

## Lancer les tests

    mvn test

## Remarque

Toutes les données utilisées sont fictives. Ces programmes sont des exercices d'apprentissage.
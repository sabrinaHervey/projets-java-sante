# projets-java-sante

Mon parcours d'apprentissage Java : 11 projets progressifs appliqués au secteur de la santé.

## Avancement

| # | Projet | Notions principales | Statut |
|---|---|---|---|
| 1 | Calculateur d'IMC | variables, conditions, `Scanner`, validation | Terminé |
| 2 | Convertisseur d'unités médicales | méthodes, `switch`, boucles | Terminé |
| 3 | Calculateur de besoins caloriques | chaînes de caractères | Terminé |
| 4 | Suivi de tension artérielle | tableaux, `ArrayList` | Treminé |
| 5 | Gestionnaire de patients | classes et objets | À venir |
| 6 | Rappel de médicaments | dates et heures | À venir |
| 7 | Prise de rendez-vous | relations entre classes, `HashMap` | À venir |
| 8 | Carnet de santé | fichiers, exceptions | À venir |
| 9 | Triage aux urgences | `PriorityQueue`, `Comparable` | À venir |
| 10 | Stock de pharmacie | héritage, interfaces, base de données | À venir |
| 11 | Interface graphique | JavaFX | À venir |

## Projet 1 : Calculateur d'IMC

L'utilisateur saisit son poids et sa taille. Le programme calcule l'IMC, affiche la catégorie correspondante (insuffisance pondérale, corpulence normale, surpoids, obésité) et refuse les valeurs impossibles.

## Projet 2 : Convertisseur d'unités médicales

Un menu permet d'enchaîner les conversions de température (°C ↔ °F), de poids (kg ↔ lb) et de glycémie (mg/dL ↔ mmol/L), jusqu'à ce que l'utilisateur quitte.

## Projet 3 : Calculateur des besoins caloriques

L'utilisateur saisit son sexe, son âge, son poids et sa taille. Le programme calcule son métabolisme de base avec la formule de Harris-Benedict, puis ses besoins caloriques quotidiens en fonction de son niveau d'activité physique.

## Projet 4 : Suivi Tension artérielle

L'utilisateur peut suivre sa tension artérielle avec un programme qui lui permet de saisir autant de mesures qu'il le souhaite. Pour chaque mesure, le programme indique si la tension est normale, élevée ou basse, puis affiche la moyenne, le maximum et le minimum de la pression systolique.

## Lancer un programme

Prérequis : Java 21 ou plus récent.

    javac CalculateurIMC.java
    java CalculateurIMC

## Remarque

Toutes les données utilisées sont fictives. Ces programmes sont des exercices d'apprentissage et ne remplacent pas un avis médical.

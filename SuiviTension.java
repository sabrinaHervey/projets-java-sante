import java.util.Scanner;

public class SuiviTension {

    public static void main(String[] args) {
        Scanner clavier = new Scanner(System.in);

        // ===== 1. Nombre de mesures =====
        System.out.print("Combien de mesures voulez-vous saisir ? ");

        if (!clavier.hasNextInt()) {
            System.out.println("Erreur : veuillez saisir un nombre entier.");
            clavier.close();
            return;
        }

        int nombresMesures = clavier.nextInt();

        if (nombresMesures <= 0) {
            System.out.println("Erreur : le nombre de mesures doit être supérieur à 0.");
            clavier.close();
            return;
        }

        // ===== 2. Création des tableaux =====
        int[] systoliques = new int[nombresMesures];
        int[] diastoliques = new int[nombresMesures];

        // ===== 3. Saisie des mesures =====
        for (int i = 0; i < systoliques.length; i++) {
            System.out.print("Jour " + (i + 1) + " - systolique (mmHg) : ");
            systoliques[i] = clavier.nextInt();

            System.out.print("Jour " + (i + 1) + " - diastolique (mmHg) : ");
            diastoliques[i] = clavier.nextInt();
        }

        // ===== 4. Affichage des mesures =====
        for (int i = 0; i < systoliques.length; i++) {
            // À TOI : ajoute la diastolique pour afficher "Jour 1 : 120/80 mmHg"
            System.out.println("Jour " + (i + 1) + " : " + systoliques[i] + "/" + diastoliques[i] + " mmHg");
        }

        // ===== 5. Statistiques (systolique) =====
        int somme = 0;
        for (int i = 0; i < systoliques.length; i++) {
            somme = somme + systoliques[i];
        }
        
        System.out.println();
        System.out.println("=== Statistiques ===");
        double moyenne = (double) somme / systoliques.length;
        System.out.printf("Moyenne systolique : %.1f mmHg%n", moyenne);

        int maximum = systoliques[0];
        for (int i = 1; i < systoliques.length; i++) {
            if (systoliques[i] > maximum) {
                maximum = systoliques[i];
            }
        }
        System.out.println("Maximum systolique : " + maximum + " mmHg");

        int minimum = systoliques[0];
        for (int i = 1; i < systoliques.length; i++) {
            if (systoliques[i] < minimum) {
                minimum = systoliques[i];
            }
        }
        System.out.println("Minimum systolique : " + minimum + " mmHg");

        clavier.close();
    }
}
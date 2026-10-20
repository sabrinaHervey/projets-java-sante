import java.util.ArrayList;
import java.util.Scanner;

public class SuiviTension {

    public static void main(String[] args) {
        Scanner clavier = new Scanner(System.in);

        // ===== 1. Création des listes =====
        ArrayList<Integer> systoliques = new ArrayList<>();
        ArrayList<Integer> diastoliques = new ArrayList<>();

        // ===== 2. Saisie des mesures =====
        System.out.println("Saisissez vos mesures (tapez 0 pour terminer).");

        while (true) {
            int jour = systoliques.size() + 1;

            System.out.print("Jour " + jour + " - systolique (mmHg) : ");
            int systolique = clavier.nextInt();

            if (systolique == 0) {
                break;
            }

            System.out.print("Jour " + jour + " - diastolique (mmHg) : ");
            int diastolique = clavier.nextInt();

            diastoliques.add(diastolique);
            systoliques.add(systolique);
        }

        System.out.println(systoliques.size() + " mesure(s) enregistrée(s).");
        if (systoliques.isEmpty()) {
            System.out.println("Aucune mesure saisie, rien à analyser.");
            clavier.close();
            return;
        }
        // ===== 4. Affichage des mesures =====
        for (int i = 0; i < systoliques.size(); i++) {
            System.out.print("Jour " + (i + 1) + " : " + systoliques.get(i) + "/" + diastoliques.get(i) + " mmHg - ");

            if (systoliques.get(i) >= 140 || diastoliques.get(i) >= 90) {
                System.out.println("Tension élevée");
            } else if (systoliques.get(i) < 90 || diastoliques.get(i) < 60) {
                System.out.println("Tension basse");
            } else {
                System.out.println("Tension normale");
            }
        }

        // ===== 5. Statistiques (systolique) =====
        int somme = 0;
        for (int i = 0; i < systoliques.size(); i++) {
            somme = somme + systoliques.get(i);
        }

        System.out.println();
        System.out.println("=== Statistiques ===");
        double moyenne = (double) somme / systoliques.size();
        System.out.printf("Moyenne systolique : %.1f mmHg%n", moyenne);

        int maximum = systoliques.get(0);
        for (int i = 1; i < systoliques.size(); i++) {
            if (systoliques.get(i) > maximum) {
                maximum = systoliques.get(i);
            }
        }
        System.out.println("Maximum systolique : " + maximum + " mmHg");

        int minimum = systoliques.get(0);
        for (int i = 1; i < systoliques.size(); i++) {
            if (systoliques.get(i) < minimum) {
                minimum = systoliques.get(i);
            }
        }
        System.out.println("Minimum systolique : " + minimum + " mmHg");

        clavier.close();
    }
}
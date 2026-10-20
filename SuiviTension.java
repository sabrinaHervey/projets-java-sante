public class SuiviTension {

    public static void main(String[] args) {

        int[] systoliques = { 128, 135, 122, 142, 130, 118, 138 };// les valeurs sont placés dans un tableau.

        for (int i = 0; i < systoliques.length; i++) {
            System.out.println("Jour " + (i + 1) + ":" + systoliques[i] + " mmHg");
        }

        int somme = 0;

        for (int i = 0; i < systoliques.length; i++) {
            somme = somme + systoliques[i];
        }

        System.out.println("Somme : " + somme);

        double moyenne = (double) somme / systoliques.length;
        System.out.printf("Moyenne : %.1f mmHg%n", moyenne);

        int maximum = systoliques[0];

        for (int i = 1; i < systoliques.length; i++) {
            if (systoliques[i] > maximum) {
                maximum = systoliques[i];
            }
        }

        System.out.println("Maximum : " + maximum + " mmHg");

        int minimum = systoliques[0];

        for (int i = 1; i < systoliques.length; i++) {
            if (systoliques[i] < minimum) {
                minimum = systoliques[i];
            }
        }
        System.out.println("Minimum : " + minimum+ " mmHg");
    }
}

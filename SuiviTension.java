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

        clavier.close();
    }
}
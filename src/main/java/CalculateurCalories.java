import java.util.Scanner;

public class CalculateurCalories {

    public static double calculerMetabolismeBase(String sexe, int age, double poids, double taille) {
        if (sexe.equalsIgnoreCase("homme")) {
            return 88.362 + 13.397 * poids + 4.799 * taille - 5.677 * age;
        } else {
            return 447.593 + 9.247 * poids + 3.098 * taille - 4.330 * age;
        }

    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Sexe (homme/femme) : ");
        String sexe = scanner.next();
        if (!sexe.equalsIgnoreCase("homme") && !sexe.equalsIgnoreCase("femme")) {
            System.out.println("Erreur : veuillez saisir homme ou femme.");
            scanner.close();
            return;
        }

        System.out.println("Quel est votre âge ? ");
        int age = scanner.nextInt();

        System.out.println("Entrez votre poids en kg : ");
        double poids = scanner.nextDouble();

        System.out.println("Entrez votre taille en cm : ");
        double taille = scanner.nextDouble();

        System.out.println();
        System.out.println("=== Calculateur Calories ===");
        System.out.println("Sexe : " + sexe);
        System.out.print("Âge : " + age + " ans");
        System.out.print("Poids : " + poids + " kg");
        System.out.print("Taille : " + taille + " cm");

        double metabolisme = calculerMetabolismeBase(sexe, age, poids, taille);
        System.out.printf("Métabolisme de base : %.0f kcal/jour%n", metabolisme);

        System.out.println("Niveau d'activité :");
        System.out.println("1. Sédentaire (peu ou pas d’exercice)");
        System.out.println("2. Légèrement actif (1 à 3 séances par semaine)");
        System.out.println("3. Modérément actif (3 à 5 séances par semaine)");
        System.out.println("4. Très actif (6 à 7 séances par semaine) ");
        System.out.println("5. Extrêmement actif (sport intense, travail physique)");
        System.out.print("Votre choix : ");
       
        int choix = scanner.nextInt();

        double coefficient;

        switch (choix) {
            case 1:
                coefficient = 1.2;
                break;
            case 2:
                coefficient = 1.375;
                break;
            case 3:
                coefficient = 1.55;
                break;
            case 4: 
                coefficient = 1.725;
                break;
            case 5:
                coefficient = 1.9;
                break;
            default:
                System.out.println("Erreur : choisissez un niveau entre 1 et 5.");
                scanner.close();
                return;
        }

        double besoins = metabolisme * coefficient;
        System.out.printf("Besoins quotidiens : %.0f kcal/jour%n", besoins);

        scanner.close();
    }
}

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
        System.out.println("Âge : " + age + " ans");
        System.out.println("Poids : " + poids + " kg");
        System.out.println("Taille : " + taille + " cm");

        double metabolisme = calculerMetabolismeBase(sexe, age, poids, taille);
        System.out.printf("Métabolisme de base : %.0f kcal/jour%n", metabolisme);

        scanner.close();
    }
}

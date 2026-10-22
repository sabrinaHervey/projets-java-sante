import java.util.ArrayList;
import java.util.Scanner;

public class GestionPatients {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Patient> patients = new ArrayList<>();

        patients.add(new Patient("Marie", "Dupont", 45, "A+"));
        patients.add(new Patient("Lucas", "Martin", 32, "O-"));
        patients.add(new Patient("Luce", "Jean", 56, "B+"));
        patients.add(new Patient("Nathan", "Adams", 23, "A+"));

        int choix;
        do {
            System.out.println();
            System.out.println("=== Gestion des patients ===");
            System.out.println("1. Afficher les patients");
            System.out.println("2. Ajouter un patient");
            System.out.println("3. Rechercher un patient");
            System.out.println("4. Supprimer un patient");
            System.out.println("0. Quitter");
            System.out.print("Votre choix : ");

            choix = scanner.nextInt();

            switch (choix) {
                case 1: 
                    for (Patient p : patients) {
                        p.afficher();
                    }
                    System.out.println(patients.size() + " patient(s) enregistré(s)");
                    break;

                case 2:
                    System.out.println("Fonctionnalité à venir.");
                    break;
                case 3:
                    System.out.println("Fonctionnalité à venir.");
                    break;
                case 4:
                    System.out.println("Fonctionnalité à venir.");
                    break;
                case 0:
                    System.out.println("Au revoir ! ");
                    break;
                default:
                    System.out.println("Choix invalide");
                    break;
            }

        } while (choix != 0);

        scanner.close();

    }

}

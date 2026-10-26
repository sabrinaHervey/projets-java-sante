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
            System.out.println("Votre choix : ");

            choix = scanner.nextInt();

            switch (choix) {
                case 1:
                    for (Patient p : patients) {
                        p.afficher();
                    }
                    System.out.println(patients.size() + " patient(s) enregistré(s)");
                    break;

                case 2:
                    System.out.print("Nom : ");
                    String nom = scanner.next();
                    System.out.print("Prénom : ");
                    String prenom = scanner.next();
                    System.out.print("Âge : ");
                    int age = scanner.nextInt();
                    System.out.print("Groupe sanguin : ");
                    String groupeSanguin = scanner.next();

                    patients.add(new Patient(prenom, nom, age, groupeSanguin));
                    System.out.println("Patient ajouté");
                    break;
                case 3:
                    System.out.print("Nom à rechercher : ");
                    String nomRecherche = scanner.next();
                    boolean trouve = false;

                    for (Patient p : patients) {
                        if (p.getNom().equalsIgnoreCase(nomRecherche)) {
                            p.afficher();
                            trouve = true;
                        }
                    }
                    if (!trouve) {
                        System.out.println("Aucun patient trouvé.");
                    }

                    break;
                case 4:
                    System.out.print("Prénom du patient à supprimer : ");
                    String prenomSuppr = scanner.next();
                    Patient aSupprimer = null;
                    System.out.print("Nom du patient à supprimer : ");
                    String nomSuppr = scanner.next();                    

                    for (Patient p : patients) {
                        if (p.getPrenom().equalsIgnoreCase(prenomSuppr)&&(p.getNom().equalsIgnoreCase(nomSuppr))) {
                            aSupprimer = p;
                        }
                    }

                    if (aSupprimer == null) {
                        System.out.println("Aucun patient touvé.");
                    } else {
                        patients.remove(aSupprimer);
                        System.out.println("Patient supprimé.");
                    }
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

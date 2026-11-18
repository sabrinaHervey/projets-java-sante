import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Scanner;

public class Cabinet {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Patient marie = new Patient("Marie", "Dupond", 45, "A+");
        Medecin jacques = new Medecin("Jacques", "Cardiologie");
        RendezVous rdv = new RendezVous(marie, jacques, LocalDateTime.of(2026, 11, 12, 14, 30));
        rdv.afficher();

        Medecin lise = new Medecin("Lise", "Gynécologie");
        Medecin laure = new Medecin("Laure", "Généraliste");
        Patient homer = new Patient("Homer", "Hervey", 15, "A+");
        Patient link = new Patient("Link", "Kokiri", 25, "O-");

        Agenda agenda = new Agenda();

        RendezVous rdv1 = new RendezVous(link, lise, LocalDateTime.of(2026, 11, 13, 14, 30));
        if (agenda.ajouterRendezVous(rdv1)) {
            System.out.println("Rendez-vous enregistré.");
        } else {
            System.out.println("Créneau indisponible.");
        }

        RendezVous rdv2 = new RendezVous(homer, lise, LocalDateTime.of(2026, 11, 13, 14, 30));
        if (agenda.ajouterRendezVous(rdv2)) {
            System.out.println("Rendez-vous enregistré.");
        } else {
            System.out.println("Créneau indisponible.");
        }

        RendezVous rdv3 = new RendezVous(homer, laure, LocalDateTime.of(2026, 11, 13, 15, 30));
        if (agenda.ajouterRendezVous(rdv3)) {
            System.out.println("Rendez-vous enregistré.");
        } else {
            System.out.println("Créneau indisponible.");
        }

        RendezVous rdv4 = new RendezVous(homer, laure, LocalDateTime.of(2026, 11, 13, 14, 30));
        if (agenda.ajouterRendezVous(rdv4)) {
            System.out.println("Rendez-vous enregistré.");
        } else {
            System.out.println("Créneau indisponible.");
        }

        RendezVous rdv5 = new RendezVous(homer, jacques, LocalDateTime.of(2026, 11, 13, 15, 30));
        if (agenda.ajouterRendezVous(rdv5)) {
            System.out.println("Rendez-vous enregistré.");
        } else {
            System.out.println("Créneau indisponible.");
        }

        HashMap<String, Medecin> medecins = new HashMap<>();

        medecins.put("lise", lise);
        medecins.put("laure", laure);
        medecins.put("jacques", jacques);

        System.out.print("Avec quel médecin souhaitez-vous un rendez-vous ? ");
        String nomMedecin = scanner.next();
        Medecin medecinChoisi =  medecins.get(nomMedecin.toLowerCase());

        if (medecinChoisi == null) {
            System.out.println("Médecin inconnu");
        } else {
            RendezVous rdv6 = new RendezVous(link, medecinChoisi, LocalDateTime.of(2026, 11, 18, 14, 0));

            if (agenda.ajouterRendezVous(rdv6)){
                System.out.println("Rendez-vous enregistré.");
            } else {
                System.out.println("Créneau indisponible.");
            }
        }

        System.out.println();
        agenda.afficher();
        scanner.close();

    }
}

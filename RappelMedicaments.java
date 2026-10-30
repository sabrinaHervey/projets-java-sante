import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;

public class RappelMedicaments {
    public static void main(String[] args) {
        ArrayList<Medicament> medicaments = new ArrayList<>();

        Medicament doliprane = new Medicament("Doliprane", "1000 mg");
        Medicament spasfon = new Medicament("Spasfon", "80 mg");
        doliprane.ajouterHeure(LocalTime.of(8, 0));
        doliprane.ajouterHeure(LocalTime.of(20, 0));
        medicaments.add(doliprane);
        spasfon.ajouterHeure(LocalTime.of(8, 0));
        spasfon.ajouterHeure(LocalTime.of(20, 0));
        spasfon.ajouterHeure(LocalTime.of(18, 0));
        medicaments.add(spasfon);

        LocalTime maintenant = LocalTime.now();
        DateTimeFormatter format = DateTimeFormatter.ofPattern("HH'h'mm");

        System.out.println("Il est " + maintenant.format(format) + ". Prochaines prises :");
        boolean priseAvenir = false;

        for (Medicament m : medicaments) {
            for (LocalTime h : m.getHeuresPrise()) {
                if (h.isAfter(maintenant)) {
                    System.out.println(h.format(format) + " : " + m.getNomMedicament() + " (" + m.getDosage() + ")");
                    priseAvenir = true;
                }

            }
        }
        if (!priseAvenir) {
            System.out.println("Aucune autre prise aujourd'hui");
        }
    }
}

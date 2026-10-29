import java.time.LocalTime;


public class RappelMedicaments {
    public static void main(String[] args) {
        Medicament doliprane = new Medicament("Doliprane", "1000 mg");
        Medicament spasfon = new Medicament("Spasfon",  "80 mg");
        doliprane.ajouterHeure(LocalTime.of(8, 0));
        doliprane.ajouterHeure(LocalTime.of(20, 0));
        doliprane.afficher();
        spasfon.ajouterHeure(LocalTime.of(8, 0));
        spasfon.ajouterHeure(LocalTime.of(20,0));
        spasfon.afficher();
    }
}

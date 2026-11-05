import java.time.LocalDateTime;

public class Cabinet {
    public static void main(String[] args) {
        Patient marie = new Patient("Marie", "Dupond", 45, "A+");
        Medecin jacques = new Medecin("Jacques", "Cardiologie");
        RendezVous rdv = new RendezVous(marie, jacques, LocalDateTime.of(2026, 11, 12, 14, 30));
        rdv.afficher();
    }
}

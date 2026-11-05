import java.time.LocalDateTime;
import java.util.ArrayList;

public class Agenda {
    private ArrayList<RendezVous> rendezVous;

    public Agenda() {
        this.rendezVous = new ArrayList<>();
    }

    public boolean estDisponible(Medecin medecin, LocalDateTime dateHeure) {
        for (RendezVous rdv : rendezVous) {
            if (rdv.getMedecin().getNom().equals(medecin.getNom()) &&
                    rdv.getDateHeure().equals(dateHeure)) {
                return false;
            }
        }
        return true;
    }
}

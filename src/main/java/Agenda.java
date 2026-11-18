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

    public boolean ajouterRendezVous(RendezVous rdv) {
        if (estDisponible(rdv.getMedecin(), rdv.getDateHeure()) &&
                patientEstDisponible(rdv.getPatient(), rdv.getDateHeure())) {
            rendezVous.add(rdv);
            return true;
        } else {
            return false;
        }
    }

    public void afficher() {
        for (RendezVous rdv : rendezVous) {
            rdv.afficher();
        }
    }

    public boolean patientEstDisponible(Patient patient, LocalDateTime dateHeure) {
        for (RendezVous rdv : rendezVous) {
            if (rdv.getPatient().getNom().equals(patient.getNom())
                    && rdv.getPatient().getPrenom().equals(patient.getPrenom())
                    && rdv.getDateHeure().equals(dateHeure)) {
                return false;
            }
        }
        return true;
    }
}

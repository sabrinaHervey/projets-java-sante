import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class RendezVous {

    private Patient patient;
    private Medecin medecin;
    private LocalDateTime dateHeure;

    public RendezVous(Patient patient, Medecin medecin, LocalDateTime dateHeure) {
        this.patient = patient;
        this.medecin = medecin;
        this.dateHeure = dateHeure;
    }

    public Patient getPatient() {
        return patient;
    }

    public Medecin getMedecin() {
        return medecin;
    }

    public LocalDateTime getDateHeure() {
        return dateHeure;
    }

    public void afficher() {
        DateTimeFormatter format = DateTimeFormatter.ofPattern("dd/MM/yyyy HH'h'mm");
        System.out.println(dateHeure.format(format) + " - " + patient.getPrenom() + " " + patient.getNom() + " avec Dr " + medecin.getNom() + " ("+  medecin.getSpecialite()+ ")");
    }
}

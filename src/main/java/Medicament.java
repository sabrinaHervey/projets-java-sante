import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;

public class Medicament {
    private String nomMedicament;
    private String dosage;

    private ArrayList<LocalTime> heuresPrise;


    public ArrayList<LocalTime> getHeuresPrise() {
        return heuresPrise;
    }

    public String getNomMedicament() { //getter
        return nomMedicament;
    }

    public String getDosage() {
        return dosage;
    }

    public Medicament(String nomMedicament, String dosage) {
        this.nomMedicament = nomMedicament;
        this.dosage = dosage;
        this.heuresPrise = new ArrayList<>();
    }

    public void ajouterHeure(LocalTime heure) { //setter
        this.heuresPrise.add(heure);
    }

    public void afficher() {
        DateTimeFormatter format = DateTimeFormatter.ofPattern("HH'h'mm");

        System.out.print(nomMedicament + " (" + dosage + ") : ");

        for (LocalTime h : heuresPrise) {
            System.out.print(h.format(format) + " ");
        }

        System.out.println();
    }
  
}

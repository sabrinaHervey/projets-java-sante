import java.util.ArrayList;

public class GestionPatients {

    public static void main(String[] args) {
        ArrayList<Patient> patients = new ArrayList<>();

        patients.add(new Patient("Marie", "Dupont", 45, "A+"));
        patients.add(new Patient("Lucas", "Martin", 32, "O-"));
        patients.add(new Patient("Luce", "Jean", 56, "B+"));
        patients.add(new Patient("Nathan", "Adams", 23, "A+"));

        for (Patient p : patients) {
            p.afficher();
        }
        System.out.println(patients.size() + " patient(s) enregistré(s)");
    }

}

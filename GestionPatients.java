public class GestionPatients {

    public static void main(String[] args) {
        
        Patient p1 = new Patient("Marie", "Dupont", 45, "A+");
        Patient p2 = new Patient("Lucas", "Martin", 32, "O-");
        Patient p3 = new Patient("Luce", "Jean", 56, "A+");

        p1.afficher();
        p2.afficher();
        p3.afficher();
    }
    
}

public class Medecin {
    private String nom;
    private String specialite;

    public Medecin(String nom, String specialite) {
        this.nom = nom;
        this.specialite = specialite;
    }

    public String getNom() {
        return nom;
    }

    public  String getSpecialite() {
        return specialite;
    }

    public void afficher() {
        System.out.println("Medecin : " + nom + " , " + specialite + "Spécialité : ");
    }
}

public class Patient {
    String nom;
    String prenom;
    int age;
    String groupeSanguin;

    public Patient(String prenom, String nom, int age, String groupeSanguin) {
        this.prenom = prenom;
        this.nom = nom;
        this.age = age;
        this.groupeSanguin = groupeSanguin;
    }

    public void afficher() {
        System.out.println("Patient : " + prenom + " " + nom + ", " + age + " ans, groupe" + " " + groupeSanguin);
    }
}

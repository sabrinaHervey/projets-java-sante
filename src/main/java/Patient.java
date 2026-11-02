public class Patient {
    private String nom;
    private String prenom;
    private int age;
    private String groupeSanguin;

    public int getAge() { //getter
        return age;
    }

    public String getNom() {
        return nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public String getGroupeSanguin() {
        return groupeSanguin;
    }

    public void setAge(int age) { //setter
        if (age >= 0 && age <= 130) {
            this.age = age;
        } else {
            System.out.println("Erreur : l'Age doit etre compris entre 0 et 130 ans");
        }
    }

    public Patient(String prenom, String nom, int age, String groupeSanguin) {
        this.prenom = prenom;
        this.nom = nom;
        setAge(age);
        this.groupeSanguin = groupeSanguin;
    }

    public void afficher() {
        System.out.println("Patient : " + prenom + " " + nom + ", " + age + " ans, groupe" + " " + groupeSanguin);
    }
}

import java.util.Scanner;

public class CalculateurIMC {

    public static double calculerIMC(double poids, double taille) {

        return poids / (taille * taille);
    }

    public static String categorieIMC(double imc) {
        if (imc < 18.5) {
            return "Insuffisance pondérale";
        } else if (imc < 25) {
            return "Corpulence normale";
        } else if (imc <30) {
            return "Surpoids";
        } else {
            return "Obésité";
        }     
    }

    public static void main(String[] args) {
        Scanner clavier = new Scanner(System.in);

        System.out.print("Entrez votre poids en kg : ");
        double poids = clavier.nextDouble();

        System.out.print("Entrez votre taille en mètres : ");
        double taille = clavier.nextDouble();

        if (poids <= 0 || taille <= 0) {
            System.out.println("Erreur : le poids et la taille doivent être strictement supérieurs à 0.");
            clavier.close();
            return;
        }

        if (taille > 2.5 || poids > 400) {
            System.out.println("Erreur : valeurs impossibles pour un humain (taille maximale : 2,5 m, poids maximal : 400 kg).");
            clavier.close();
            return;
        }

        double imc = calculerIMC(poids, taille);
        System.out.printf("Votre IMC est de : %.1f%n" , imc);
        System.out.println(categorieIMC(imc));
/*         if (imc < 18.5) {
            System.out.println("Insuffisance pondérale");
        } else if (imc < 25) {
            System.out.println("Corpulence normale");
        } else if (imc < 30) {
            System.out.println("Surpoids");
        } else {
            System.out.println("Obésité");
        } */

        clavier.close();
    }
}

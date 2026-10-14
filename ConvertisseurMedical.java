import java.util.Scanner;

public class ConvertisseurMedical {

    public static double celsiusVersFahrenheit(double celsius) {

        return celsius * 9.0 / 5.0 + 32;
    }

    public static double fahrenheitVersCelsius(double fahrenheit) {
        return (fahrenheit - 32) * 5.0 / 9.0;
    }

    public static double kgVersLivres(double kg) {
        return kg * 2.20462;
    }

    public static double livresVersKg(double livres) {
        return livres / 2.20462;
    }

    public static double mgdlVersMmoll(double mgdl) {
        return mgdl / 18;
    }

    public  static double mmollVersMgdl(double mmoll) {
        return mmoll * 18;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choix;
        do {
            System.out.println();
            System.out.println("=== Convertisseur médical ===");
            System.out.println("1. Celsius → Fahrenheit");
            System.out.println("2. Fahrenheit → Celsius");
            System.out.println("3. Kilogrammes → Livres");
            System.out.println("4. Livres → Kilogrammes");
            System.out.println("5. mg/dL → mmol/L");
            System.out.println("6. mmol/L → mg/dL");
            System.out.println("0. Quitter");
            System.out.print("Votre choix : ");

            choix = scanner.nextInt();


            switch (choix) {

                case 1 :
                    System.out.print("Température en °C : ");
                    double celsius = scanner.nextDouble();
                    System.out.printf("%.1f °C = %.1f °F%n", celsius, celsiusVersFahrenheit(celsius));
                    break;

                case 2:
                    System.out.print("Température en °F : ");
                    double fahrenheit = scanner.nextDouble();
                    System.out.printf("%.1f °F = %.1f °C%n", fahrenheit, fahrenheitVersCelsius(fahrenheit));
                    break;

                case 3:
                    System.out.print("Poids en kg : ");
                    double kg = scanner.nextDouble();
                    System.out.printf("%.1f kg = %.1f lb%n",kg, kgVersLivres(kg));
                    break;

                case 4:
                    System.out.print("Poids en livres : ");
                    double livres = scanner.nextDouble();
                    System.out.printf("%.1f lb = %.1f kg%n",livres, livresVersKg(livres));
                    break;

                case 5:
                    System.out.print("Glycémie en mg/dL : ");
                    double mgdL = scanner.nextDouble();
                    System.out.printf("%.1f mg/dL = %.1f mmol/L%n",mgdL, mgdlVersMmoll(mgdL));
                    break;

                case 6:
                    System.out.print("Glycémie en mmol/L : ");
                    double mmoll = scanner.nextDouble();
                    System.out.printf("%.1f mmol/L = %.1f mg/dL%n",mmoll, mmollVersMgdl(mmoll));
                    break;

                case 0 :
                    System.out.println("Au revoir ! ");
                    break;
                default:
                    System.out.println("Choix invalide");
                    break;
            } // fin du switch

        } while (choix != 0); // fin du do

        scanner.close();
    }
}

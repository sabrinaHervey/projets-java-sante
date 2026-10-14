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

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("1. Celsius → Fahrenheit");
        System.out.println("2. Fahrenheit → Celsius");
        System.out.println("3. Kilogrammes → Livres");
        System.out.println("4. Livres → Kilogrammes");
        System.out.println("0. Quitter");
        System.out.print("Votre choix : ");

        int choix = scanner.nextInt();

        switch (choix) {

            case 1 :
                System.out.println("Température en °C : ");
                double celsius = scanner.nextDouble();
                System.out.printf("%.1f °C = %.1f °F%n", celsius, celsiusVersFahrenheit(celsius));
                break;

            case 2:
                System.out.println("Température en °F : ");
                double fahrenheit = scanner.nextDouble();
                System.out.printf("%.1f °F = %.1f °C%n", fahrenheit, fahrenheitVersCelsius(fahrenheit));
                break;

            case 3:
                System.out.println("poids en kg : ");
                double kg = scanner.nextDouble();
                System.out.printf("%.1f kg = %.1f lb%n",kg, kgVersLivres(kg));
                break;

             case 4:
                System.out.println("poids en livres : ");
                double livres = scanner.nextDouble();
                System.out.printf("%.1f lb = %.1f kg%n",livres, livresVersKg(livres));
                break;

            case 0 :
                System.out.println("Au revoir ! ");
            default:
                System.out.println("Choix invalide");
                break;
        }
        scanner.close();
    }
}

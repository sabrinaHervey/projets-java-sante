public class ConvertisseurMedical {
    
    public static double celsiusVersFahrenheit(double celsius) {

        return celsius * 9.0 / 5.0 + 32;
    }

    public static double fahrenheitVersCelsius(double fahrenheit) {
        return (fahrenheit - 32) * 5.0 / 9.0;
    }

    public  static double kgVersLivres(double kg) {
        return kg * 2.20462;
    }

    public  static double livresVersKg(double livres) {
        return livres / 2.20462;
    }

    public static void main(String[] args) {
        System.out.println(celsiusVersFahrenheit(37.0));
        System.out.println(fahrenheitVersCelsius(98.6));
        System.out.println(kgVersLivres(70));
        System.out.println(livresVersKg(154.3));
    }
}

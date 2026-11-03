import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class ConvertisseurMedicalTest {
    @Test
    void celsiusVersFahrenheit_temperatureCorporelle() {
        double resultat = ConvertisseurMedical.celsiusVersFahrenheit(37.0);
        assertEquals(98.6, resultat, 0.01);
    }

    @Test
    void fahrenheitVersCelsius_temperatureCorporelle() {
        double resultat = ConvertisseurMedical.fahrenheitVersCelsius(98.6);
        assertEquals(37.0, resultat, 0.01);
    }

    @Test
    void kgVersLivres_poidsCorporelle() {
        double resultat = ConvertisseurMedical.kgVersLivres(70);
        assertEquals(154.32, resultat, 0.01);
    }

    @Test
    void livresVersKg_poidsCorporelle() {
        double resultat = ConvertisseurMedical.livresVersKg(154.32);
        assertEquals(70, resultat, 0.01);
    }

    @Test
    void mgdlVersMmol_glycemie() {
        double resultat = ConvertisseurMedical.mgdlVersMmoll(90);
        assertEquals(5.0, resultat, 0.01);
    }
    @Test
    void mmollVersMgdl_glycemie() {
        double resultat = ConvertisseurMedical.mmollVersMgdl(5);
        assertEquals(90.0, resultat, 0.01);
    }
}

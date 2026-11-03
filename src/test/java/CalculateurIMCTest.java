import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class CalculateurIMCTest {
    @Test
    void calculerIM_poidsEtTailleNormaux() {
        double resultat = CalculateurIMC.calculerIMC(70.0, 1.75);
        assertEquals(22.86, resultat, 0.01);
    }

    @Test
    void categorieIMC_surpoids() {
        String resultat = CalculateurIMC.categorieIMC(27.0);
        assertEquals("Surpoids", resultat);
    }

    @Test
    void categorieIMC_insuffisancePonderale() {
        String resultat = CalculateurIMC.categorieIMC(17.0);
        assertEquals("Insuffisance pondérale", resultat);
    }

    @Test
    void categorieIMC_corpulenceNormale() {
        String resultat = CalculateurIMC.categorieIMC(22.0);
        assertEquals("Corpulence normale", resultat);
    }

    @Test
    void categorieIMC_obesite() {
        String resultat = CalculateurIMC.categorieIMC(35.0);
        assertEquals("Obésité", resultat);
    }

    @Test
    void categorieIMC_limite25_estSurpoids() {
        String resultat = CalculateurIMC.categorieIMC(25.0);
        assertEquals("Surpoids", resultat);
    }
}

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class SuiviTensionTest {
    @Test 
    void categorieTension_normale() {
        String resultat = SuiviTension.categorieTension(120, 80);
        assertEquals("Tension normale", resultat);
    }

    @Test
    void categorieTension_elevee() {
        String resultat = SuiviTension.categorieTension(150, 95);
        assertEquals("Tension élevée", resultat);
    }

    @Test
    void categorieTension_basse() {
        String resultat = SuiviTension.categorieTension(85, 55);
        assertEquals("Tension basse", resultat);
    }

        @Test
    void categorieTension_Diastolique_supérieure() {
        String resultat = SuiviTension.categorieTension(78, 90);
        assertEquals("Mesure à vérifier", resultat);
    }

        @Test
    void categorieTensionEcart_anormal() {
        String resultat = SuiviTension.categorieTension(190, 20);
        assertEquals("Mesure à vérifier", resultat);
    }

    @Test 
    void categorieTensionLimite_elevee() {
        String resultat = SuiviTension.categorieTension(140, 80);
        assertEquals("Tension élevée", resultat);  
    }
    
    @Test 
    void categorieTensionValeur_egales() {
        String resultat = SuiviTension.categorieTension(90, 90);
        assertEquals("Mesure à vérifier", resultat);  
    }
}

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class PatientTest {
    @Test 
    void  setAge_ageValide_estAccepte() {
        Patient patient = new Patient("Marie", "Dupont", 46, "A+");

        patient.setAge(46);

        assertEquals(46, patient.getAge());
    }

    @Test 
    void setAge_ageNegatif_pasAccepte() {
        Patient patient = new  Patient("Link", "Triforce", 45, "O+");

        patient.setAge(-12);

        assertEquals(45, patient.getAge());
    }

    @Test 
    void setAge_ageTropgrand_pasAccepte() {
        Patient patient = new  Patient("Marissa", "Dupont", 45, "O+");

        patient.setAge(200);

        assertEquals(45, patient.getAge());
    }
}

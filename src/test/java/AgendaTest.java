import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.time.LocalDateTime;

import org.junit.jupiter.api.Test;

public class AgendaTest {
    @Test
    void ajouterRendezVous_agendaVide_estAccepte() {
        Agenda agenda = new Agenda();
        Patient marie = new Patient("Marie", "Dupont", 45, "A+");
        Medecin lise = new Medecin("Lise", "Gynécologie");
        RendezVous rdv = new RendezVous(marie, lise, LocalDateTime.of(2026, 11, 20, 10, 0));

        assertTrue(agenda.ajouterRendezVous(rdv));
    }

    @Test
    void ajouterRendezVous_medecinDejaOccupe_estRefuse() {
        Agenda agenda = new Agenda();
        Patient patient1 = new Patient("Marie", "Dupont", 45, "A+");
        Patient patient2 = new Patient("Homer", "Hervey", 15, "A+");
        Medecin medecin = new Medecin("Lise", "Gynécologie");
        LocalDateTime moment = LocalDateTime.of(2026, 11, 20, 10, 0);

        agenda.ajouterRendezVous(new RendezVous(patient1, medecin, moment));

        assertFalse(agenda.ajouterRendezVous(new RendezVous(patient2, medecin, moment)));
    }

    @Test
    void ajouterRendezVous_heureDifferente_estRefuse() {
        Agenda agenda = new Agenda();
        Patient patient = new Patient("Marie", "Dupont", 45, "A+");
        Medecin medecin1 = new Medecin("Lise", "Gynécologie");
        Medecin medecin2 = new Medecin("Laure", "Généraliste");
        LocalDateTime moment = LocalDateTime.of(2026, 11, 20, 10, 0);

        agenda.ajouterRendezVous(new RendezVous(patient, medecin1, moment));

        assertFalse(agenda.ajouterRendezVous(new RendezVous(patient, medecin2, moment)));
    }

    @Test
    void ajouterRendezVous_heureDifferente_estAccepte() {
        Agenda agenda = new Agenda();
        Patient patient = new Patient("Marie", "Dupont", 45, "A+");
        Medecin medecin = new Medecin("Lise", "Gynécologie");
        LocalDateTime moment = LocalDateTime.of(2026, 11, 20, 10, 0);

        agenda.ajouterRendezVous(new RendezVous(patient, medecin, moment));

        assertTrue(agenda.ajouterRendezVous(new RendezVous(patient, medecin, moment.plusHours(1))));
    }
}

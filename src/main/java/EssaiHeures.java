import java.time.LocalTime;
import java.util.ArrayList;
import java.time.format.DateTimeFormatter;

public class EssaiHeures {
    public static void main(String[] args) {
        LocalTime matin = LocalTime.of(8, 00);
        LocalTime soir = LocalTime.parse("20:00");
        LocalTime finDeMatin = LocalTime.of(12, 30);
        LocalTime now = LocalTime.now();

        DateTimeFormatter format = DateTimeFormatter.ofPattern("HH'h'mm");

        ArrayList<LocalTime> heurePrise = new ArrayList<>();
        heurePrise.add(matin);
        heurePrise.add(soir);
        heurePrise.add(finDeMatin);

        System.out.println("Il est " + now.format(format));
        for (LocalTime h : heurePrise) {
            if (h.isBefore(now)) {
                System.out.println(h + " : déjà passée");
            } else {
                System.out.println(h + " : à venir");
            }
        }

    }

}

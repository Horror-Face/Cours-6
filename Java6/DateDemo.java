package Java6;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class DateDemo {
    public static void main(String[] args) {
        LocalDate date = LocalDate.now();
        String dateFormatee = date.format(DateTimeFormatter.ofPattern("dd/MM/yyyy"));
        System.out.println("Date formatée : " + dateFormatee);

        String mois = date.getMonth().name();
        System.out.println("Mois : " + mois);

        int annee = date.getYear();
        System.out.println("Année : " + annee);
    }
}

package OCPII.exceptionsAssertionsandLocalization;

import java.time.LocalDateTime;
import java.time.Month;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

import static java.time.format.FormatStyle.SHORT;

public class LocalizingDates {

    public static void print(DateTimeFormatter dtf,
                             LocalDateTime dateTime, Locale locale) {
        System.out.println(dtf.format(dateTime) + ", "
                + dtf.withLocale(locale).format(dateTime));
    }

    public static void main(String[] args) {
        Locale.setDefault(new Locale("en", "US"));
        var italy = new Locale("it", "IT");
        var dt = LocalDateTime.of(2020, Month.OCTOBER, 20, 15, 12, 34);

        // 10/20/20, 20/10/20
        print(DateTimeFormatter.ofLocalizedDate(SHORT),dt,italy);

        // 3:12 PM, 15:12
        print(DateTimeFormatter.ofLocalizedTime(SHORT),dt,italy);

        // 10/20/20, 3:12 PM, 20/10/20, 15:12
        print(DateTimeFormatter.ofLocalizedDateTime(SHORT,SHORT),dt,italy);

    }
}

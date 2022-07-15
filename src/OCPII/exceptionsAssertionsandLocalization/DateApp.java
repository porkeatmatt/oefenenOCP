package OCPII.exceptionsAssertionsandLocalization;

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Properties;
import java.util.ResourceBundle;


public class DateApp {
    public static void main(String[] args) {
        LocalDate date = LocalDate.of(2020, Month.AUGUST, 15);
        System.out.println(date.format(DateTimeFormatter.BASIC_ISO_DATE));
        Locale locale = Locale.getDefault();
        System.out.println(locale);

        Locale locale2 = new Locale("en", "USA");

        NumberFormat numberFormat = NumberFormat.getInstance();
        double d = 12555888569.85;
        //van gelijk welk number (en subklasses),object naar String
        String formattedDouble = numberFormat.format(d);
        System.out.println("eerste geformat is: " + formattedDouble);


        NumberFormat numberformatter2 = NumberFormat.getNumberInstance();
        double d2 = 1549849.85;
        String s2 = numberformatter2.format(d2);
        System.out.println("2e geformat is: " + s2);


        String s = "40.15";

        NumberFormat f1 = new DecimalFormat("########,###.00");
        System.out.println("decimalFormat: " + f1.format(d));

        var rb = ResourceBundle.getBundle("OCP", new Locale("nl"));
        System.out.println("print de keyset");
        rb.keySet().forEach(System.out::println);

        var props = new Properties();
        props.setProperty("name", "Matthias' dierentuin");
        props.setProperty("open", "13 soms 14u in de namiddag");

        System.out.println(props.get("jkklm"));

        LocalDateTime localDateTime;
        LocalTime localTime = LocalTime.now();
        LocalDate localDate;

        //throwt Exc, gebruikt misse formatter
        //localTime.format(DateTimeFormatter.ISO_DATE);


    }
}

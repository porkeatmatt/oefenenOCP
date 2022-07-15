package OCPII.exceptionsAssertionsandLocalization;

import java.time.*;
import java.time.format.DateTimeFormatter;

public class CustomizingDates {

    public static void creatingSomeDates(){
        LocalDate localDate = LocalDate.of(2015, Month.JANUARY, 17);
        LocalTime localTime = LocalTime.of(17, 55);
        LocalTime localTime2 = LocalTime.of(17, 55, 40,22);

        LocalDateTime localDateTime = LocalDateTime.of(localDate, localTime);
        ZonedDateTime zonedDateTime = ZonedDateTime.now();

        //2020-10-14T12:45:20.854-04:00[America/New_York]
    }

    public static void formattingSomeDates(){
        LocalDate date = LocalDate.of(2020, Month.OCTOBER, 20);
        LocalTime time = LocalTime.of(11, 12, 34);
        LocalDateTime dt = LocalDateTime.of(date, time);


        //let goed op welk dateObj je de formatter oproept <=> enumwaarde DTF
        System.out.println(date.format(DateTimeFormatter.ISO_LOCAL_DATE));
        System.out.println(time.format(DateTimeFormatter.ISO_LOCAL_TIME));
        System.out.println(dt.format(DateTimeFormatter.ISO_LOCAL_DATE_TIME));


        //MMMM -> uitgeschreven maand
        //MMM -> uitgeschreven afkorting
        //MM -> 01 voor januari
        //M -> 1

        //dd -> 05
        //dd -> 5

        //hh, h , dd,d hh,h , mm,m-> kan allemaal

        //a -> AM,PM

        //z -> naam Tijdzone

        //Z offset tijdzone -> -0400

        var f = DateTimeFormatter.ofPattern("MMMM dd, yyyy 'at' h:m");
        System.out.println(dt.format(f)); // October 20, 2020 at 11:12
    }

    public static void whatFormat(){
        var dateTime = LocalDateTime.of(2020, Month.OCTOBER, 20, 6, 15, 30);
        var formatter = DateTimeFormatter.ofPattern("MM/dd/yyyy hh:mm:ss");
        //je kan zowel format oproepen op het datetimeObject als op de formatter zelf

        System.out.println(dateTime.format(formatter)); // 10/20/2020 06:15:30
        System.out.println(formatter.format(dateTime)); // 10/20/2020 06:15:30
    }

    public static void formattingExamples(){
        var dt = LocalDateTime.of(2020, Month.OCTOBER, 20, 6, 15, 30);
        var g1 = DateTimeFormatter.ofPattern("MMMM dd', Party''s at' hh:mm");
        System.out.println(dt.format(g1)); // October 20, Party's at 06:15
        var g2 = DateTimeFormatter.ofPattern("'System format, hh:mm: 'hh:mm");
        System.out.println(dt.format(g2)); // System format, hh:mm: 06:15
        var g3 = DateTimeFormatter.ofPattern("'NEW! 'yyyy', yay!'");
        System.out.println(dt.format(g3)); // NEW! 2020, yay!
    }
    public static void main(String[] args) {
        formattingSomeDates();
    }
}

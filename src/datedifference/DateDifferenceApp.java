package datedifference;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class DateDifferenceApp {

    public static void calculateDifference(String start_date){

        SimpleDateFormat sdf
                = new SimpleDateFormat(
                "dd-MM-yyyy HH:mm:ss");

        LocalDateTime localDateTime = LocalDateTime.now();


        try {
            //start date
            Date d1 = sdf.parse(start_date);


            //enddate = now
            Date d2 = new Date();


            long difference_In_Time
                    = d2.getTime() - d1.getTime();


            long difference_In_Seconds
                    = (difference_In_Time
                    / 1000)
                    % 60;

            long difference_In_Minutes
                    = (difference_In_Time
                    / (1000 * 60))
                    % 60;

            long difference_In_Hours
                    = (difference_In_Time
                    / (1000 * 60 * 60))
                    % 24;



            System.out.print(
                    "Je hebt "
                            + " ");

            System.out.println(
                            + difference_In_Hours
                            + " uur en "
                            + difference_In_Minutes
                            + " minuten gestudeerd"
            );
        }

        catch (ParseException e) {
            e.printStackTrace();
        }
    }
}

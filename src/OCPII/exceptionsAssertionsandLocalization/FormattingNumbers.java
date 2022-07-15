package OCPII.exceptionsAssertionsandLocalization;

import java.text.NumberFormat;
import java.text.ParseException;
import java.util.Locale;

public class FormattingNumbers {
    public static void main(String[] args) throws ParseException {
        int attendeesPerYear = 3_200_000;
        int attendeesPerMonth = attendeesPerYear / 12;

        //op het numberformatObj roep je format: die aanvaardt obj, long,..
        //returnt een string
        NumberFormat us = NumberFormat.getInstance(Locale.US);
        System.out.println("formatted met us locale: " + us.format(attendeesPerMonth));
        var gr = NumberFormat.getInstance(Locale.GERMANY);
        System.out.println(gr.format(attendeesPerMonth));
        var ca = NumberFormat.getInstance(Locale.CANADA_FRENCH);
        System.out.println(ca.format(attendeesPerMonth));

        //formatting currency
        double price = 48;
        //hier kijkt hij naar je default Local en bepaalt hij zo hoe je naar currency format


        var myLocale = NumberFormat.getCurrencyInstance();
        System.out.println(myLocale.format(price));
        var localeJAPAN = NumberFormat.getCurrencyInstance(Locale.JAPAN);
        System.out.println(localeJAPAN.format(price));

        String s = "40.45";
        //.parse() aanvaardt String en zet die om naar Number
        //een . wordt in US als deel vh nummer gezien
        NumberFormat en = NumberFormat.getIntegerInstance(Locale.US);
        Number n = en.parse(s);
        System.out.println(n); // 40.45

        //in Frankrijk niet
        var fr = NumberFormat.getInstance(Locale.FRANCE);
        System.out.println(fr.parse(s)); // 40


    }
}

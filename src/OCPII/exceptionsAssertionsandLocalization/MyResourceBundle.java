package OCPII.exceptionsAssertionsandLocalization;

import java.util.Locale;
import java.util.ResourceBundle;

public class MyResourceBundle {
    public static void printWelcomeMessage(Locale locale) {
        var rb = ResourceBundle.getBundle("OCP", locale);
        System.out.println(rb.getString("hello") + ", " + rb.getString("open"));
    }

    public static void main(String[] args) {
        var us = new Locale("nl");
        var france = new Locale("fr");
        printWelcomeMessage(us); // Hello, The zoo is open
        printWelcomeMessage(france); // Bonjour, Le zoo est ouvert
    }
}

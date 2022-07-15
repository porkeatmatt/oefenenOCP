package OCPII.exceptionsAssertionsandLocalization;

import java.text.NumberFormat;
import java.util.Locale;

public class SpecificLocale {

         public static void printCurrency(Locale locale, double money) {
             System.out.println(
             NumberFormat.getCurrencyInstance().format(money)
             + ", " + locale.getDisplayLanguage());
             }
         public static void main(String[] args) {
             var spain = new Locale("es", "ES");
             var money = 1.23;

             // Print with default locale
             Locale.setDefault(new Locale("en", "US"));
             printCurrency(spain, money); // $1.23, Spanish

             // Print with default locale and selected locale display
             //DISPLAY -> verandert hoe je locale zich toont
             //DISPLAY -> es_ES
             //FORMAT -> en_US
             Locale.setDefault(Locale.Category.DISPLAY, spain);
             printCurrency(spain, money); // $1.23, español

             // Print with default locale and selected locale format
             //FORMAT -> verandert hoe je dates, numbers, currencies format
             //DISPLAY -> es_ES
             //FORMAT -> es_ES
             Locale.setDefault(Locale.Category.FORMAT, spain);
             printCurrency(spain, money); // 1,23 €, español
         }
}

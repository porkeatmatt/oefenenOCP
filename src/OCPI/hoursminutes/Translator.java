package OCPI.hoursminutes;

public class Translator {
   static float totalMinutes = 70;

   static void translate (){
        int hours = (int) totalMinutes/60;
        int minutes = (int) totalMinutes - hours*60;

        System.out.println("Je hebt " + hours + " uur en " + minutes + " minuten gestudeerd");
    }

    public static void main(String[] args) {
        translate();
    }
}

package hourCalculator;

public class Translator {
   static float totalMinutes = 6755;
   static int totalHours = 0;

   static void translateToHours (){
        int hours = (int) totalMinutes/60;
        int minutes = (int) totalMinutes - hours*60;

        System.out.println("Je hebt " + hours + " uur en " + minutes + " minuten gestudeerd");
    }

    static void translateToMinutes (){
       int minutes = (int) ((totalHours * 60) + totalMinutes);
        System.out.println("Je wilt " + minutes + " minuten studeren");
    }



    public static void main(String[] args) {
      translateToHours();
//      translateToMinutes();
    }
}

package OCPII;

public class PolarBear {
    final int age = 10;
    final int fishEaten;
    final String name;


    { fishEaten = 10; }
    public PolarBear() {
        name = "Robert";
    }
    public PolarBear(int height) {
        this();
    }

    public static void main(String[] args) {
        PolarBear polarBear = new PolarBear(5);
        System.out.println("name is: " + polarBear.name);

        Season[] seizoenen = Season.values();
//        System.out.println(seizoenen[0]);

        Season s = seizoenen[0];
        Season.valueOf("SUMMER");

       Season summer =  Season.SUMMER;

       switch(summer){
           case SUMMER:
       }

        System.out.println(s);



    }





}

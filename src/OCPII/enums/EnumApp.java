package OCPII.enums;

public class EnumApp {
    public static void main(String[] args) {
        Season s = Season.SUMMER;

        //je mag een enumVariabele declareren als null
        Season WINTER = null;

        //compileert maar geeft nullpointer
        switch(WINTER){
            case SUMMER:  System.out.println("het is zomer");
            case WINTER:  System.out.println("Het is winter");
            default:
                System.out.println("niets");
        }

        Season w = Season.valueOf("WINTER");
        int ordinal = w.ordinal();
        Season[] seasons = Season.values();
        System.out.println(seasons[0]);

        switch(w){
            case SUMMER:
        }
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override
    public String toString() {
        return super.toString();
    }

}

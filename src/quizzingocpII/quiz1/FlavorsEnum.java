package quizzingocpII.quiz1;

public class FlavorsEnum {
    enum Flavors {
        // ; niet vergeten
        VANILLA, CHOCOLATE, STRAWBERRY;
        static final Flavors DEFAULT = STRAWBERRY;
    }

    public static void main(String[] args) {
        for (final var e : Flavors.values()){
            System.out.println(e.ordinal() + " ");
        }

        Flavors FAVOURITEFLAVOR = Flavors.CHOCOLATE;
        //in switch statement zet je een enumObj en die vergelijk je dan
        switch(FAVOURITEFLAVOR){
            case CHOCOLATE:
                System.out.println("toegestaan");
            //niet toegestaan
            //case Flavors.STRAWBERRY:
        }
    }
}

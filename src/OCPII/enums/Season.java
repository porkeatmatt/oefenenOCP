package OCPII.enums;

public enum Season {
    WINTER("low"){
        public String getHours(){return "gesloten";}

        @Override
        public void mustBeImplemented() {
            System.out.println("aja");
        }
    },
    SPRING ("meh"){
        @Override
        public void mustBeImplemented() {
            System.out.println("ahnee");
        }
    },
    SUMMER ("the rent is too damn high"){
        @Override
        public void mustBeImplemented() {
            System.out.println("zo werkt dit dus");
        }
    },
    FALL ("meh"){
        @Override
        public void mustBeImplemented() {
            System.out.println("ok");
        }
    };

    private final String expectedTemperature;
    private Season(String s){
        this.expectedTemperature = s;
    }
    public void printTemperature(){
        System.out.println(expectedTemperature);
    }
    public String getHours(){
        return "9 tot 17u";
    }
    public abstract void mustBeImplemented();
}

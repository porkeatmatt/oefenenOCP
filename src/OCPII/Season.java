package OCPII;

public enum Season {
    WINTER("Low",1 ) {
        public String getHours() {
            return "blabla";
        }
        public void getSomething(){
            System.out.println("ive got something");
        }
    },
    SPRING ("Medium", 2){
        public String getHours(){ return "blabla";}
    },
    SUMMER ("High", 3){
        public String getHours(){ return "blabla";}
    },
    FALL("Medium", 4){
        public String getHours(){ return "blabla";}
    };
    private final String expectedVisitors;
    private int number;
    public abstract String getHours();

    public void getSomething(){

    }


    Season (String expectedVisitors, int n){
        this.expectedVisitors = expectedVisitors;
        this.number = n;
    }
    public void printExpectedVisitors(){
        System.out.println(expectedVisitors);
    }
}

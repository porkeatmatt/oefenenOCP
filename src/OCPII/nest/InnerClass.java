package OCPII.nest;

public class InnerClass {
    private String greeting = "hi";

    //kan protected verklaard word, kan andere klasses implementeren
    protected class Inner {
        public int repeat = 3;
        //  je kan geen static fields declareren wel STATIC en FINAL
        private final static int la = 7;
        public void go(){
            for (int i = 0; i < repeat; i++){
                //de inner klasse kan aan private methodes van de outer
                System.out.println(greeting);
            }
        }
    }

    public static void main(String[] args) {
        InnerClass outer = new InnerClass();

        //je hebt altijd instantie van de outer class nodig om aan de inner te geraken
        InnerClass.Inner inner = outer.new Inner();
        inner.go();
    }
}

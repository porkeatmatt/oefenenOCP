package OCPII.localclasses;

public class Outer {
    private interface Wild{
        private void testWalk(){};

        abstract public void run();
    }

    float returnFLoat(){
        return 1;
    }
    void aMethod(){
       Printable p = new Printable(){
           public void Print(){
               System.out.println();
           }
       };
    }
}

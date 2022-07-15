package OCPII.generics;

public class DeclaringGenericsOnTwoLevels <G> {
    public <G> G vervelendDOen(G g){
        return g;
    }

    public static void main(String[] args) {
        // G is een crate hier
        var d = new DeclaringGenericsOnTwoLevels<Crate>();

        // G is hier een String
        d.vervelendDOen("eenString");

    }
}

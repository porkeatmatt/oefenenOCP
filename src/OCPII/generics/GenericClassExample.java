package OCPII.generics;

public class GenericClassExample <T> {
    private T contents;
    public T emptyCrate (){
        return contents;
    }
    public void packCrate(T contents){
        this.contents = contents;
    }

    public static void main(String[] args) {
        //is allebei toegestaan, maar de eerste laat alleen objects toe
        var gce = new GenericClassExample<>();
        gce.packCrate(new Object());

        var gce2 = new GenericClassExample<String>();
        gce2.packCrate("lol");

        //meer standaard op deze manier

        GenericClassExample<Integer> gce3 = new GenericClassExample<>();

    }
}

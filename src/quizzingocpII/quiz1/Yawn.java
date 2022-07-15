package quizzingocpII.quiz1;

import java.util.List;

interface Yawn {
    String yawn(double d, List<Integer> time);
}
class Sloth implements Yawn {
    @Override
    public String yawn(double zzzz, List<Integer> time) {
        return "Sleep: " + zzzz;
    }
}
class Vet {
    public static String takeNap(Yawn y){
        return y.yawn(10, null);
    }

    public static void main(String[] args) {
        System.out.println(takeNap(new Sloth()));
    }
}

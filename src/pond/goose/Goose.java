package pond.goose;

import pond.shore.Bird;

public class Goose extends Bird {
    public void swim(){
        floatInWater();
        System.out.println(text);
    }

    public void helpGooseSwim(){
        Goose other = new Goose();
        System.out.println(other.text);
        other.floatInWater();
    }
    public void helpOtherGooseSwim(){
        Bird other = new Goose();
    }
}

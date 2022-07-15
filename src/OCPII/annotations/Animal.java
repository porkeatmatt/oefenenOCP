package OCPII.annotations;


import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Target;

public class Animal {
    long l = 2;

    public enum Size {SMALL, MEDIUM, LARGE}

    @Documented
    public @interface Ano {

    }


    public @interface Exercise {
         int armLength();
         int anotherElement() default 7;
         enum Flavours{STRAWBERRY, APPLE};
         Size size() default Size.SMALL;
         Ano a() default @Ano;


    }

    @interface AnotherOne{
        String value();
        String required() default "";
        int[] ints() default {1, 5, 7};
    }

    @interface AnnotationwithArray{
        String[] value();
    }

    @Exercise (armLength = 0, anotherElement = 5)
    int aVariable = 5;

    @Target(ElementType.TYPE)
    @interface EmptyAnnot{

    }

}

class AnotherAnimal{
    @Animal.Exercise(armLength = 0) int anotherVariable = 7;
}

class Bear{
    @Animal.AnotherOne(value="lol", ints=8) int aVariable = 6;
    @Animal.AnotherOne(value="lol", ints={1,7}) int anotherVariable = 6;
    @Animal.AnotherOne("hihi") int thirdVariable = 6;

    @Animal.AnnotationwithArray({"lol","lmao"}) int fourthVariable =8;
    @Animal.AnnotationwithArray(value={"lol","lmao"}) int fifthVariable =8;
    @Animal.AnnotationwithArray("ditKan") int sixthVariable =8;
    @Animal.AnnotationwithArray(value="ditKan") int seventhVariable =8;

    //2 keer zelfde annot gebruiken, mag niet DNC
    //@Animal.EmptyAnnot @Animal.EmptyAnnot
    String aString = "";

    //kan je niet toepassen op een methode door type te gebruiken in target annotatie
    //@Animal.EmptyAnnot
    public void aMethod(){

    }
}




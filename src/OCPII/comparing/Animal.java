package OCPII.comparing;

import OCPI.casting.A;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Animal implements  Comparable<Animal>{

    

    private int id;

    private int secondId;

    private String name;

    public Animal(String n, int id, int secondId) {
        this.name = n;
        this.id = id;
        this.secondId = secondId;
    }

    public int compareTo(Animal a){
        return a.id - id;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getSecondId() {
        return secondId;
    }

    public void setSecondId(int secondId) {
        this.secondId = secondId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return ("beest met naam: " + name + "en secondId: " + secondId);
    }

    public static void main(String[] args) {

    Comparator<Animal> comp1 = new Comparator<>() {
            @Override
            public int compare(Animal a1, Animal a2) {
                return a1.name.compareTo(a2.name);
            }
        };

        var a1 = new Animal("Debby", 1 , 44);
        var a2 = new Animal("Matthias", 8, 55);
        var a3 = new Animal("Alexander", 5, 35);
        var a4 = new Animal("Z-Top", 11,1);

        List<Animal> list = new ArrayList<>();
        list.add(a1);
        list.add(a2);
        list.add(a3);
        list.add(a4);

        Comparator<Animal> comp2 = Comparator.comparingInt(Animal::getSecondId).thenComparingInt(Animal::getId);
        Comparator<Animal> comp3 = Comparator.naturalOrder();

        list.sort(comp2);

        System.out.println(list);



    }
}

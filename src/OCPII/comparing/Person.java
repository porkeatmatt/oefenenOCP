package OCPII.comparing;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

public class Person implements Comparator {

    private String firstName;

    private String lastName;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Person(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    @Override
    public int compare(Object o1, Object o2) {
        return 0;
    }

    public static void main(String[] args) {
        Comparator<Person> comp1 = Comparator.comparing(Person::getFirstName);
    }
}

package OCPII.fundamentals;

import OCPII.enums.Season;

public class Main {
    public static void main(String[] args) {
        Season s = Season.SUMMER;
        System.out.println(s.ordinal());
        Season s2 = Season.values()[1];
        System.out.println(s2);
    }
}

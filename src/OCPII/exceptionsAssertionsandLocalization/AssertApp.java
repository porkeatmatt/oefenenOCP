package OCPII.exceptionsAssertionsandLocalization;

public class AssertApp {
    public static void main(String[] args) {
        int count = -5;
        int isAllowed = 0;
        assert count > 0;
        assert (count>0):isAllowed++;
    }
}

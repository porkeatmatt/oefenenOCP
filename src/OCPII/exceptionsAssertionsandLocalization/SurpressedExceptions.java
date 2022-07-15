package OCPII.exceptionsAssertionsandLocalization;

public class SurpressedExceptions implements AutoCloseable {

    @Override
    public void close() {
        throw new IllegalStateException("supressed");
    }

    public static void main(String[] args) {
         try (SurpressedExceptions t = new SurpressedExceptions()) {
            throw new IllegalStateException("primary");
            // throw new RuntimeException("blijft niet lopen maar geeft wel surpressed mee");
            } catch (IllegalStateException e) {
            System.out.println("Caught: " + e.getMessage());
             for (Throwable t: e.getSuppressed())
                  System.out.println("Suppressed: "+t.getMessage());
             }
        System.out.println("code blijft lopen");
    }
}

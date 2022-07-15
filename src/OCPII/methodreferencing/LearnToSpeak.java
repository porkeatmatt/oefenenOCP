package OCPII.methodreferencing;

public interface LearnToSpeak {
    void speaking(String sound);
    static void interfaceSpeaking(String s){
        System.out.println("interface is speaking: " + s );
    }
}

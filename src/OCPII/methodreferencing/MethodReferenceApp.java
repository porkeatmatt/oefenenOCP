package OCPII.methodreferencing;

import java.util.function.Consumer;

public class MethodReferenceApp {

    public static void talkAndSpeaking (String firstsound, Consumer<String> consumer){
        consumer.accept(firstsound);
    }
    public static void learntospeak (){
        LearnToSpeak.interfaceSpeaking("kek");
    }

    public static void main(String[] args) {
        Consumer<String> testing = LearnToSpeak::interfaceSpeaking;

        talkAndSpeaking("hehehehe", testing);

        Short shortie = null;
        shortie = (short)1;
    }

}

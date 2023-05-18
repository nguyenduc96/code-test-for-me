package pattern.structual.adapter;

public class EnglishAdaptee {
    public void receive(String message) {
        System.out.println("Retrieving words from Adapter ...");
        System.out.println(message);
    }
}

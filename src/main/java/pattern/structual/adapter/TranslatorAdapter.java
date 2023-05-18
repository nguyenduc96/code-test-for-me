package pattern.structual.adapter;

public class TranslatorAdapter implements VietnameseTarget {
    private EnglishAdaptee englishAdaptee;

    public TranslatorAdapter(EnglishAdaptee englishAdaptee) {
        this.englishAdaptee = englishAdaptee;
    }

    public TranslatorAdapter() {}

    @Override
    public void send(String message) {
        System.out.println("Reading message....");
        System.out.println(message);
        String eng = translate(message);
        System.out.println("Sending ....");
        englishAdaptee.receive(eng);
    }

    private String translate(String message) {
        System.out.println("Translated!");
        return "Hello";
    }
}

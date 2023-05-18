package pattern.structual.adapter;

public class Main {
    public static void main(String[] args) {
        VietnameseTarget vietnameseTarget = new TranslatorAdapter(new EnglishAdaptee());
        vietnameseTarget.send("Xin chào");
    }
}

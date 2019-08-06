package wordCount;

public class Declaration {

    private String text;
    private String cleaned;
    private String[] words;

    public Declaration(String text){
        this.text = text.toLowerCase();
        cleaned = this.text.replaceAll("[[\\.\\?\\!\\,\\;\\:\\{\\}\\(\\)\\']]", "");
        words = cleaned.split(" +");
    }

    public String getText() {
        return text;
    }
    public String[] getWords() {
        return words;
    }
}

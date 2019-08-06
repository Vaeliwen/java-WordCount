package wordCount;

public class Declaration {

    private String text;
    private String cleaned;
    private String[] words;

    public Declaration(String text){
        this.text = text.toLowerCase();
        this.cleaned = text.replaceAll("[[\\.\\?\\!\\,\\;\\:\\{\\}\\(\\)\\']]", "");
        this.words = cleaned.split(" +");
    }

    public String getText() {
        return text;
    }
    public String[] getWords() {
        return words;
    }
}

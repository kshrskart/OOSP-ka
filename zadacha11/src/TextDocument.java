public class TextDocument implements DocumentPrototype {
    private String content;

    public TextDocument(String content) {
        this.content = content;
    }

    @Override
    public TextDocument clone() {
        return new TextDocument(this.content);
    }

    @Override
    public void setContent(String content) {
        this.content = content;
    }

    @Override
    public String getContent() {
        return this.content;
    }
}
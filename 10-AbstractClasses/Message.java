public abstract class Message {
    String text;

    public Message(String text) {
        this.text = text;
    }
    public int charNumber(){
        return text.length();
    }
    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }
    public abstract String send();
}

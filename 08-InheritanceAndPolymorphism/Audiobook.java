public class Audiobook extends Book{
    private int seconds;

    public Audiobook(String title,String author,int seconds){
        super(title,author);
        this.seconds = seconds;
    }

    public int getSeconds() {
        return seconds;
    }

    public void setSeconds(int seconds) {
        this.seconds = seconds;
    }
    public void display(){
        System.out.println("\nTitle: " + this.getTitle());
        System.out.println("Author: " + this.getAuthor());
        System.out.println("Duration: " + this.getSeconds() + " seconds");
    }
    public static void main(String[] args) {
        Audiobook a1 = new Audiobook("Wiedźmin", "Andrzej Sapkowski", 4000);
        a1.display();
    }
}

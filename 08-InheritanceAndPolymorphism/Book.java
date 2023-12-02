public class Book {
    private String title;
    private String author;
    public Book(String title, String author){
        this.title = title;
        this.author = author;

    }
    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public String getAuthor() {
        return author;
    }
    public void setAuthor(String author) {
        this.author = author;
    }

    public void display(){
        System.out.println("\nTitle: " + this.getTitle());
        System.out.println("Author: " + this.getAuthor());
    }
    public static void main(String[] args) {
        Book b1 = new Book("Gra o Tron","George R.R. Martin");
        b1.display();
        Book b2 = new Book("Wiedźmin","Andrzej Sapkowski");
        b2.display();

    }
}

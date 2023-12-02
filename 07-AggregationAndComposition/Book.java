public class Book {
    private String title;
    private int pages;
    private Writer writer;
    
    public Book(String title, int pages){
        this.title = title;
        this.pages = pages;
    }
    
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
    
public int getPages() {
        return pages;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }

    public void addWriter(Writer w){
        this.writer = w;
    }
    @Override
    public String toString(){
        return ("Title: " + title + ", " + "Pages: " + pages + ", " +writer.toString());
    }

    public static void main(String[] args) {
     
    }
}
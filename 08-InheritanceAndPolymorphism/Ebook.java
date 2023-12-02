public class Ebook extends Book{
    private String file;
    
    public Ebook(String title,String author,String file){
        super(title,author);
        this.file = file;

    }

    public String getFile() {
        return file;
    }

    public void setFile(String file) {
        this.file = file;
    }
    public void display(){
        System.out.println("\nTitle: " + this.getTitle());
        System.out.println("Author: " + this.getAuthor());
        System.out.println("File name: " + this.getFile());
    }

    public static void main(String[] args) {
        Ebook e1 = new Ebook("Uczta dla wron","George R.R. Martin","uczta_dla_wron.ebook");
        e1.display();
        Ebook e2 = new Ebook("Wiedźmin","Andrzej Sapkowski","wiedzmin.ebook");
        e2.display();
        Book b1 = new Book("Gra o Tron","George R.R. Martin");
        b1.display();
    

    }   
}

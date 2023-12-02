public class Library  {
    Book[] books = new Book[3];
    
    public void addBook(Book b,int nr){
        books[nr] = b;
    }

    public void displayBooks(){
        for(Book b: books){
            b.display();
        }
    }
    public static void main(String[] args) {
        Ebook e1 = new Ebook("Wiedźmin","Andrzej Sapkowski","wiedzmin.ebook");
        Book b1 = new Book("Gra o Tron","George R.R. Martin");
        Audiobook a1 = new Audiobook("Wiedźmin", "Andrzej Sapkowski", 4321);
        Library lib = new Library();
        lib.addBook(b1, 0);
        lib.addBook(e1, 1);
        lib.addBook(a1, 2);
        lib.displayBooks();

        
    }
}

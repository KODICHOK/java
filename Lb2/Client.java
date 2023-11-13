package Lb2;
import java.util.ArrayList;
import java.util.List;

public class Client {
    private String name;
    private List<Book> checkedOutBooks;
    private List<DVD> checkedOutDVD;

    public Client(String name) {
        this.name = name;
        this.checkedOutBooks = new ArrayList<>();
        this.checkedOutDVD = new ArrayList<>();
    }
    

    public String getName() {
        return name;
    }

    public List<Book> getCheckedOutBook() {
        return checkedOutBooks;
    }

    public List<Book> getCheckedOutDVD() {
        return checkedOutBooks;
    }

    public void checkOutBook(Book book) {
        checkedOutBooks.add(book);
    }

    public void checkInBook(Book item) {
        checkedOutBooks.remove(item);
    }
    
    public void checkOutDVD(DVD dvd) {
        checkedOutDVD.add(dvd);
    }

    public void checkInDVD(DVD item) {
        checkedOutDVD.remove(item);
    }

}

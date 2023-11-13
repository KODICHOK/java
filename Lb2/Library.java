package Lb2;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Library {
    private Map<String, Book> libraryBooks;
    private Map<String, DVD> libraryDVD;
    private Map<String, Client> clients;

    public Library() {
        libraryBooks = new HashMap<>();
        libraryDVD = new HashMap<>();
        clients = new HashMap<>();
    }

    public void addBook(String title, String author) {
        Book book = new Book(title, author);
        libraryBooks.put(title, book);
    }

    public void addDVD(String title, int duration) {
        DVD dvd = new DVD(duration, title);
        libraryDVD.put(title, dvd);
    }

    public void removeBook(String title) {
        if (libraryBooks.containsKey(title)) {
            libraryBooks.remove(title);
        } else {
            throw new IllegalArgumentException("Error, '" + title + "' does not exist, try again.");
        }
    }

    public void removeDVD(String title) {
        if (libraryDVD.containsKey(title)) {
            libraryDVD.remove(title);
        } else {
            throw new IllegalArgumentException("Error, '" + title + "' does not exist, try again.");
        }
    }

    public void registerClient(String name) {
        Client client = new Client(name);
        clients.put(name, client);
    }
    
    public void checkOutBook(String BookName, String clientName) {
        Book item = libraryBooks.get(BookName);
        Client client = clients.get(clientName);

        if (item != null && client != null && !item.isCheckedOut()) {
            item.checkOut();
            client.checkOutBook(item);
        } else {
            throw new IllegalArgumentException("Error.");
        }
    }

    public void checkOutDVD(String DVDName, String clientName) {
        DVD item = libraryDVD.get(DVDName);
        Client client = clients.get(clientName);

        if (item != null && client != null && !item.isCheckedOut()) {
            item.checkOut();
            client.checkOutDVD(item);
        } else {
            throw new IllegalArgumentException("Error.");
        }
    }

    public void checkInBook(String itemName, String clientName) {
        Book book = libraryBooks.get(itemName);
        Client client = clients.get(clientName);

        if (book != null && client != null) {
            book.checkIn();
            client.checkInBook(book);
        } else {
            throw new IllegalArgumentException("Error.");
        }
    }

    public void checkInDVD(String itemName, String clientName) {
        DVD dvd = libraryDVD.get(itemName);
        Client client = clients.get(clientName);

        if (dvd != null && client != null) {
            dvd.checkIn();
            client.checkInDVD(dvd);
        } else {
            throw new IllegalArgumentException("Error.");
        }
    }
    
}

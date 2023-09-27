import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Book {
    private String Name;
    private String author;
    private String isbn;
    private int Year;

    public Book(String Name, String author, String isbn, int Year) {
        this.Name = Name;
        this.author = author;
        this.isbn = isbn;
        this.Year = Year;
    }

    public String getName() {
        return Name;
    }

    public String getAuthor() {
        return author;
    }

    public String getIsbn() {
        return isbn;
    }

    public int Year() {
        return Year;
    }

    @Override
    public String toString() {
        return "Title: " + Name + ", Author: " + author + ", ISBN: " + isbn + ", Year: " + Year;
    }
}

class Library {
    private List<Book> books;

    public Library() {
        books = new ArrayList<>();
    }

    public void addBook(Book book) {
        books.add(book);
    }

    public void displayBooks() {
        for (Book book : books) {
            System.out.println(book);
        }
    }

    public Book findBookByTitle(String title) {
        for (Book book : books) {
            if (book.getName().equalsIgnoreCase(title)) {
                return book;
            }
        }
        return null;
    }

    public boolean removeBookByIsbn(String isbn) {
        for (Book book : books) {
            if (book.getIsbn().equals(isbn)) {
                books.remove(book);
                return true;
            }
        }
        return false;
    }
    public void clearLibrary() {
        books.clear();
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Library library = new Library();

        // Додавання книги
        Book book1 = new Book("The Witcher: The Last Wish", "Andrzej Sapkowski", "9780575082441", 1993);
        Book book2 = new Book("The Witcher: Sword of Destiny", "Andrzej Sapkowski", "9781473211537", 1992);

        library.addBook(book1);
        library.addBook(book2);

        while (true) {
            System.out.println("All books in the library:");
            library.displayBooks();
            System.out.println("Select an option:");
            System.out.println("1. Add new book");
            System.out.println("2. Find a book by title");
            System.out.println("3. Remove book by ISBN");
            System.out.println("4. select if you want to delete the entire library");
            System.out.println("5. Exit");

            int choice = scanner.nextInt();
            scanner.nextLine();
            switch (choice) {
                case 1:
                    System.out.println("book title:");
                    String title = scanner.nextLine();
                    System.out.println("author:");
                    String author = scanner.nextLine();
                    System.out.println("ISBN:");
                    String isbn = scanner.nextLine();
                    System.out.println("year of publication:");
                    int year = scanner.nextInt();
                    scanner.nextLine();
                    Book newBook = new Book(title, author, isbn, year);
                    library.addBook(newBook);
                    break;
                case 2:
                    System.out.println("Enter the title of the book to search:");
                    String searchName = scanner.nextLine();
                    library.findBookByTitle(searchName);
                    break;
                case 3:
                    System.out.println("Enter the ISBN of the book to delete:");
                    String deleteIsbn = scanner.nextLine();
                    library.removeBookByIsbn(deleteIsbn);
                    break;
                case 4:
                    library.clearLibrary();
                    break;
                case 5:
                    System.out.println("The program terminates.");
                    scanner.close();
                    System.exit(0);
                default:
                    System.out.println("try again.");
                    break;

            }
        }
    }
}

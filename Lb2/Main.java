package Lb2;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Library library = new Library();
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Welcom to library");
            System.out.println("\nMain Menu:");
            System.out.println("1. Add new Item");
            System.out.println("2. Remove Item");
            System.out.println("3. Add new client");
            System.out.println("4. borrow a Item ");
            System.out.println("5. Item return");
            System.out.println("7. Exite");

            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                System.out.print("select option: ");

                System.out.println("1. Add new Book");
                System.out.println("2. Add new DVD");

                int swe = scanner.nextInt();
                scanner.nextLine();
                switch (swe) {
                    case 1:
                    System.out.print("Write Book title: ");
                    String BookTitle = scanner.nextLine();
                    System.out.print("Write Book author: ");
                    String BookAuthor = scanner.nextLine();
                    library.addBook(BookTitle, BookAuthor);
                    break;
                    
                    case 2:
                    System.out.print("Write DVD title: ");
                    String DVDTitle = scanner.nextLine();
                    System.out.print("Write DVD duration: ");
                    int DVDduration = scanner.nextInt();
                    library.addDVD(DVDTitle, DVDduration);
                    break;
                }
                System.out.println("The item has been successfully added to the library.");
                break;

                case 2:
                System.out.print("select option: ");

                System.out.println("1. Deleted a Book");
                System.out.println("2. Deleted DVD");

                int swr = scanner.nextInt();
                scanner.nextLine();

                switch(swr) {
                    case 1:
                    String itemTitle = scanner.nextLine();
                    try {
                        library.removeBook(itemTitle);
                        System.out.println("Success.");
                    } catch (IllegalArgumentException e) {
                        System.out.println(e.getMessage());
                    }
                    break;

                    case 2:
                    itemTitle = scanner.nextLine();
                    try {
                        library.removeDVD(itemTitle);
                        System.out.println("Success.");
                    } catch (IllegalArgumentException e) {
                        System.out.println(e.getMessage());
                    }
                    break;
                }


                case 3:
                System.out.print("Enter client name: ");
                    String clientName = scanner.nextLine();
                    library.registerClient(clientName);
                    System.out.println("success.");
                    break;

                case 4:
                System.out.print("select option: ");

                System.out.println("1. borrow a book");
                System.out.println("2. borrow a DVD");

                int a = scanner.nextInt();
                scanner.nextLine();

                switch (a) {
                    case 1:
                    System.out.print("Enter the name of the  borrow item: ");
                       String itemTitle = scanner.nextLine();
                       System.out.print("Client name: ");
                       clientName = scanner.nextLine();
                        try {
                        library.checkOutBook(itemTitle, clientName);
                        System.out.println("success.");
                      } catch (IllegalArgumentException e) {
                        System.out.println(e.getMessage());
                    }
                    break;
                    case 2:
                    System.out.print("Enter the name of the  borrow item: ");
                       itemTitle = scanner.nextLine();
                       System.out.print("Client name: ");
                       clientName = scanner.nextLine();
                        try {
                        library.checkOutDVD(itemTitle, clientName);
                        System.out.println("success.");
                      } catch (IllegalArgumentException e) {
                        System.out.println(e.getMessage());
                    }
                    break;
                case 5:
                    System.out.print("select option: ");

                System.out.println("1. return a book");
                System.out.println("2. return a DVD");

                int b = scanner.nextInt();
                scanner.nextLine();
                    switch (b) {
                        case 1:

                        System.out.print("Book name: ");
                        itemTitle = scanner.nextLine();
                        System.out.print("Client name: ");
                        clientName = scanner.nextLine();
                        try {
                            library.checkInBook(itemTitle, clientName);
                            System.out.println("Предмет повернуто в бібліотеку.");
                        } catch (IllegalArgumentException e) {
                            System.out.println(e.getMessage());
                        }
                        break;

                        case 2:

                        System.out.print("DVD name: ");
                        itemTitle = scanner.nextLine();
                        System.out.print("Client name: ");
                        clientName = scanner.nextLine();
                        try {
                            library.checkInDVD(itemTitle, clientName);
                            System.out.println("Предмет повернуто в бібліотеку.");
                        } catch (IllegalArgumentException e) {
                            System.out.println(e.getMessage());
                        }
                        break;
                    }
                case 6:
                System.out.println("Thank you for using our library!");
                    scanner.close();
                    System.exit(0);

                default:
                System.out.println("Error, try again.");
            }
        }
    }
}
}

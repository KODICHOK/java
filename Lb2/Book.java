package Lb2;

class Book {
    private String title;
    private String author;
    private boolean isBorrowed;

    public Book(String author, String title){
        this.author = author;
        this.title = title;
        this.isBorrowed = false;
    }

    public boolean isCheckedOut() {
        return isBorrowed;
    }

    public void checkOut() {
        isBorrowed = true;
    }

    public void checkIn() {
        isBorrowed = false;
    }
}

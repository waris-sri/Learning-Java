public class Book {

    String title;
    String author;

    // Book() {
    // title = "Unknown";
    // author = "Unknown";
    // }

    // Book(String t) {
    // title = t;
    // author = "Unknown";
    // }

    // Book(String t, String a) {
    // title = t;
    // author = a;
    // }

    Book(String title, String author) {
        this.title = title;
        this.author = author;
    }

    void showBookInfo() {
        System.out.println("Title: " + title + ", Author: " + author);
    }

    public static void main(String[] args) {
        Book full = new Book("Something", "Someone");
        full.showBookInfo();

        // Book titleOnly = new Book("Something");
        // titleOnly.showBookInfo();
    }
}
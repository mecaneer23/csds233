package library;
import java.util.ArrayList;

public class Library {
    private ArrayList<Book> books;

    public Library() {
        books = new ArrayList<>();
    }

    public void addBook(Book book) {
        books.add(book);
    }

    public void removeBook(String isbn) {
        for (Book book : books) {
            if (book.getDetails().contains(isbn)) {
                books.remove(book);
                break;
            }
        }
    }

    public void printBooks() {
        for (Book book : books) {
            System.out.println(book.getDetails());
        }
    }
}

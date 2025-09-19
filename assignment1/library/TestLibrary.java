package library;
public class TestLibrary {
    public static void main(String[] args) {
        Library library = new Library();

        library.addBook(new Book("1984", "George Orwell", "1234567890"));
        library.addBook(new Book("To Kill a Mockingbird", "Harper Lee", "0987654321"));
        library.addBook(new Book("The Great Gatsby", "F. Scott Fitzgerald", "1122334455"));

        System.out.println("Books in the library:");
        library.printBooks();

        library.removeBook("0987654321");

        System.out.println("\nBooks in the library after removal:");
        library.printBooks();
    }
}

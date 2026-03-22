import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Library implements Serializable {
    private static final long serialVersionUID = 1L;
    private List<Book> books = new ArrayList<>();
    private List<LibraryClient> clients = new ArrayList<>();
    private List<Loan> loans = new ArrayList<>();

    public Library() {}

    public void addBook(Book book) { books.add(book); }
    public void addClient(LibraryClient client) { clients.add(client); }

    public void issueBook(Book book, LibraryClient client) {
        if (!book.isIssued()) {
            book.setIssued(true);
            loans.add(new Loan(book, client));
        }
    }

    // Метод серіалізації [cite: 84-85]
    public void saveToFile(String fileName) {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(fileName))) {
            oos.writeObject(this);
            System.out.println("Стан бібліотеки збережено.");
        } catch (IOException e) {
            System.out.println("Помилка збереження: " + e.getMessage());
        }
    }

    // Метод десеріалізації [cite: 85]
    public static Library loadFromFile(String fileName) {
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(fileName))) {
            return (Library) ois.readObject();
        } catch (IOException | ClassNotFoundException e) {
            return new Library();
        }
    }

    public List<Book> getBooks() { return books; }
    public List<Loan> getLoans() { return loans; }
}
import java.io.Serializable;

public class Loan implements Serializable {
    private static final long serialVersionUID = 1L;
    private Book book;
    private LibraryClient client;

    public Loan() {}

    public Loan(Book book, LibraryClient client) {
        this.book = book;
        this.client = client;
    }

    @Override
    public String toString() {
        return "Запис: Книга '" + book.getTitle() + "' -> Клієнт: " + client.getFirstName() + " " + client.getLastName();
    }
}
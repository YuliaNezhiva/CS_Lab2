import java.io.Serializable;

public class Book implements Serializable {
    private static final long serialVersionUID = 1L;
    private String title;
    private Author author;
    private boolean isIssued; // Стан: видана чи в наявності [cite: 78]

    public Book() { this.isIssued = false; }

    public Book(String title, Author author) {
        this.title = title;
        this.author = author;
        this.isIssued = false;
    }

    public String getTitle() { return title; }
    public void setTitle(String title) { this.title = title; }
    public Author getAuthor() { return author; }
    public void setAuthor(Author author) { this.author = author; }
    public boolean isIssued() { return isIssued; }
    public void setIssued(boolean issued) { isIssued = issued; }

    @Override
    public String toString() {
        return "Книга: '" + title + "' (" + author + ") [" + (isIssued ? "Видана" : "В наявності") + "]";
    }
}

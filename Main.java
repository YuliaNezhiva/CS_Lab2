import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Library myLibrary = new Library();
        Scanner scanner = new Scanner(System.in);
        String storageFile = "library_state.ser";

        while (true) {
            System.out.println("\n--- БІБЛІОТЕКА (КБ-21 Нежива Ю.) ---");
            System.out.println("1. Додати книгу");
            System.out.println("2. Показати всі книги");
            System.out.println("3. Видати книгу клієнту");
            System.out.println("4. Зберегти стан (Серіалізація)");
            System.out.println("5. Завантажити стан (Десеріалізація)");
            System.out.println("0. Вихід");

            int choice = scanner.nextInt();
            scanner.nextLine();

            if (choice == 1) {
                System.out.print("Назва: "); String title = scanner.nextLine();
                System.out.print("Автор (Прізвище): "); String author = scanner.nextLine();
                myLibrary.addBook(new Book(title, new Author(author, "")));
            } else if (choice == 2) {
                System.out.println("Список книг:");
                for (Book b : myLibrary.getBooks()) System.out.println(b);
            } else if (choice == 4) {
                myLibrary.saveToFile(storageFile);
            } else if (choice == 5) {
                myLibrary = Library.loadFromFile(storageFile);
                System.out.println("Дані успішно відновлено!");
            } else if (choice == 0) break;
        }
    }
}
import java.io.Serializable;

public abstract class Human {
    private String firstName;
    private String lastName;

    public Human() {} // Конструктор за замовчуванням [cite: 4, 67]

    public Human(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    // Геттери та сеттери [cite: 4, 67]
    public String getFirstName() { return firstName; }
    public void setFirstName(String firstName) { this.firstName = firstName; }
    public String getLastName() { return lastName; }
    public void setLastName(String lastName) { this.lastName = lastName; }

    @Override
    public String toString() { return firstName + " " + lastName; }
}
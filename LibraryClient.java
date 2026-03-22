public class LibraryClient extends Human {
    private int clientId;

    public LibraryClient() { super(); }
    public LibraryClient(int id, String firstName, String lastName) {
        super(firstName, lastName);
        this.clientId = id;
    }

    public int getClientId() { return clientId; }
    public void setClientId(int clientId) { this.clientId = clientId; }

    @Override
    public String toString() {
        return "ID: " + clientId + " | " + super.toString();
    }
}
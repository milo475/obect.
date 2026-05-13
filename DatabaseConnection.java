public class DatabaseConnection {
    private static DatabaseConnection instance;
    private String url;

    private DatabaseConnection() {
        this.url = "jdbc:mysql://localhost:3306/mydb";
        System.out.println("DatabaseConnection uusle.");
    }

    public static DatabaseConnection getInstance() {
        if (instance == null) {
            instance = new DatabaseConnection();
        }
        return instance;
    }

    public String getUrl() { return url; }

    public static void main(String[] args) {
        DatabaseConnection c1 = DatabaseConnection.getInstance();
        DatabaseConnection c2 = DatabaseConnection.getInstance();

        System.out.println("c1 == c2: " + (c1 == c2));
        System.out.println("URL: " + c1.getUrl());
    }
}
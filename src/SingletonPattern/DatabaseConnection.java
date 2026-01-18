package SingletonPattern;

public class DatabaseConnection {
  private static DatabaseConnection instance = null;

  private DatabaseConnection() {
    System.out.println("Database Connection Created");
  }


    public static DatabaseConnection getInstance() {
      if(instance == null){
        return new DatabaseConnection();
      }else {
        return instance;
      }
    }

    public void executeQuery(String query) {
      System.out.println("Executing query: " + query);
    }
}

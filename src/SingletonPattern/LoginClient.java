package SingletonPattern;

public class LoginClient {
  private DatabaseConnection dbClient = DatabaseConnection.getInstance();

  public void print(){
    dbClient.executeQuery("Database connected successfully");
  }
}

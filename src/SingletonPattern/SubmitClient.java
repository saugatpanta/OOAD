package SingletonPattern;

public class SubmitClient {
  private DatabaseConnection dbClient = DatabaseConnection.getInstance();

  public void print(){
    dbClient.executeQuery("Submitted query");
  }
}

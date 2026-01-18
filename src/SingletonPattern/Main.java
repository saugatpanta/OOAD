package SingletonPattern;

public class Main {
  public static void main(String[] args) {
    LoginClient lc = new LoginClient();
    lc.print();

    SubmitClient sc = new SubmitClient();
    sc.print();
  }
}

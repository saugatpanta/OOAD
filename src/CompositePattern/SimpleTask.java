package CompositePattern;

public class SimpleTask extends Task {

  public SimpleTask(String title) {
    setTitle(title);
  }

  @Override
  public void display() {
      System.out.println("Task Title: "+getTitle());
  }
}
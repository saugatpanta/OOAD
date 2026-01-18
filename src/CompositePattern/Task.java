package CompositePattern;

public abstract class Task {
  protected String title;

  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public abstract void display();

}

package CompositePattern;

public class Client {
  public static void main(String[] args){
    SimpleTask st = new SimpleTask("Boil Water");
    TaskList recipe = new TaskList();
    recipe.addTask(st);

    st = new SimpleTask("Add Milk");
    recipe.addTask(st);

    st = new SimpleTask("Add Sugar");
    recipe.addTask(st);

    st = new SimpleTask("Add Tea Leafs");
    recipe.addTask(st);

    st = new SimpleTask("Boil for 4 mins");
    recipe.addTask(st);

    st = new SimpleTask("Put the tea on the cup");
    recipe.addTask(st);

    st = new SimpleTask("Turn off the gas");
    recipe.addTask(st);

    st = new SimpleTask("Serve the tea");
    recipe.addTask(st);

    recipe.display();
  }
}

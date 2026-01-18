package CompositePattern;

import java.util.ArrayList;
import java.util.List;

public class TaskList extends Task{
  private List<Task> tasks = new ArrayList<Task>();

  public void addTask(Task task){
    tasks.add(task);
  }

  public void removeTask(Task task){
    tasks.remove(task);
  }

  public void display(){
    for (Task task : tasks){
      task.display();
    }
  }

}

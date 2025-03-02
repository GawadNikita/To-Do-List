import java.util.ArrayList;

public class ToDoList {
  private ArrayList<Task> tasks;

  public ToDoList() {
    this.tasks = new ArrayList<>();
  }

  public void addTask(String description) {
    tasks.add(new Task(description));
  }

  public void markTaskCompleted(int index) {
    if (index >= 0 && index < tasks.size()) {
      tasks.get(index).markCompleted();
    }
  }

  public void deleteTask(int index) {
    if (index >= 0 && index < tasks.size()) {
      tasks.remove(index);
    }
  }

  public void displayTasks() {
    if (tasks.isEmpty()) {
      System.out.println("No tasks available.");
    } else {
      for (int i = 0; i < tasks.size(); i++) {
        System.out.println((i + 1) + ". " + tasks.get(i));
      }
    }
  }
}

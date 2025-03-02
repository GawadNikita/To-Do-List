import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    ToDoList toDoList = new ToDoList();
    Scanner scanner = new Scanner(System.in);
    int choice;

    do {
      System.out.println("\nTo-Do List Menu:");
      System.out.println("1. Add Task");
      System.out.println("2. View Tasks");
      System.out.println("3. Mark Task Completed");
      System.out.println("4. Delete Task");
      System.out.println("5. Exit");
      System.out.print("Enter your choice: ");
      choice = scanner.nextInt();
      scanner.nextLine(); // Consume newline

      switch (choice) {
        case 1:
          System.out.print("Enter task description: ");
          String description = scanner.nextLine();
          toDoList.addTask(description);
          break;
        default:
          System.out.println("Invalid choice! Please try again.");
        case 2:
          toDoList.displayTasks();
          break;
        case 3:
          System.out.print("Enter task number to mark as completed: ");
          int completeIndex = scanner.nextInt() - 1;
          toDoList.markTaskCompleted(completeIndex);
          break;
        case 4:
          System.out.print("Enter task number to delete: ");
          int deleteIndex = scanner.nextInt() - 1;
          toDoList.deleteTask(deleteIndex);
          break;
        case 5:
          System.out.println("Exiting... Thank you!");
          break;
      }
    } while (choice != 5);

    scanner.close();
  }
}
import java.util.Scanner;

public class TaskManager {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("=== My Tasks ===");
        System.out.println("1. Finish Java assignment");
        System.out.println("2. Study Git");

        System.out.print("Enter a new task: ");
        String newTask = input.nextLine();

        System.out.println("3. " + newTask);
    }
}
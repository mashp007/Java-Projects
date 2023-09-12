/*
 * Project Name: Interactive To-Do List

Problem Statement:
Managing tasks and to-do lists efficiently is a common challenge for individuals and professionals. This project aims to create a simple interactive To-Do List application in Java that allows users to add tasks, list tasks, mark tasks as completed, and exit the application.

Input:

Users interact with the program through a menu system.
The menu offers four options:
Add Task: Users can input a description for a new task.
List Tasks: Users can view the list of tasks along with their completion status.
Mark Task as Completed: Users can mark a specific task as completed.
Exit: Users can choose to exit the program.
Output:

The program provides the following outputs based on user actions:
When adding a task, it confirms the task addition.
When listing tasks, it displays the tasks along with their completion status.
When marking a task as completed, it confirms the task's completion.
When exiting, it displays an exit message and terminates the program.
Algorithm:

Initialize necessary variables and arrays to store tasks, task completion statuses, the maximum number of tasks allowed, and the current task count.

Enter a while loop that displays a menu with four options: Add Task, List Tasks, Mark Task as Completed, and Exit.

Read the user's choice from the console.

Based on the user's choice:

Option 1: If the task count is within the maximum limit, prompt the user for a task description, and store it in the tasks array along with its completion status (initially set to "not completed").
Option 2: List all tasks along with their completion status. If no tasks exist, indicate that there are no tasks to display.
Option 3: Allow the user to mark a specific task as completed by entering the task number. Update the task's completion status accordingly.
Option 4: Display an exit message and terminate the program.
For invalid menu choices, display an error message and continue the loop to prompt the user again.

The loop continues until the user chooses to exit the program.

Conclusion:
The Interactive To-Do List project provides a user-friendly interface for managing tasks. It demonstrates the use of basic control structures, such as loops and conditional statements, as well as arrays for data storage. This project is suitable for beginners looking to practice Java programming fundamentals while creating a practical application.
 */


import java.util.Scanner;

public class ToDoList {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int maxSize = 100; // Maximum number of tasks
        String[] tasks = new String[maxSize];
        boolean[] isCompleted = new boolean[maxSize];
        int taskCount = 0;

        while (true) {
            System.out.println("\nTo-Do List Menu:");
            System.out.println("1. Add Task");
            System.out.println("2. List Tasks");
            System.out.println("3. Mark Task as Completed");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");

            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume the newline character

            switch (choice) {
                case 1:
                    if (taskCount < maxSize) {
                        System.out.print("Enter task description: ");
                        String description = scanner.nextLine();
                        tasks[taskCount] = description;
                        isCompleted[taskCount] = false;
                        taskCount++;
                        System.out.println("Task added!");
                    } else {
                        System.out.println("Task limit reached. Cannot add more tasks.");
                    }
                    break;
                case 2:
                    if (taskCount == 0) {
                        System.out.println("No tasks to display.");
                    } else {
                        System.out.println("\nTasks:");
                        for (int i = 0; i < taskCount; i++) {
                            String status = isCompleted[i] ? "[X] " : "[ ] ";
                            System.out.println(i + 1 + ". " + status + tasks[i]);
                        }
                    }
                    break;
                case 3:
                    if (taskCount == 0) {
                        System.out.println("No tasks to mark as completed.");
                    } else {
                        System.out.print("Enter the task number to mark as completed: ");
                        int index = scanner.nextInt();
                        scanner.nextLine(); // Consume the newline character

                        if (index >= 1 && index <= taskCount) {
                            isCompleted[index - 1] = true;
                            System.out.println("Task marked as completed!");
                        } else {
                            System.out.println("Invalid task number.");
                        }
                    }
                    break;
                case 4:
                    System.out.println("Exiting...");
                    System.exit(0);
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}

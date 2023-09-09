/*
 * Project Name: Student Gradebook

Project Overview:
The Student Gradebook is a simple Java application that allows users to manage student information and test scores. It provides basic functionality to add, remove, and display students and their corresponding test scores. Additionally, it calculates and displays statistics such as the average score, highest score, and lowest score.

How It Works:

Initialization:

The project initializes two arrays: one for storing student names and another for storing their test scores. It also keeps track of the number of students in the gradebook using the numberOfStudents variable.
Menu and User Interaction:

The program displays a menu with options for the user to choose from. These options typically include adding a student, displaying the gradebook, displaying statistics, and quitting the program.
Adding a Student:

When the user selects the option to add a student, they are prompted to enter the student's name and test score. The program then adds this information to the respective arrays, increasing the numberOfStudents counter.
Displaying the Gradebook:

Selecting the option to display the gradebook results in the program listing all the students' names and their corresponding test scores.
Calculating Statistics:

When the user chooses to display statistics, the program calculates and displays the average score, highest score, and lowest score. These calculations are performed by iterating through the arrays of test scores.
Exiting the Program:

If the user selects the option to quit, the program exits.
Algorithms and Data Structures:

Arrays: This project heavily relies on arrays to store and manage data. Two arrays are used: one for student names and another for test scores. These arrays allow efficient storage and retrieval of student information.

Average Calculation: To calculate the average score, the program iterates through the array of test scores, sums up the scores, and divides the total by the number of students. This process uses a simple arithmetic algorithm.

Highest and Lowest Score Calculation: The program finds the highest and lowest scores by iterating through the array of test scores while keeping track of the maximum and minimum scores encountered. This involves basic conditional logic to compare values.

User Interaction: The program uses a menu-driven approach to interact with the user, which involves simple if-else or switch-case statements for handling user input.

This project is an excellent way to practice the use of arrays in Java, user interaction, and basic algorithmic calculations. While it uses basic algorithms and data structures, it serves as a foundation for more complex projects and further exploration of Java programming concepts.
 */



import java.util.Scanner;

public class StudentGradebook {
    String[] studentNames = new String[10]; // Adjust the size as needed
    int[] testScores = new int[10];
    int numberOfStudents = 0; // This will keep track of the number of students in the gradebook

    // Function to add a student and their test score to the arrays
    public void addStudent(String name, int score) {
        if (numberOfStudents < studentNames.length) {
            studentNames[numberOfStudents] = name;
            testScores[numberOfStudents] = score;
            numberOfStudents++;
        } else {
            System.out.println("The gradebook is full. Cannot add more students.");
        }
    }

    // Function to display the list of students and their scores
    public void displayGradebook() {
        System.out.println("Student Gradebook:");
        for (int i = 0; i < numberOfStudents; i++) {
            System.out.println(studentNames[i] + ": " + testScores[i]);
        }
    }

    // Function to calculate and display average, highest, and lowest scores
    public void displayStatistics() {
        int total = 0;
        int highestScore = Integer.MIN_VALUE;
        int lowestScore = Integer.MAX_VALUE;

        for (int i = 0; i < numberOfStudents; i++) {
            total += testScores[i];
            highestScore = Math.max(highestScore, testScores[i]);
            lowestScore = Math.min(lowestScore, testScores[i]);
        }

        double average = (double) total / numberOfStudents;

        System.out.println("Average Score: " + average);
        System.out.println("Highest Score: " + highestScore);
        System.out.println("Lowest Score: " + lowestScore);
    }

    public static void main(String[] args) {
        StudentGradebook gradebook = new StudentGradebook();
        Scanner scanner = new Scanner(System.in);
        boolean running = true;

        while (running) {
            System.out.println("Choose an option:");
            System.out.println("1. Add a student");
            System.out.println("2. Display gradebook");
            System.out.println("3. Display statistics");
            System.out.println("4. Quit");


            try {
                int choice = scanner.nextInt();
                scanner.nextLine(); // Consume the newline character

                switch (choice) {
                    case 1:
                        System.out.print("Enter student name: ");
                        String name = scanner.nextLine();
                        System.out.print("Enter test score: ");
                        int score = scanner.nextInt();
                        scanner.nextLine(); // Consume the newline character
                        gradebook.addStudent(name, score);
                        break;
                    case 2:
                        gradebook.displayGradebook();
                        break;
                    case 3:
                        gradebook.displayStatistics();
                        break;
                    case 4:
                        running = false;
                        break;
                    default:
                        System.out.println("Invalid choice. Please try again.");
                }
            } catch (java.util.InputMismatchException e) {
                System.out.println("Invalid input. Please enter a valid number.");
                scanner.nextLine(); // Consume the invalid input
            }

        }
    }
}

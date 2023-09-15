/*
 * Project Name: Simple Student Record System

Project Description:
The Simple Student Record System is designed to introduce beginners to the concept of object creation and manipulation in Java. In this project, we'll create and interact with student objects. Each student object will have attributes like name, roll number, and marks. Users can add, view, and search for student records.

Key Concepts Covered:

Object creation
Class definition
Object attributes
Methods for interacting with objects

Implementation Steps:

Step 1: Define the Student Class

In this step, we define a Student class with attributes like name, rollNumber, and marks. We also create a constructor to initialize these attributes when a new student object is created.

Step 2: Create and Interact with Student Objects

In this step, we create two Student objects: student1 and student2. We access and display their information by accessing their attributes.

Step 3: Compile and Run the Program

Compile the Java file (Student.java and StudentRecordSystem.java) using javac.
Run the program using java StudentRecordSystem.

Explanation:

We define a Student class with attributes.
In the StudentRecordSystem class, we create two student objects (student1 and student2) using the new keyword and the constructor.
We access and display the attributes of these student objects.

This project introduces beginners to the concept of object creation, class definition, and attribute access. It's a simple and interactive way to understand the basics of object-oriented programming in Java. Students can expand on this project by adding more features, such as searching for students or calculating averages.
 */

class Student {
    // Define attributes
    String name;
    int rollNumber;
    double marks;

    // Constructor to initialize attributes
    public Student(String name, int rollNumber, double marks) {
        this.name = name;
        this.rollNumber = rollNumber;
        this.marks = marks;
    }
}

public class StudentRecordSystem {
    public static void main(String[] args) {
        // Create student objects
        Student student1 = new Student("Alice", 101, 85.5);
        Student student2 = new Student("Bob", 102, 78.0);
        
        // Access and display student information
        System.out.println("Student 1:");
        System.out.println("Name: " + student1.name);
        System.out.println("Roll Number: " + student1.rollNumber);
        System.out.println("Marks: " + student1.marks);

        System.out.println("\nStudent 2:");
        System.out.println("Name: " + student2.name);
        System.out.println("Roll Number: " + student2.rollNumber);
        System.out.println("Marks: " + student2.marks);
    }
}

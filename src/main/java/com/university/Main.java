package com.university;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        University university = new University("My University");

        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\nUniversity Management System");
            System.out.println("1. Create a new faculty");
            System.out.println("2. Add a student to a faculty");
            System.out.println("3. Graduate a student");
            System.out.println("4. Display current enrolled students");
            System.out.println("5. Display graduates");
            System.out.println("6. Find faculty by student email");
            System.out.println("7. Display all faculties");
            System.out.println("8. Display faculties by field");
            System.out.println("0. Exit");
            System.out.print("Enter your choice: ");

            choice = scanner.nextInt();
            scanner.nextLine();  // Consume the newline character

            switch (choice) {
                case 1:
                    // Create a new faculty
                    university.addFaculty();
                    break;
                case 2:
                    // Add a student to a faculty
                    addStudent();
                    break;
                case 3:
                    // Graduate a student
                    // Implement graduation logic
                    break;
                case 4:
                    university.displayStudents();
                    break;
                case 5:
                    // Display graduates
                    // Implement display logic
                    break;
                case 6:
                    // Find faculty by student email
                    System.out.print("Enter student email to find the faculty: ");
                    String studentEmailToFind = scanner.nextLine();
                    Faculty foundFaculty = university.findFacultyByStudentEmail(studentEmailToFind);

                    if (foundFaculty != null) {
                        System.out.println("Student with email " + studentEmailToFind + " belongs to " + foundFaculty.getName());
                    } else {
                        System.out.println("Student with email " + studentEmailToFind + " not found.");
                    }
                    break;
                case 7:
                    // Display all faculties
                    System.out.println("All Faculties:");
                    university.displayAllFaculties();
                    break;
                case 8:
                    // Display faculties by field
                    System.out.print("Enter study field (e.g., Mechanical_Engineering) to display faculties: ");
                    String fieldToDisplay = scanner.nextLine();
                    StudyField field = StudyField.valueOf(fieldToDisplay);
                    university.displayFacultiesByField(field);
                    break;
                case 0:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice. Please enter a valid option.");
                    break;
            }
        } while (choice != 0);

        scanner.close();
    }

    private static void addStudent(){
        Student student = new Student();
        University university = new University("My University");
        student = university.addStudent(student);
    }
}

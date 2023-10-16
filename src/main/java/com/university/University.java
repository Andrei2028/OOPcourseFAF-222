package com.university;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class University {
    private String name;
    private List<Faculty> faculties;
    private Scanner scanner = new Scanner(System.in);
    public University(String name) {
        this.name = name;
        this.faculties = new ArrayList<>();
    }

    public void createFaculty(Faculty faculty) {
        faculties.add(faculty);
    }

    public Faculty findFacultyByAbbreviation(String abbreviation) {
        for (Faculty faculty : faculties) {
            if (faculty.getAbbreviation().equalsIgnoreCase(abbreviation)) {
                return faculty;
            }
        }
        return null;
    }

    public Faculty findFacultyByStudentEmail(String studentEmail) {
        for (Faculty faculty : faculties) {
            for (Student student : faculty.getStudents()) {
                if (student.getEmail().equalsIgnoreCase(studentEmail)) {
                    return faculty;
                }
            }
        }
        return null;
    }

    public void displayAllFaculties() {
        for (Faculty faculty : faculties) {
            System.out.println(faculty);
        }
    }

    public void displayFacultiesByField(StudyField field) {
        for (Faculty faculty : faculties) {
            if (faculty.getStudyField() == field) {
                System.out.println(faculty);
            }
        }
    }

    public void addFaculty(){
        System.out.print("Enter faculty name: ");
        String facultyName = scanner.nextLine();
        System.out.print("Enter faculty abbreviation: ");
        String facultyAbbreviation = scanner.nextLine();
        System.out.print("Enter study field (e.g., Mechanical_Engineering): ");
        String studyFieldStr = scanner.nextLine();
        StudyField studyField = StudyField.valueOf(studyFieldStr);
        Faculty faculty = new Faculty(facultyName, facultyAbbreviation, studyField);
        this.createFaculty(faculty);
    }

    public Student addStudent(Student student){
        System.out.print("Enter student first name: ");
                    String firstName =scanner.nextLine();
                    student.setFirstName(firstName);
                    System.out.print("Enter student last name: ");
                    String lastName =scanner.nextLine();
                    student.setLastName(lastName);
                    System.out.print("Enter student email: ");
                    String email = scanner.nextLine();
                    student.setEmail(email);
                    System.out.print("Enter enrollment date (yyyy-MM-dd): ");
                    String enrollmentDateStr = scanner.nextLine();
                    student.setEnrollmentDate(enrollmentDateStr);
                    System.out.print("Enter date of birth (yyyy-MM-dd): ");
                    String dateOfBirthStr = scanner.nextLine();
                    student.setDateOfBirth(dateOfBirthStr);

                    // Parse date strings to Date objects (implement this conversion)
                    // Date enrollmentDate = parseDate(enrollmentDateStr);
                    // Date dateOfBirth = parseDate(dateOfBirthStr);
                    for(Faculty faculty: faculties){
                    System.out.print("Enter faculty abbreviation to add the student to: ");
                    String facultyAbbreviationToAdd = scanner.nextLine();
                    Faculty targetFaculty = this.findFacultyByAbbreviation(facultyAbbreviationToAdd);

                    if (targetFaculty != null) {
                        faculty.addStudent(student);
                        System.out.println("Student added to " + targetFaculty.getName());
                    } else {
                        System.out.println("Faculty not found with abbreviation: " + facultyAbbreviationToAdd);
                    }
                }
                return student;
    }

    public void displayStudents(){
        for(Faculty faculty: faculties){
        for(Student student: faculty.getStudents()){
            System.out.println(student);
        }
        }
    }
}

package com.university;

import java.util.*;

public class University {
    private String name;
    private List<Faculty> faculties;

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
}

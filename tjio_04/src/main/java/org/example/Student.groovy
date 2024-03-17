package org.example

class Student {
    private String name
    private String surname
    private String studentId
    private Grade[] grades


    // Konstruktor
    Student(String name, String surname, String studentId) {
        this.name = name
        this.surname = surname
        this.studentId = studentId
    }

    // Gettery i settery (opcjonalnie)
    String getName() {
        return name
    }

    void setName(String name) {
        this.name = name
    }

    String getSurname() {
        return surname
    }

    void setSurname(String surname) {
        this.surname = surname
    }

    String getStudentId() {
        return studentId
    }

    void setStudentId(String studentId) {
        this.studentId = studentId
    }


    Grade[] getGrades() {
        return grades
    }

    void addGrade(Grade newGrade) {
        if (grades == null) {
            grades = new Grade[1]
            grades[0] = newGrade
        } else {
            Grade[] newGrades = new Grade[grades.length + 1]
            for (int i = 0; i < grades.length; i++) {
                newGrades[i] = grades[i]
            }
            newGrades[grades.length] = newGrade
            grades = newGrades
        }
    }

//    double calculateAverageGrade(String subject) {
//        if (grades == null) {
//            return 0
//        }
//        double sum = 0
//        int count = 0
//        grades.each { grade ->
//            if (grade.getSubject() == subject) {
//                sum += grade.getGrade()
//                count++
//            }
//        }
//        return count > 0 ? sum / count : 0
//    }
}

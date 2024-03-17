package org.example

class Grade {
    private String subject
    private float grade

    Grade(String subject, float grade) {
        this.subject = subject
        this.grade = grade
    }

    String getSubject() {
        return subject
    }
    float getGrade() {
        return grade
    }

}

package org.example

class StudentManager {
    private List<Student> students = new ArrayList<Student>()

    void addStudent(Student student) {
        println "Adding student: ${student.getName()} ${student.getSurname()} ${student.getStudentId()}"
        students.add(student)
    }

    List<Student> getStudents() {
        return students
    }


}

package org.example

class StudentManager {
    private List<Student> students = new ArrayList<Student>()

    List<Student> getStudents() {
        return students
    }

    void addStudent(Student student) {
        println "Adding student: ${student.getName()} ${student.getSurname()} ${student.getStudentId()}"
        students.add(student)
    }

    void updateStudent(String studentId, String name, String surname) {
        students.each { student ->
            if (student.getStudentId() == studentId) {
                student.setName(name)
                student.setSurname(surname)
                println "Update student: ${student.getName()} ${student.getSurname()} ${student.getStudentId()}"

            }
        }
    }

    void removeStudent(String studentId) {
        students.removeIf { student -> student.getStudentId() == studentId }
        println "Remove student by id: ${studentId}"
    }
}

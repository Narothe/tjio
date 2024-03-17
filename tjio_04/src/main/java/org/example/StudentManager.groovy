package org.example

class StudentManager {
    private List<Student> students = new ArrayList<Student>()

    List<Student> getStudents() {
        return students
    }

    void addStudent(Student student) {
        students.add(student)
        println "Adding student: ${student.getName()} ${student.getSurname()} ${student.getStudentId()}"
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

    void addGrade(String studentId, String subject, float grade) {
        students.each { student ->
            if (student.getStudentId() == studentId) {
                student.addGrade(new Grade(subject, grade))
                println "Add grade: ${student.getName()} ${student.getSurname()} ${student.getStudentId()} ${subject} ${grade}"
            }
        }
    }

    Object calculateAverageGrade(String studentId, String subject) {
        def average = 0.0
        def count = 0
        students.each { student ->
            if (student.getStudentId() == studentId) {
                student.getGrades().each { grade ->
                    if (grade.getSubject() == subject) {
                        average += grade.getGrade()
                        count++
                    }
                }
            }
        }
        if (count > 0) {
            average /= count
        }
        println("Average grade: ${average}, from subject: ${subject}, for student: ${studentId}")
        return average
    }
}

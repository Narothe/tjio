import org.example.Student
import org.example.StudentManager

import spock.lang.Specification

class StudentManagerTest extends Specification {
    def "test add student"() {
        println("test add student")

        given:
        def studentManager = new StudentManager()
        def student = new Student("John", "Doe", "1")

        when:
        studentManager.addStudent(student)

        then:
        studentManager.getStudents().size() == 1
    }

    def "test update student"() {
        println("test update student")

        given:
        def studentManager = new StudentManager()
        def student = new Student("John", "Doe", "1")
        studentManager.addStudent(student)

        when:
        studentManager.updateStudent("1", "John", "Smith")

        then:
        studentManager.getStudents().size() == 1
        studentManager.getStudents().get(0).getSurname() == "Smith"
    }

    // funkcja do usuwania studenta po id
    def "test remove student"() {
        println("test remove student")

        given:
        def studentManager = new StudentManager()
        def student = new Student("John", "Doe", "1")
        studentManager.addStudent(student)

        when:
        studentManager.removeStudent("1")

        then:
        studentManager.getStudents().size() == 0
    }

}

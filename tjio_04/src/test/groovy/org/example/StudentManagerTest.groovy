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
        println("\ntest update student")

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

    def "test remove student by id"() {
        println("\ntest remove student")

        given:
        def studentManager = new StudentManager()
        def student = new Student("John", "Doe", "1")
        studentManager.addStudent(student)

        when:
        studentManager.removeStudent("1")

        then:
        studentManager.getStudents().size() == 0
    }

    def "test add grade"() {
        println("\ntest add grade")

        given:
        def studentManager = new StudentManager()
        def student = new Student("John", "Doe", "1")
        studentManager.addStudent(student)

        when:
        studentManager.addGrade("1", "Math", 5.0)
        studentManager.addGrade("1", "Math", 4.0)
        studentManager.addGrade("1", "Physic", 4.0)
        studentManager.addGrade("1", "Physic", 3.0)

        then:
        studentManager.getStudents().size() == 1
        studentManager.getStudents().get(0).getGrades().size() == 4
    }

    def "test calculate average grade"() {
        println("\ntest calculate average grade")

        given:
        def studentManager = new StudentManager()
        def student = new Student("John", "Doe", "1")
        studentManager.addStudent(student)
        studentManager.addGrade("1", "Math", 5.0)
        studentManager.addGrade("1", "Math", 4.0)
        studentManager.addGrade("1", "Physic", 4.0)
        studentManager.addGrade("1", "Physic", 3.0)

        when:
        def averageMath = studentManager.calculateAverageGrade("1", "Math")
        def averagePhysic = studentManager.calculateAverageGrade("1", "Physic")

        then:
        averageMath == 4.5
        averagePhysic == 3.5
    }


}

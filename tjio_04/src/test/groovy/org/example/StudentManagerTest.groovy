import org.example.Student
import org.example.StudentManager

import spock.lang.Specification

class StudentManagerTest extends Specification {
    def "test add student"() {
        given:
            def studentManager = new StudentManager()
            def student = new Student("John", "Doe", 1)

        when:
            studentManager.addStudent(student)

        then:
            studentManager.getStudents().size() == 1
    }

    // funkcja testowa do aktualizacji danych personalnych istniejeącego studenta
    def "test update student"() {
        given:
            def studentManager = new StudentManager()
            def student = new Student("John", "Doe", 1)
            studentManager.addStudent(student)
            def student2 = new Student("John", "Doe", 1)

        when:
            studentManager.updateStudent(student2)

        then:
            studentManager.getStudents().size() == 1
    }


}

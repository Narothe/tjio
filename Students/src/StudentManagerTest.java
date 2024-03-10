import java.util.List;

public class StudentManagerTest {
    // Konstruktor inicjalizujący StudentManager
    public StudentManagerTest() {
        this.studentManager = new StudentManager();
    }
    private StudentManager studentManager;

    public List<Student> getStudents() {
        return studentManager.getStudents();
    }

    public void testAddStudent(String name, String surname, String studentId) {
        // Dodanie studenta
        boolean result = studentManager.addStudent(name, surname, studentId);

        // Sprawdzenie czy dodanie zakończyło się sukcesem
        assert result == true : "Test should get true";

        if (result) {
            System.out.println("addStudent: SUCCES");
        } else {
            System.out.println("addStudent: FAILED");
        }
    }

    public void testUpdateStudent(String studentId, String name, String surname) {
        // Aktualizowanie danych studenta
        boolean result = studentManager.updateStudent(studentId, name, surname);

        // Sprawdzenie czy aktualizacja zakończyła się sukcesem
        assert result == true : "Test should get true";

        if (result) {
            System.out.println("updateStudent: SUCCES");
        } else {
            System.out.println("updateStudent: FAILED");
        }
    }

    public void testDeleteStudent(String studentId) {
        // Usuwanie studenta
        boolean result = studentManager.deleteStudent(studentId);

        // Sprawdzenie czy usunięcie zakończyło się sukcesem
        assert result == true : "Test should get true";

        if (result) {
            System.out.println("deleteStudent: SUCCES");
        } else {
            System.out.println("deleteStudent: FAILED");
        }
    }

    public void testAddGrade(String studentId, String subject, double grade) {
        // Dodanie oceny
        boolean result = new GradeManager().addGrade(studentId, subject, grade, getStudents());

        // Sprawdzenie czy dodanie zakończyło się sukcesem
        assert result == true : "Test should get true";

        if (result) {
            System.out.println("addGrade: SUCCES");
        } else {
            System.out.println("addGrade: FAILED");
        }
    }
}

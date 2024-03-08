public class StudentManagerTest {
    // Wspólny obiekt StudentManager dla wszystkich testów
    private StudentManager studentManager;

    // Konstruktor inicjalizujący StudentManager
    public StudentManagerTest() {
        this.studentManager = new StudentManager();
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
/*
        // Wyświetlenie listy studentów
        List<Student> students = studentManager.getStudents();
        System.out.println("Lista studentów:");
        for (Student student : students) {
            System.out.println("Imię: " + student.getName() + ", Nazwisko: " + student.getSurname() + ", ID: " + student.getStudentId());
        }
*/
    }
}

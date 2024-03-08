import java.util.ArrayList;
import java.util.List;

public class StudentManager {
    // Lista przechowująca dane studentów
    private List<Student> students;

    // Konstruktor inicjalizujący listę studentów
    public StudentManager() {
        this.students = new ArrayList<>();
    }

    public boolean addStudent(String name, String surname, String studentId) {
        // Sprawdzenie czy student o podanym identyfikatorze już istnieje
        for (Student student : students) {
            if (student.getStudentId().equals(studentId)) {
                // Jeśli student o podanym identyfikatorze już istnieje, zwróć false
                return false;
            }
        }

        // Tworzenie nowego studenta
        Student student = new Student(name, surname, studentId);

        // Dodanie studenta do listy
        students.add(student);

        // Zwrócenie true, aby oznaczyć sukces
        return true;
    }


    // Metoda do uzyskiwania listy studentów
    public List<Student> getStudents() {
        return students;
    }
}

import java.util.ArrayList;
import java.util.List;

public class StudentManager {
    // Lista przechowująca dane studentów
    private List<Student> students;

    // Konstruktor inicjalizujący listę studentów
    public StudentManager() {
        this.students = new ArrayList<>();
    }

    // Metoda do uzyskiwania listy studentów
    public List<Student> getStudents() {
        return students;
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

    public boolean updateStudent(String studentId, String name, String surname) {
        // Sprawdzenie czy student o podanym identyfikatorze istnieje
        for (Student student : students) {
            if (student.getStudentId().equals(studentId)) {
                // Aktualizacja danych studenta
                student.setName(name);
                student.setSurname(surname);

                // Zwrócenie true, aby oznaczyć sukces
                return true;
            }
        }

        // Zwrócenie false, aby oznaczyć porażkę
        return false;
    }

    public boolean deleteStudent(String studentId) {
        // Sprawdzenie czy student o podanym identyfikatorze istnieje
        for (Student student : students) {
            if (student.getStudentId().equals(studentId)) {
                // Usunięcie studenta z listy
                students.remove(student);

                // Zwrócenie true, aby oznaczyć sukces
                return true;
            }
        }

        // Zwrócenie false, aby oznaczyć porażkę
        return false;
    }

    public double calculateAverageGrade(String number, String subject) {
        // Sprawdzenie czy student o podanym identyfikatorze istnieje
        for (Student student : students) {
            if (student.getStudentId().equals(number)) {
                // Obliczenie średniej ocen z przedmiotu
                return student.calculateAverageGrade(subject);
            }
        }

        // Zwrócenie 0, aby oznaczyć porażkę
        return 0;
    }
}

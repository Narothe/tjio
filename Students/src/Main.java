import java.sql.SQLOutput;
import java.util.List;

public class Main {

    public static void printStudents(List<Student> students) {
        for (Student student : students) {
            System.out.println("Imię: " + student.getName() + ", Nazwisko: " + student.getSurname() + ", ID: " + student.getStudentId());
        }
        System.out.println();
    }
    public static void main(String[] args) {
        StudentManagerTest studentManagertest = new StudentManagerTest();

        // Dodanie studentów
        studentManagertest.testAddStudent("Jan", "Kowalski", "1");
        studentManagertest.testAddStudent("Anna", "Nowak", "2");
        studentManagertest.testAddStudent("Michał", "Wiśniewski", "3");

        // Wyświetl listę studentów
        printStudents(studentManagertest.getStudents());


        // Aktualizowanie danych studenta (imię, nazwisko) na podstawie identyfikatora
        studentManagertest.testUpdateStudent("1", "Janusz", "Kowalski");
        studentManagertest.testUpdateStudent("2", "Weronika", "Nowak");
        studentManagertest.testUpdateStudent("3", "Sebastian", "Kokosowski");

        // Wyświetl listę studentów
        printStudents(studentManagertest.getStudents());


        // Usuwanie studenta na podstawie identyfikatora
        studentManagertest.testDeleteStudent("1");

        // Wyświetl listę studentów
        printStudents(studentManagertest.getStudents());

    }
}

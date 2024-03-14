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
//        GradeManagerTest gradeManagerTest = new GradeManagerTest();

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


        // Dodawanie oceny określonemu studentowi z danego przedmiotu
        studentManagertest.testAddGrade("2", "Matematyka", 4.5);
        studentManagertest.testAddGrade("2", "Fizyka", 3.5);
        studentManagertest.testAddGrade("3", "Matematyka", 5.0);
        studentManagertest.testAddGrade("3", "Fizyka", 4.0);

        // Wyświetl studentów wraz z ich ocenami
        for (Student student : studentManagertest.getStudents()) {
            System.out.println("Imię: " + student.getName() + ", Nazwisko: " + student.getSurname() + ", ID: " + student.getStudentId());
            for (Grade grade : student.getGrades()) {
                System.out.println("Przedmiot: " + grade.getSubject() + ", Ocena: " + grade.getGrade());
            }
            System.out.println();
        }

        


    }
}

import java.util.ArrayList;
import java.util.List;

public class GradeManager {
    private List<Grade> grades;

    public GradeManager() {
        this.grades = new ArrayList<>();
    }

    public boolean addGrade(String studentId, String subject, double grade, List<Student> students) {
        for (Student student : students) {
            if (student.getStudentId().equals(studentId)) {
                student.addGrade(new Grade(subject, grade));
                return true;
            }
        }
        return false;
    }
}

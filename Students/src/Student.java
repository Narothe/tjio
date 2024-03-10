public class Student {
    private String name;
    private String surname;
    private String studentId;
    private Grade[] grades;

    // Konstruktor
    public Student(String name, String surname, String studentId) {
        this.name = name;
        this.surname = surname;
        this.studentId = studentId;
    }

    // Gettery i settery (opcjonalnie)
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getStudentId() {
        return studentId;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }


    public Grade[] getGrades() {
        return grades;
    }

    public void addGrade(Grade newGrade) {
        if (grades == null) {
            grades = new Grade[1];
            grades[0] = newGrade;
        } else {
            Grade[] newGrades = new Grade[grades.length + 1];
            for (int i = 0; i < grades.length; i++) {
                newGrades[i] = grades[i];
            }
            newGrades[grades.length] = newGrade;
            grades = newGrades;
        }
    }
}

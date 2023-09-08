package lesson5;

public class Student {
    private String name;
    private int course;
    private int grade;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name.length() >= 3) {
            this.name = name;
        }
    }

    public int getCourse() {
        return course;
    }

    public void setCourse(int course) {
        if (course > 0 && course <= 4) {
            this.course = course;
        }
    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        if (grade > 0 && grade <= 10) {
            this.grade = grade;
        }
    }

    public static void main(String[] args) {
        Student student = new Student();
        student.name = "Alex";
        student.course = 4;
        student.grade = 9;

    }
}
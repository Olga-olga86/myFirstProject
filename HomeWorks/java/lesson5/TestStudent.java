package lesson5;

public class TestStudent {


    public static void main(String[] args) {
        Student student = new Student();
        student.setName("Alex");
        student.setCourse(4);
        student.setGrade(9);
        System.out.println(student.getName());
        System.out.println(student.getCourse());
        System.out.println(student.getGrade());
    }
}
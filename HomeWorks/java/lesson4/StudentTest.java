package lesson4;

public class StudentTest {


    public static void main(String[] args) {
        Student student1 = new Student();
        student1.mathAverageMark = 2.5;
        student1.economyAverageMark = 5.5;
        student1.foreignAverageMark = 1.5;
        double sum1 = student1.mathAverageMark + student1.economyAverageMark + student1.foreignAverageMark;
        double average1 = sum1 / 3;
        System.out.println("Average mark is" + average1 + "for student1");


        Student student2 = new Student();
        student2.mathAverageMark = 4.5;
        student2.economyAverageMark = 2.3;
        student2.foreignAverageMark = 2.5;
        double sum2 = student2.mathAverageMark + student2.economyAverageMark + student2.foreignAverageMark;
        double average2 = sum2 / 3;
        System.out.println("Average mark is" + average2 + "for student2");

        Student student3 = new Student();
        student3.mathAverageMark = 2.9;
        student3.economyAverageMark = 2.6;
        student3.foreignAverageMark = 4.5;
        double sum3 = student3.mathAverageMark + student3.economyAverageMark + student3.foreignAverageMark;
        double average3 = sum3 / 3;
        System.out.println("Average mark is" + average3 + "for student3");
    }
}

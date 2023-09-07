package lesson4;

public class Employee {

    private double salary;
    public String sureName;
    int id;

    void showInfo() {
        System.out.println(id = 123);
        System.out.println(salary = 3.500);
        System.out.println(sureName = "Smith");
    }

    public Employee(String sureName) {
        this.sureName = sureName;
    }
    private Employee(double salary) {
        this.salary = salary;
    }
    Employee(int id) {
        this.id = id;
    }


    public double money(double salary) {
        return (salary);
    }
    public String Smith(String sureName) {
        return (sureName);
    }
    public int number(int id) {
        return (id);
    }


    public static void main(String[] args) {
        Employee emp1 = new Employee(123);
        emp1.id = 123;
        emp1.salary = 3.500;
        emp1.sureName = "Smith";
        emp1.showInfo();
    }

}


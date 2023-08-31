package lesson2;

public class Task1HW2 {
    public Task1HW2() {
    }
    static int sumOfDigits(int abc) {
        int number = 123;
        int sum = 0;
        int currentDigit = number % 10;
        sum += currentDigit;
        number /= 10;
        currentDigit = number % 10;
        sum += currentDigit;
        number /= 10;
        sum += number;
        return sum;
    }

    public static void main(String[] args) {
        System.out.println(sumOfDigits(123));
    }
}

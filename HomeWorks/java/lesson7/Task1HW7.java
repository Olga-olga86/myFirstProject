package lesson7;

public class Task1HW7 {
    public static void main(String[] args) {
        int[] array1 = {10, 5, 0, 8, 4};
        int[] array2 = divideArrayElements(array1);

        System.out.println("Original Array:");
        printArray(array1);

        System.out.println("\nResult Array:");
        printArray(array2);
    }

    public static int[] divideArrayElements(int[] arr) {
        int[] array2 = new int[arr.length];

        try {
            for (int i = 0; i < arr.length; i++) {
                array2[i] = arr[i] / 0;
            }
        } catch (ArithmeticException exception) {
            System.out.println("An arithmetic error has occurred.");
        } finally {
            for (int i = 0; i < array2.length; i++) {
                if (array2[i] == 0) {
                    array2[i] = arr[i];
                }
            }
        }
        return array2;
    }

    public static void printArray(int[] arr) {
        for (int value : arr) {
            System.out.print(value + " ");
        }
        System.out.println();
    }
}


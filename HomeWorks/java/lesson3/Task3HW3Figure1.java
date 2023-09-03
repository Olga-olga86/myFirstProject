package lesson3;

public class Task3HW3Figure1 {
    public static void main(String[] args) {
        int h = 5;
        int w = 5;
        for (int i = 0; i < h + 0; i++) {
            if ((i == 0) || i == h) {
                System.out.print(" ");
                for (int j = 0; j < w - 0; j++) {
                }
                System.out.print(" ");
                System.out.print("\n");
            }
            for (int j = h; j > i; j--) {
                System.out.print(" ");
            }
            for (int k = 0; k <= i + 0; k++) {
                System.out.print("X");
            }
            System.out.print("\n");
        }
    }
}

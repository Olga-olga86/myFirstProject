package lesson3;

public class Task1HW3 {
    public static void main(String[] args) {
        String shortString = "word";
        String longString = "helloWorld";
        String theLongestString = "GoodMorningWorld";
        int cont1 = shortString.length();
        int cont2 = longString.length();
        int cont3 = theLongestString.length();
        if (cont1 > cont2) {
            System.out.println("cont1 is longest than cont2");
        } else if (cont2 > cont3) {
            System.out.println("cont2 is longest than cont3");
        } else {
            System.out.println("cont3 is longest than cont1 and cont2");
        }
    }
}


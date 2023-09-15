package lesson6;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Task2HW6 {

    public static void main(String[] args) {
        HashMap<Integer, String> map = new HashMap<>();
        List<String> listOfBooks = new ArrayList<>();
        listOfBooks.add("Misery");
        listOfBooks.add("Carrie");
        listOfBooks.add("The Shining");
        listOfBooks.add("The Green Mile");
        listOfBooks.add("The Dead Zone");

        listOfBooks.forEach(el -> map.put(listOfBooks.indexOf(el), el));
        System.out.println(map);
    }
}

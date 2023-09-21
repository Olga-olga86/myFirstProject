package lesson7;

import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class Task2HW7 {
    public static void main(String[] args) {
        String phoneNumber = "+380932541196";
        boolean isValid = isValidPhoneNumber(phoneNumber);
        System.out.println("Is the phone number valid? " + isValid);
    }
    public static boolean isValidPhoneNumber(String phoneNumber) {
        String regex = "\\+?[0-9]{3}\\d{9}";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(phoneNumber);
        return matcher.matches();
    }
}



package lesson3;

public class MonthHW3 {
    public static void main(String[] args) {
        int month = 11;
        int d= 30;
        switch (month) {
            case 2: d = 28;
                System.out.println(" February has 28 days ");
                break;
            case 4: d = 30;
                System.out.println(" April has 30 days ");
                break;
            case 6: d = 30;
                System.out.println(" June has 30 days ");
                break;
            case 9: d = 30;
                System.out.println(" September has 30 days ");
                break;
            case 11: d = 30;
                System.out.println(" November has 30 days ");
                break;
            case 1: d = 31;
                System.out.println(" January has 31 days ");
                break;
            case 3: d = 31;
                System.out.println(" March has 31 days ");
                break;
            case 5: d = 31;
                System.out.println(" May has 31 days ");
                break;
            case 7: d = 31;
                System.out.println(" July has 31 days ");
                break;
            case 8: d = 31;
                System.out.println(" August has 31 days ");
                break;
            case 10: d = 31;
                System.out.println(" November ");
                break;
            case 12: d = 31;
                System.out.println(" October has 31 days ");
                break;
            default:
                System.out.println(" Incorrect month ");
                if (d > 0)
                    System.out.printf("This month has " + d);
                else System.out.println(" Incorrect month ");
        }
    }
}

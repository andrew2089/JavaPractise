package l4;

import java.util.Scanner;

public class switchLevelOne {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("case: ");
        int choice = scanner.nextInt();

        switch (choice) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("thursday");
                break;
            case 5:
                System.out.println("friday");
                break;
            default:
                System.out.println("fuck off its weekends");
        }
    }
}

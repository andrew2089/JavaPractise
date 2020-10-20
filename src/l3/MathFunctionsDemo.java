package l3;

import java.util.Scanner;

public class MathFunctionsDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("x: ");
        int x = scanner.nextInt();

        System.out.println("y: ");
        int y = scanner.nextInt();

        MathFunctions funkcii = new MathFunctions();

        int suma = funkcii.sum(x,y);
        System.out.println(suma);

        System.out.println(" x + y = " + suma);
    }
}

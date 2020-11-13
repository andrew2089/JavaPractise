package l4;

import java.util.Scanner;

public class Calculator {
    public int sum(int firstNumber, int secondNumber) {
        return firstNumber + secondNumber;
    }

    public int sub(int firstNumer, int secondNumber) {
        return firstNumer - secondNumber;
    }

    public int div(int firstNumber, int secondNumber) {
        return firstNumber / secondNumber;
    }

    public int mul(int fistNumber, int secondNumber) {
        return fistNumber * secondNumber;
    }

    public boolean isEven(int number) {
        if (number % 2 == 0) {
            return true;
        }
        return false;
    }

    public int maxOfTwoNumbers(int fistNumber, int secondNumber) {
        int max = Math.max(fistNumber, secondNumber);
        return max;
    }

    public int MinOfTwoNumbers() {
        Scanner numberFill = new Scanner(System.in);
        System.out.println("Enter 2 numbers: ");
        int firstNumber = numberFill.nextInt();
        int secondNumber = numberFill.nextInt();
        int min = Math.min(firstNumber, secondNumber);
        System.out.println("Min of two arguments is : " + min);
        return min;
    }
}




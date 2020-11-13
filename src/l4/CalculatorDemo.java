package l4;

public class CalculatorDemo {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        System.out.println("3 + 2 = " + calculator.sum(3,2));
        System.out.println("3 * 5 = " + calculator.mul(3,5));
        System.out.println("7 * 8 = " + calculator.mul(7,8));
        System.out.println("50 / 5 = " + calculator.div(50,5));
        System.out.println("40 - 25 = " + calculator.sub(40,25));
        System.out.println("50 = " + calculator.isEven(50));
        System.out.println("23 = " + calculator.isEven(23));
        System.out.println("75 = " + calculator.isEven(75));
    }
}

package l2;

public class MathOperationsDemo {
    public static void main(String[] args) {
        System.out.println("Welcome to math operations");
        int a = 40;
        int b = 30;
        int sum = a +b;
        System.out.println("Addition example: ");
        System.out.println("a = " + a );
        System.out.println("b = " + b );
        System.out.println("a + b = " + sum);

        System.out.println("Substraction example: ");
        int sub = a - b;
        System.out.println("a - b = " + sub);
        System.out.println("Division example: ");
        int div = a / b;
        System.out.println("a / b = " + div);

        System.out.println("Division with remainder  example: ");
        double x = 10;
        double y =  35;
        double rem = x % y;
        System.out.println(" x % y = " +  rem);
        System.out.println("Multiplication example: ");
        int mult= a * b;
        System.out.println("a * b = " + mult);
    }
}

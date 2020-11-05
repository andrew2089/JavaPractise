package l4;

public class booleanDemo {
    public static void main(String[] args) {
        int x = 50;

        System.out.println("before");
        if ((x >= 1) && (x <= 100) && (x % 2 == 0)) {
            System.out.println("x in bounds and even");
        }
        System.out.println("after");

        int y = 75;
        System.out.println("second part");
        System.out.println("before");
        if ((y >= 1) && (y <= 100) || (y % 2 == 0)) {
            System.out.println("y in bounds or even");
        }
        System.out.println("after");
    }

}

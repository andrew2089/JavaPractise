package l4;

public class EqualsDemo {
    public static void main(String[] args) {
        Equals equals = new Equals();
        System.out.println("a = 1 , b = 2, " + equals.equals(1,2));
        System.out.println("a = 1 , b = 1, " + equals.equals(1,1));
    }
}

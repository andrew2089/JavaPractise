package l4;

public class SignComparatorDemo {
    public static void main(String[] args) {
        SignComparator comp = new SignComparator();
        System.out.println("number is 50 " + comp.compare(50));
        System.out.println("number is -24 " + comp.compare(-24));
        System.out.println("number is 0 " + comp.compare(0));
    }
}

package l4;

public class NumberServiceDemo {
    public static void main(String[] args) {
        NumberService n1 = new NumberService();
        System.out.println("summa diapazona: " + n1.rangeSumCounter(0,8));

        System.out.println("summa diapazona: " + n1.rangeSumCounter(5,0));

        System.out.println("summa diapazona: " + n1.rangeSumCounter(0,7));
        System.out.println("summa 4etnih: " + n1.evenCounter(0,25));
        System.out.println("summa 4etnih: " + n1.evenCounter(16,0));

    }
}

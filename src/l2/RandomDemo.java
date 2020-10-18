package l2;

import java.util.Random;

public class RandomDemo {
    public static void main(String[] args) {
        Random randomGenerator = new Random();
        int  unboundRandom = randomGenerator.nextInt();
        int boundRandom = randomGenerator.nextInt(15);
        int bdRandom = randomGenerator.nextInt(25);
        int sum= unboundRandom + boundRandom + bdRandom;

        System.out.println("unboundRandom: " + unboundRandom);
        System.out.println("boundRandom: " + boundRandom);
        System.out.println("bdRandom: " + bdRandom);
        System.out.println("summa randoma = " + sum);
    }
}

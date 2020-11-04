package l3;

public class CircleDemo {
    public static void main(String[] args) {
        Circle circle = new Circle();
        circle.radious = 7.2;
        double a1 = circle.calculateArea();
        System.out.println("When radious is " + circle.radious + " = " + a1);

        circle.radious = 3;
        double a2 = circle.calculateArea();
        System.out.println("when radious is " + circle.radious + " = " + a2);
    }
}

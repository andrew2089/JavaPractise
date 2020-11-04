package l3;

public class productDemo {
    public static void main(String[] args) {

        Product product = new Product();
        double p1  = product.actualPrice("milk",100.0,0.20);
        product.regularPrice = 100;
        product.discount = 95;
        product.printInfo();
        System.out.println("actual price is: " + p1);
    }
}

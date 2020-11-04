package l3;

public class Product {
    String name;
    double regularPrice;
    double discount;


    public double actualPrice(String name, double regularPrice, double discount) {
        this.name = name;
        this.regularPrice = regularPrice;
        this.discount = discount;
        return ((this.regularPrice/this.discount) *100);

    }
    void printInfo(){
        System.out.println("Product name: " + this.name);
        System.out.println("Regular price: " + this.regularPrice);
        System.out.println("discount: " + this.discount);

    }


}

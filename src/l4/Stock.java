package l4;

public class Stock {
    String companyName;
    int currentPrice;
    int minimalPrice;
    int maxPrice;

    public Stock(String companyName, int currentPrice, int minimalPrice, int maxPrice) {
        this.companyName = companyName;
        this.currentPrice = currentPrice;
        this.minimalPrice = minimalPrice;
        this.maxPrice = maxPrice;
    }
}


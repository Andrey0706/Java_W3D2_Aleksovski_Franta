package A4;

public class Product {
    private char category;
    private int taxPercentage;
    private String productName;
    private double basePrice;
    private int inStock;
    private double wholePrice;

    public Product(char category, String productName, double basePrice, int inStock) {
        this.category = category;
        this.productName = productName;
        this.basePrice = basePrice;
        this.inStock = inStock;
        if(category=='f'){
            this.taxPercentage =10;
        } else if(category == 'd'){
            this.taxPercentage =15;
        } else {
            this.taxPercentage =20;
        }

        this.wholePrice = basePrice + basePrice*taxPercentage/100;
    }

    public char getCategory() {
        return category;
    }

    public void setCategory(char category) {
        this.category = category;

        if(category=='f'){
            this.taxPercentage =10;
        } else if(category == 'd'){
            this.taxPercentage =15;
        } else {
            this.taxPercentage =20;
        }

    }

    public int getTaxPercentage() {
        return taxPercentage;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public double getBasePrice() {
        return basePrice;
    }

    public void setBasePrice(double basePrice) {
        this.basePrice = basePrice;
    }

    public int getInStock() {
        return inStock;
    }

    public void setInStock(int inStock) {
        this.inStock = inStock;
    }

    public void setTaxPercentage(int taxPercentage) {
        this.taxPercentage = taxPercentage;
    }

    public double getWholePrice() {
        return wholePrice;
    }

    public void setWholePrice(double wholePrice) {
        this.wholePrice = wholePrice;
    }
}

package A4;

import java.util.ArrayList;

public class Invoice {
    private int invoiceNumber;
    private ArrayList<Product> products = new ArrayList<>();
    private Customer customer;
    private double sumBeforeTaxes;
    private double sumAfterTaxes;
    private double sumOfAllTaxes;

    public Invoice(int invoiceNumber, Product products, Customer customer) {
        this.invoiceNumber = invoiceNumber;
        this.products.add(products);
        this.customer = customer;
        this.sumBeforeTaxes += products.getBasePrice();
        this.sumAfterTaxes += products.getWholePrice();
        this.sumOfAllTaxes += products.getWholePrice()-products.getBasePrice();
    }

    public int getInvoiceNumber() {
        return invoiceNumber;
    }

    public void setInvoiceNumber(int invoiceNumber) {
        this.invoiceNumber = invoiceNumber;
    }

    public ArrayList<Product> getProducts() {
        return products;
    }

    public void setProducts(Product products) {
        if(this.products.size()>4){
            System.out.println("You cannot add more than 5 products to the invoice");
        } else {
            this.products.add(products);
            this.sumBeforeTaxes += products.getBasePrice();
            this.sumAfterTaxes += products.getWholePrice();
            this.sumOfAllTaxes += products.getWholePrice()-products.getBasePrice();
        }
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public void print(){
        System.out.printf("Invoice No: %d\nCustomer No: %d\n****************\nProducts bought: \n", invoiceNumber, customer.getAccNumber());
        for(Product product : products){
            System.out.println(product.getProductName() + "\n        price: " + product.getWholePrice());


        }
        System.out.printf("****************\nBefore Taxes: %.2f  \n", sumBeforeTaxes);
        System.out.printf("Taxes: %.2f  \n_________________", sumOfAllTaxes);
        System.out.printf("\nTotal: %.2f ", sumAfterTaxes);
    }
}


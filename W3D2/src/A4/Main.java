package A4;

public class Main {

    public static void main(String[] args) {

        Customer customer1 = new Customer("John", "Herz", "johnTheHerz@hotmail.com", 1, "+43998774560");

        Product product1 = new Product('f', "bread", 1.99, 56);
        Product product2 = new Product('f', "Apple", 2.30, 1000);
        Product product3 = new Product('d', "Cola", 1.30, 15649);
        Product product4 = new Product('d', "Orange Juice", 0.80, 1399);
        Product product5 = new Product('c', "earring", 23.50 , 3);
        Product product6 = new Product('f', "salt", 1.20, 25);

        Invoice invoice1 = new Invoice(1, product1, customer1);
        invoice1.setProducts(product1);
        invoice1.setProducts(product2);
        invoice1.setProducts(product3);
        invoice1.setProducts(product4);
        invoice1.setProducts(product5);
        invoice1.setProducts(product6);

        invoice1.print();

        //System.out.println("----------------------");
        //customer1.printInvoices();

    }
}

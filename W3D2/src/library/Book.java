package library;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Book {
    private String name;
    private Author[] authors;
    private Double price;
    private int quantity;

    public Book(String name, Author[] authors, Double price) {
        this.name = name;
        this.authors = authors;
        this.price = price;
    }

    public Book(String name, Author[] authors, Double price, int quantity) {
        this.name = name;
        this.authors = authors;
        this.price = price;
        this.quantity = quantity;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Author[] getAuthor() {
        return authors;
    }

    public ArrayList<String> getAuthorName(){
        ArrayList<String> authorNames = new ArrayList<>();
        for (Author author : authors){
            authorNames.add(author.getName());
        }
        return authorNames;
    }

    public ArrayList<Character> getAuthorGender(){
        ArrayList<Character> authorGenders = new ArrayList<>();
        for (Author author : authors){
            authorGenders.add(author.getGender());
        }
        return authorGenders;
    }

    public ArrayList<String> getAuthorEmail(){
        ArrayList<String> authorEmails = new ArrayList<>();
        for (Author author : authors){
            authorEmails.add(author.getEmail());
        }
        return authorEmails;
    }

    public ArrayList<String> getAuthorInstagram(){
        ArrayList<String> authorInstagrams = new ArrayList<>();
        for (Author author : authors){
            authorInstagrams.add(author.getInstagram());
        }
        return authorInstagrams;
    }

    public void setAuthor(Author[] authors) {
        this.authors = authors;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    @Override
    public String toString() {
        return "Book{" +
                "name='" + name + '\'' +
                ", author=" + Arrays.toString(authors) +
                ", price=" + price +
                ", quantity=" + quantity +
                '}';
    }

    public ArrayList<String> showAuthorDetails(){

        ArrayList <String> authorDetails = new ArrayList<>();


        for (int index = 0; index< authors.length; index++ ){
        String s = "-";
        int n = getAuthorInstagram().get(index).length()+11;
        String sRepeated = IntStream.range(0, n).mapToObj(i-> s).collect(Collectors.joining(""));


        authorDetails.add(String.format(" %s \n %s \n Gender: %s \n Email: %s \n Instagram: %s \n", getAuthorName().get(index).toUpperCase(), sRepeated, getAuthorGender().get(index), getAuthorEmail().get(index), getAuthorInstagram().get(index) ));

    }
        return authorDetails;
    }
}

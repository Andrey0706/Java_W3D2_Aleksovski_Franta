package library;

public class TestBook {

    public static void main(String[] args) {

        Author author1 = new Author();

        author1.setName("Tim");
        author1.setEmail("tim.theauthor@gmx.at");
        author1.setGender('m');
        author1.setInstagram("www.instagram.com/Tim");

        Author author2 = new Author();

        author2.setName("Jill");
        author2.setEmail("Jill.theauthor@gmx.at");
        author2.setGender('w');
        author2.setInstagram("www.instagram.com/Jill");

        Author[] authors = {author1, author2};

        Book book1 = new Book("Java - Heaven or Hell", authors, 33.99, 5);

        System.out.printf("%15s, %5s, %15s, %.2f€ , %2d  \n", book1.getName(), book1.getAuthorName(), book1.getAuthorEmail(), book1.getPrice(), book1.getQuantity());

        System.out.println(book1.toString());

        System.out.println(book1.showAuthorDetails());

    }
}

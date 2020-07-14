package library;

public class TestAuthor {

    public static void main(String[] args) {

        Author author1 = new Author();

        author1.setName("Tim");
        author1.setEmail("tim.theauthor@gmx.at");
        author1.setGender('m');
        author1.setInstagram("www.instagram.com/Tim");

        System.out.printf( "%s \n %s \n %s \n %s \n", author1.getName(), author1.getEmail(), author1.getGender(), author1.getInstagram() );
        System.out.println(author1.toString());

    }




}

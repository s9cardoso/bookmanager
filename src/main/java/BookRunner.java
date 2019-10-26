import models.Book;

public class BookRunner {

    public static void main(String[] args)
    {
        System.out.println("Exercicio 1");

        Book book1 = new Book();
        book1.setTitle("The Art Of Computer Programming");
        Book book2 = new Book();
        book2.setTitle("Effective Java");
        Book book3 = new Book();
        book3.setTitle("Clean Code");

        System.out.println(String.format( "Name: %s", book1.getTitle()));
        System.out.println(String.format( "Name: %s", book2.getTitle()));
        System.out.println(String.format( "Name: %s", book3.getTitle()));



    }
}

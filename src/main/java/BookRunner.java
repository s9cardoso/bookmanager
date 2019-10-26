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

        System.out.println("\nExercicio 2");

        book1.incrementVersion();
        book2.incrementVersion();
        book3.incrementVersion();
        book3.incrementVersion();

        System.out.println(String.format( "Name: %s, Version: %d", book1.getTitle(), book1.getVersion()));
        System.out.println(String.format( "Name: %s, Version: %d", book2.getTitle(), book2.getVersion()));
        System.out.println(String.format( "Name: %s, Version: %d", book3.getTitle(), book3.getVersion()));
    }
}

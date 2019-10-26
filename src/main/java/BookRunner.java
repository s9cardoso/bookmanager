import models.Author;
import models.Book;

public class BookRunner {

    public static void main(String[] args)
    {
        System.out.println("Exercicio 1");

        Book book1 = new Book(100);
        book1.setTitle("The Art Of Computer Programming");
        Book book2 = new Book(75);
        book2.setTitle("Effective Java");
        Book book3 = new Book(60);
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

        System.out.println("\nExercicio 3");

        System.out.println(String.format( "Name: %s, Version: %d, Pages: %d", book1.getTitle(), book1.getVersion(), book1.getPages()));
        System.out.println(String.format( "Name: %s, Version: %d, Pages: %d", book2.getTitle(), book2.getVersion(), book2.getPages()));
        System.out.println(String.format( "Name: %s, Version: %d, Pages: %d", book3.getTitle(), book3.getVersion(), book3.getPages()));

        System.out.println("\nExercicio 4");

        Author author1 = new Author("Donald E. Knuth", "donald@gmail.com", 214);
        book1.setAuthor(author1);
        Author author2 = new Author("Joshua Bloch", "joshua@gmail.com", 153);
        book2.setAuthor(author2);
        Author author3 = new Author("Robert C. Martin", "robert@gmail.com", 188);
        book3.setAuthor(author3);

        System.out.println(book1.toString());
        System.out.println(book2.toString());
        System.out.println(book3.toString());
    }
}

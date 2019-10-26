package models;

public class Book {

    private String title;

    private int version = 1;

    private final int pages;

    private Author author;

    public Book(int pages) {
        this.pages = pages;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getVersion() {
        return version;
    }

    public void incrementVersion() {
       version++;
    }

    public int getPages() {
        return pages;
    }

    public Author getAuthor() {
        return author;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }

    @Override
    public String toString() {
        return String.format("Name: %s, " +
                "Version: %d, " +
                "Pages: %d, " +
                "%s", title, version, pages, author.toString());
    }
}

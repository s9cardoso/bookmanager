package models;

public class Book {

    private String title;

    private int version = 1;

    private final int pages;

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
}

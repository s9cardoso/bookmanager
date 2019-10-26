package models;

public class Author {

    private String name;

    private String email;

    private int numberOfBooks;

    public Author(String name, String email, int numberOfBooks) {
        this.name = name;
        this.email = email;
        this.numberOfBooks = numberOfBooks;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getNumberOfBooks() {
        return numberOfBooks;
    }

    public void setNumberOfBooks(int numberOfBooks) {
        this.numberOfBooks = numberOfBooks;
    }

    @Override
    public String toString() {
        return String.format("Author: %s", name);
    }
}

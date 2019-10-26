package models;

public class Author extends Person {

    private int numberOfBooks;

    public Author(String name, String email, int numberOfBooks) {
       super(name, email);
        this.numberOfBooks = numberOfBooks;
    }

    public int getNumberOfBooks() {
        return numberOfBooks;
    }

    public void setNumberOfBooks(int numberOfBooks) {
        this.numberOfBooks = numberOfBooks;
    }

    @Override
    public String toString() {
        return String.format("Author: %s", super.getName());
    }
}

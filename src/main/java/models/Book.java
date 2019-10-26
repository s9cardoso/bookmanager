package models;

import java.util.ArrayList;
import java.util.List;
import java.util.OptionalDouble;

public class Book {

    private String title;

    private int version = 1;

    private final int pages;

    private Author author;

    private Student student;

    private boolean isBooked;

    private List<Review> lstReviews = new ArrayList<>();

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

    public void setStudent(Student student) {
        this.student = student;
        isBooked = true;
    }

    public boolean isBooked() {
        return isBooked;
    }

    public List<Review> getLstReviews() {
        return lstReviews;
    }

    public void setLstReviews(List<Review> lstReviews) {
        this.lstReviews = lstReviews;
    }

    double reviewsAverage() {
        int count = lstReviews.size();

        if(count == 0) {
            return 0.0;
        }

        double sum = 0;
        for (int i = 0; i < count; i++){
           sum += lstReviews.get(i).getReviewValue();
        }

       return sum / count;

        //return lstReviews.stream().mapToInt(x -> x.getReviewValue()).average().orElse(0.0);
    }

    @Override
    public String toString() {
        return String.format("Name: %s, " +
                "Version: %d, " +
                "Pages: %d, " +
                "%s" +
                "Is Booked: %s, " +
                "Review Average: %.2f", title, version, pages, author.toString(), isBooked ? String.format("Yes, Student: %s", student.getName()) : "No", reviewsAverage());
    }
}

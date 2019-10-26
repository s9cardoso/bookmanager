package models;

public class Review {

    private String description;

    private double reviewValue;

    public Review(String description, double reviewValue) {
        this.description = description;
        this.reviewValue = reviewValue;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getReviewValue() {
        return reviewValue;
    }

    public void setReviewValue(double reviewValue) {
        this.reviewValue = reviewValue;
    }
}

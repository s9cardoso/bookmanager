package models;

public class Student extends Person {

    private int numberOfStudent;

    public Student(String name, String email, int numberOfStudent) {
        super(name, email);
        this.numberOfStudent = numberOfStudent;
    }

    public int getNumberOfStudent() {
        return numberOfStudent;
    }

    public void setNumberOfStudent(int numberOfStudent) {
        this.numberOfStudent = numberOfStudent;
    }
}

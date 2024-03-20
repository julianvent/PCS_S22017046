package main.java.actividad2;

public abstract class Figure {
    private int numberOfSides;

    public Figure(int numberOfSides) {
        this.numberOfSides = numberOfSides;
    }

    public int getNumberOfSides() {
        return numberOfSides;
    }

    public abstract double getArea();

    public abstract double getPerimeter();
}

package lab5;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "rectangles")
public class Rectangle extends Shape {
    private double length;
    private double breadth;

    public Rectangle(double length, double breadth, Color color) {
        super(color);
        this.length = length;
        this.breadth = breadth;
    }

    public Rectangle() {
        super();
    }

    @Override
    public double getArea() {
        return length * breadth;
    }

    @Override
    public double getPerimeter() {
        return 2 * (length + breadth);
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getBreadth() {
        return breadth;
    }

    public void setBreadth(double breadth) {
        this.breadth = breadth;
    }
}
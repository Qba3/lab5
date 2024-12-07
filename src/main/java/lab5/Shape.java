package lab5;

import jakarta.persistence.*;

@MappedSuperclass
public abstract class Shape {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Embedded
    private Color color;

    public Shape() {}

    public Shape(Color color) {
        this.color = color;
    }

    public Long getId() {
        return id;
    }
    public Color getColor() {
        return color;
    }

    public String getColorDescription() {
        return color.toString();
    }

    public String getClassName() {
        return "type: " + this.getClass().getSimpleName();
    }
    public void setColor(Color color) {
        this.color = color;
    }

    public abstract double getArea();
    public abstract double getPerimeter();
}

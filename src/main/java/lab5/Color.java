package lab5;

import jakarta.persistence.*;

@Embeddable
public record Color(int red, int green, int blue, int alpha) {
    public Color {
        if (red < 0 || red > 255) {
            throw new IllegalArgumentException("Red value must be between 0 and 255");
        }
        if (green < 0 || green > 255) {
            throw new IllegalArgumentException("Green value must be between 0 and 255");
        }
        if (blue < 0 || blue > 255) {
            throw new IllegalArgumentException("Blue value must be between 0 and 255");
        }
        if (alpha < 0 || alpha > 255) {
            throw new IllegalArgumentException("Alpha value must be between 0 and 255");
        }
    }


    public Color(int red, int green, int blue) {
        this(red, green, blue, 0);
    }
}
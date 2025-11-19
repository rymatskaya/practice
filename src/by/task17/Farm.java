package by.task17;

import java.io.Serializable;

public class Farm implements Serializable {
    private static final long serialVersionUID = 1L;

    private String name;
    private Double square;

    public Farm(String name, Double square) {
        this.name = name;
        this.square = square;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getSquare() {
        return square;
    }

    public void setSquare(Double square) {
        this.square = square;
    }
    @Override
    public String toString() {
        return "Farm{" +
                "name=" + name+
                ", square=" + Double.toString(square) +
                 '}';
    }
}

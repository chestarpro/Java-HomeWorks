package com.company.A.circle;

public class Circle implements PaintCircle{
    private double radius;

    public Circle(){}

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public void paintCircle(){
        System.out.println("Paint: " + toString() + "\n");
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                '}';
    }
}

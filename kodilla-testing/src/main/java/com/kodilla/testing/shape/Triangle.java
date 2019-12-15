package com.kodilla.testing.shape;
        import java.lang.Math;

public class Triangle implements Shape {

    private double a,b,c;
    private double halfCircuit = (a+b+c)/2;
    private double Area = (halfCircuit * (halfCircuit-a) * (halfCircuit-b) * (halfCircuit - c));

    public Triangle(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    @Override
    public String getShapeName() {
        return "Triangle";
    }

    @Override
    public double getField() {
        return Math.sqrt(Area);
    }
}

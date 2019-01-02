package com.codegym.circle;

public class Cylinder extends Circle {
    private double height;

    public Cylinder() {
    }

    public Cylinder(double height) {
        this.height = height;
    }

    public Cylinder(String color, double radius, double height) {
        super(color, radius);
        this.height = height;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    @Override
    public double getRadius() {
        return super.getRadius()*2+2*height*super.radius*Math.PI;
    }

    public double getVolumetric(){
        return super.getRadius()*height;
    }

    @Override
    public String toString() {
        return "A Cylinder with height="
                + getHeight()
                + ", which is a subclass of "
                + super.toString();
    }
}

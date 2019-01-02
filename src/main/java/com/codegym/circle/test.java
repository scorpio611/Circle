package com.codegym.circle;

public class test extends Cylinder{
    public static void main(String[] args) {
        Cylinder cylinder = new Cylinder();
        System.out.println(cylinder);

        cylinder = new Cylinder(3.5);
        System.out.println(cylinder);

        cylinder = new Cylinder("red", 4, 5);
        System.out.println(cylinder);
    }
}

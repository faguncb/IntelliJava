package org.example;

abstract class Shape {
    protected double area;
    public abstract void calculatedArea();
}

interface Drawable{
    void draw();
}

class Circle extends Shape implements Drawable {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public void calculatedArea() {
        area = Math.PI*radius*radius;
    }

    @Override
    public void draw() {
        System.out.println("Drawing a circle.");
    }

}

class Rectangle extends Shape implements Drawable {

    private double width, length;

    public Rectangle(double length, double width){
        this.width = width;
        this.length = length;
        }

    @Override
    public void calculatedArea() {
        area = width * length;
        }

    @Override
    public void draw() {
        System.out.println("Drawing a rectangle.");
        }

}


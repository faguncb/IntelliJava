package org.example;

public class Main {

    public static void main(String[] args) {
        System.out.println("Hello World! ");

        StudentsGrade s1 = new StudentsGrade("Fagun Bhavsar", 1979, 95, 97, 98);
        s1.displayData();

        StudentsGrade s2 = new StudentsGrade(s1);
        s2.id = 1980;
        s2.name = "Pink Floyd";
        s2.mathGrade = 99;
        s2.socialGrade = 100;
        s2.scienceGrade = 100;
        s2.displayData();

        Circle circle = new Circle(3.14);
        Rectangle rectangle = new Rectangle(7.25, 3.14 );

        Shape[] shapes = {circle, rectangle};

        for(Shape shape: shapes) {
            shape.calculatedArea();
            System.out.println("Area: " + shape.area);
        }

        Drawable[] drawables = {circle, rectangle};

        for(Drawable drawable: drawables) {
            drawable.draw();
        }

        try{
            double radius = -3.5;
            Circle negativeCircle = new Circle(radius);
        } catch (IllegalArgumentException e) {
            System.out.println("Error " + e.getMessage());
        }

        Person p1 = new Person("Pink Floyd");
        System.out.println(p1);
        Person p2 = new Person("Deep Purple");
        p2.setEmail("deep@purple.com");
        p2.setPhoneNumber("120 567 8909");
        System.out.println(p2);


    }

}


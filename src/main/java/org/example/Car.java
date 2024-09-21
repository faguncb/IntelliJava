package org.example;

public class Car {

        private int speed;
        double regularprice;
        private String color;

    public Car( int speed, double regularprice, String color){
            this.speed = speed;
            this.regularprice = regularprice;
            this.color = color;
        }

        public double getSalePrice () {
            return regularprice;
        }
    }




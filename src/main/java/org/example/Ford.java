package org.example;

public class Ford extends Car {
        public int year, manufecturerDiscount;

        public Ford(int speed, double regularprice, String color,int year, int manufecturerDiscount){
            super(speed, regularprice, color);
            this.year = year;
            this.manufecturerDiscount = manufecturerDiscount;
        }

        public double getSalePrice ()
        {
            return super.getSalePrice() - manufecturerDiscount;
        }

    }


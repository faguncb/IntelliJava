package org.example;

public class SwapNumbers {
    public static void main (String[] args){
        float first = 1.59f, second = 3.98f;
        System.out.println("--Before swap--");
        System.out.println("First Number = " + first);
        System.out.println("Second Number = " + second);

        float temporary = first;

        first = second;

        second = temporary;

        System.out.println("--After swap--");
        System.out.println("First Number = " + first);
        System.out.println("Second Number = " + second);
    }
}

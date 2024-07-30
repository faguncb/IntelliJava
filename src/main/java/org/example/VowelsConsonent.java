package org.example;

import java.util.Scanner;

public class VowelsConsonent {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Enter an english letter: ");
        String letter = reader.next();

        if (letter == "a" || letter == "e" || letter == "i" || letter == "o" || letter == "u")
            System.out.println(letter + " is vowel.");
        else
            System.out.println(letter + " is consonent. ");
    }
}

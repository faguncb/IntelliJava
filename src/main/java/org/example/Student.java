package org.example;

public class Student {
    private String name;
    private String id;
    private double mathGrade;
    private double socialGrade;
    private double scienceGrade;

    public Student(String name, String id, double mathGrade, double socialGrade, double scienceGrade){
        this.name = name;
        this.id = id;
        this.mathGrade = mathGrade;
        this.socialGrade = socialGrade;
        this.scienceGrade = scienceGrade;
    }

    public String getName(){
        return name;
    }

    public String getId(){
        return id;
    }

    public double getMathGrade(){
        return mathGrade;
    }

    public double getScienceGrade(){
        return scienceGrade;
    }

    public double getSocialGrade(){
        return socialGrade;
    }

    public double addGrade(double mathGrade, double scienceGrade, double socialGrade){
        return mathGrade + scienceGrade + socialGrade;
    }

    public double calculateAverage () {
        return (mathGrade + scienceGrade + socialGrade)/3 ;
    }

    public void printDetails() {
        System.out.println("Name: " + name);
        System.out.println("Id: " + id);
        System.out.println("Maths Grade: " + mathGrade);
        System.out.println("Science Grade: " + scienceGrade);
        System.out.println("Social Grade: " + socialGrade);
    }x


}

package edu.cmu.cs.cs214.lab02.shapes;

public class Circle implements Shape {
    //Umnu n radius n public turluur zarlagdaj,
    //medeelel aldagduulj baisniig private-r zarlan nuutslav
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }
    
    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }
}

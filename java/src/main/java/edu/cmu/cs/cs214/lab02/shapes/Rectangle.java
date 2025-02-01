package edu.cmu.cs.cs214.lab02.shapes;

public class Rectangle implements Shape {
    //Umnu n height bolon width n public turluur zarlagdaj,
    //medeelel aldagduulj baisniig private-r zarlan zasav
    private double height;
    private double width;

    
    public Rectangle(double height, double width){
        this.height = height;
        this.width = width;
    }
    
    @Override
    public double getArea() {
        return height * width;
    }
}

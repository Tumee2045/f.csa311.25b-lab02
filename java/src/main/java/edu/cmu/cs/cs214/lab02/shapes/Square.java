package edu.cmu.cs.cs214.lab02.shapes;

public class Square implements Shape {
    //Umnu n sideLen n public turluur zarlagdaj,
    //medeelel aldagduulj baisniig private-r zarlan nuutslav
    private double sideLen;

    public Square(double sideLen) {
        this.sideLen = sideLen;
    }
    
    @Override
    public double getArea() {
        return sideLen * sideLen;
    }
}

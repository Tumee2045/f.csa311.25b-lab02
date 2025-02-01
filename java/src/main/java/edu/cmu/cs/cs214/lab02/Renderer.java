package edu.cmu.cs.cs214.lab02;

import edu.cmu.cs.cs214.lab02.shapes.Shape;

public class Renderer {
    //Zuvhun rectangel avch baisniig 
    //ymar ch shape-tai ajillah bolomjtoi bolgov
    private Shape shape;

    public Renderer(Shape shape) {
        this.shape = shape;
    }

    public void draw() {
        //Umnu n zuvsun rectangle-r avch baisan bol
        //odoo ymrch dursiig zurah bolomjtoio
        double area = shape.getArea(); 

        System.out.println("Shape printed\n" + "Its area is " + area);
    }
}

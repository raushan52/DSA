package com.company;

import org.w3c.dom.css.Rect;

public class Main {

    public static void main(String[] args) {
	// write your code here

        Rectangle rect = new Rectangle();

       // Rectangle rect1 = new Rectangle(14.5f);
        //System.out.println("length of rectangle is : "+ rect1.length);

        Rectangle rect2 = new Rectangle(25.4f,89.2f);
        System.out.println("length is : "+rect2.length + " breadth is : "+ rect2.breadth);
    }

}

class Rectangle{
    float length;
    float breadth;

    Rectangle(){
        this(41.7f);
        System.out.println("Default Constructor..");

    }

     Rectangle(float length){
        this.length = length;
         System.out.println(this.length);

    }
    Rectangle(float length, float breadth){
        this.length = length;
        this.breadth = breadth;
    }
}

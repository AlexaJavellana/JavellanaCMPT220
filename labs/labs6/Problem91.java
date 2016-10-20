/*
 * file: Problem91.java
 * author: Alexa Javellana
 * course: CMPT 220
 * assignment: lab 6
 * due date: October 20 2016
 * version: 1.0
 *
 * This file contains problem 9.1
 */


public class Problem91 {
public static void main(String[] args) {

  Rectangle rectangle1 = new Rectangle(4,40);
  System.out.println("The area of the rectangle with the width and height " +
                      rectangle1.width + ", " + rectangle1.height + " is " + 
                      rectangle1.getArea());
  System.out.println("And the following perimeter of this rectangle is " + 
  					  rectangle1.getPerimeter());
  					  
  Rectangle rectangle2 = new Rectangle(3.5,35.9);					  
  System.out.println("The area of the rectangle with the width and height " +
                      rectangle2.width + ", " + rectangle2.height + " is " + 
                      rectangle2.getArea());
  System.out.println("And the following perimeter of this rectangle is " + 
  					  rectangle2.getPerimeter());                                         
  }
}  
  
  



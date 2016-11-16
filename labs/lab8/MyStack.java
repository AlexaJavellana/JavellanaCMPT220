/*
 * file: MyStack.java
 * author: Alexa Javellana
 * course: CMPT 220
 * assignment: lab 8
 * due date: November 4th 2016
 * version: 1.0
 *
 * This file contains mystack class for proble 11.10 */

import java.util.ArrayList;

public class MyStack extends ArrayList<Object> {

  public Object peek() {
    return get(size() - 1); 
  }

  public Object pop() {
    Object o = get(size() - 1);
    remove(size() - 1);
    return o;  
  }

  public void push(Object o) {
    add(o);
  }

  @Override
  public String toString() {
    return "stack: " + super.toString();  
  }
}
public class Rectangle {

public double width;
public double height;

  public Rectangle() {
    width = 1;
    height = 1;
  }

  public Rectangle(double newWidth, double newHeight) {
    width = newWidth;
    height = newHeight;
  }
  
  public double getArea() {
    return width * height;
  }
  
  public double getPerimeter() {
    return (width*2) + (height*2);
  }
  
}  
  
//Main Method
public static void main(String[] args) 
{
    Rectangle myRectangle = new Rectangle(4, 40);
    System.out.println("The area of a rectangle with width " +
    myRectangle.width + " and height " +
    myRectangle.height + " is " +
    myRectangle.getArea());
    System.out.println("The perimeter of a rectangle is " +
    myRectangle.getPerimeter());
    Rectangle yourRectangle = new Rectangle(3.5, 35.9);
    System.out.println("The area of a rectangle with width " +
    yourRectangle.width + " and height " +
    yourRectangle.height + " is " +
    yourRectangle.getArea());
    System.out.println("The perimeter of a rectangle is " +
    yourRectangle.getPerimeter());
}

//Rectangle Class
package javaapplication1;
public class Rectangle 
{
    double width = 1;
    double height = 1;
    
    Rectangle(){
    }
    
    Rectangle(double width, double height)
    {
        this.height = height;
        this.width = width;
    }
    
    double getArea()
    {
        return (width * height);
    }
    
    double getPerimeter()
    {
        return (2 * width) + (2 * height);
    }
}

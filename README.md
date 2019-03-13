# Java-HW-5
Java 360 coding assignment #5

Chapter 9 – Objects and Classes
Four questions, 25 points each.
1. Design a class based on the following UML Class diagram.
Use the following main method for your program and to get the screenshot of the
output.
 public static void main(String[] args) {
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
}
2. Design a Stock class based on the following UML Class diagram. All the data fields
and methods are self-explanatory. The method getChangePercent() refers to
percentage change from current price to previous closing price.
Use the following main method for your program and to get the screenshot of the
output.
 public static void main(String[] args) {
 Stock stock = new Stock("SUNW", "Sun MicroSystems Inc.");
 stock.setPreviousClosingPrice(100);
 // Set current price
 stock.setCurrentPrice(90);
 // Display stock info
 System.out.println("Previous Closing Price: " +
 stock.getPreviousClosingPrice());
 System.out.println("Current Price: " +
 stock.getCurrentPrice());
 System.out.println("Price Change: " +
 stock.getChangePercent() * 100 + "%");
 }
Sample Output for the above main method:
Previous Closing Price: 100.0
Current Price: 90.0
Price Change: -10.0%
3. Write a program that creates a Date object, sets its elapsed time to 1000000000,
10000000000, and 100000000000, and displays the date and time using the toString()
method, respectively.
4. Write a program that creates a Random object with seed 100 and displays the first 10
random integers between 50 and 100 (exclusive).

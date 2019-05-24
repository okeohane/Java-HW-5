/*
Creates a Date object, sets its elapsed time to 1000000000,
10000000000, and 100000000000, and displays the date and time using the toString()
method, respectively.
*/

package javaapplication3;
import java.util.Date;
public class JavaApplication3 
{
    public static void main(String[] args) 
    {
        Date date = new Date();
        
        date.setTime(1000000000);
        System.out.println(date.toString());
        
        date.setTime(10000000000L);
        System.out.println(date.toString());
        
        date.setTime(100000000000L);
        System.out.println(date.toString());
    }
}

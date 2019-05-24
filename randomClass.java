/*
Creates a Random object with seed 100 and displays the first 10
random integers between 50 and 100 (exclusive).
*/

package javaapplication4;
import java.util.Random;
public class JavaApplication4 
{
    public static void main(String[] args) 
    {
        Random random = new Random(100);
        
        for(int i = 0; i < 10; i++)
        {
            System.out.print(random.nextInt(50) + 50 + " ");
        }
    } 
}

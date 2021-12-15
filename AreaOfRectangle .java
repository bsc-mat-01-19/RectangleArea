
import java.util.Scanner;
public class AreaOfRectangle 
{
   public static void main(String[] args) 
    {   
       
      Scanner input= new Scanner(System.in);
Rectangle zake = new Recatangle();
        
         System.out.println("Enter the length:");
         double length = input.nextDouble();
        System.out.println("Enter the breadth:");
         double breadth = input.nextDouble();
        
          
         
      System.out.println("The area of the rectangle is "+zake.returnArea);      
   }
}
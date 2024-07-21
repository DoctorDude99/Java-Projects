/*
Programmer: Ibrahim Salam
Date: 2024-05-13
Description: A java calculator that can calculate the area of rectangle, circle
            ,triangle, and square using Style 4 Methiods
 */
package methodsminiassignment;

import java.util.Scanner;

public class MethodsMiniAssignment 
{


    public static void main(String[] args) 
    {
        //declaring scanner and int
        Scanner scanN = new Scanner(System.in);
        int choice;
        
        //start of do while/error trap
        do{
        //main menu
        System.out.println("Welcome to the Premium Java Area Calculator!");
        System.out.println("to get started, simply choose one of the options"
                + " below.");
        System.out.println("1) Triangle\n2) Square\n3) Rectangle\n4) Circle"
                + "\n5) Quit");
        System.out.println("Enter your choice from the menu:");
        choice = scanN.nextInt(); // collecting user choice
        
        //switch statements, everything here is in doubles
        switch(choice)
        {
            //triangle
            case 1:              
                //getting info on shape
              System.out.println("Enter the base:");
              double base = scanN.nextDouble();
                
              System.out.println("Enter the height");
              double height = scanN.nextDouble();
                
              double triArea = triangle(base,height);//sending down base+height
              
              //final answer
              System.out.println("The area of your triangle is "+ triArea);
                
              break;
             
            //square
            case 2:
            //getting info on shape
                System.out.println("Enter the side length:");
                double sqLength = scanN.nextDouble();

                //sending info to method
                double sqArea = square(sqLength);
                //final answer
                System.out.println("The area of your rectangle is "+sqArea);
                
                break;
            //rectangle
            case 3:
            //getting info on shape
                System.out.println("Enter the length:");
                double length = scanN.nextDouble();
                
                System.out.println("Enter the width:");
                double width = scanN.nextDouble();
                
                //sending info to method
                double recArea = rectangle(length,width);
                //final answer
                System.out.println("The area of your rectangle is "+recArea);
                
                break;
                
            //circle
            case 4:
            //getting info on shape
                System.out.println("Enter the radius:");
                double radius = scanN.nextDouble();
                
                //sending info to circle method
                double circleArea = circle(radius);
                //final answer
                System.out.println("The area of your circle is: "+circleArea);
                break;
                
            //quit
            case 5:
                System.out.println("Goodbye!");
                System.exit(0);
            
            //if not one of the options(default)
            default:
                System.out.println("That was not one of the options.");
                System.out.println("Please select again...");
                break;
        }//switch
        }while(choice > 0 || choice <= 5);
        //error trapping for smoother user experience
        //better error trapping than last assignment?
        
    }//main
    
    /*****************
     * name: triangle
     * Description: finds the area of a triangle
     * @param x - user base
     * @param y - user height
     * @return area - the calculated area of the triangle
     ******************/
    public static double triangle(double x,double y)
    {
        double area = (0.5 * x * y);
        return area;
    }//triangle
    
    /*****************
     * name: square
     * Description: finds the area of a square
     * @param x - user radius
     * @return area - the calculated area of the square
     ******************/
    public static double square(double x)
    {
        double area = x*x;
        return area;
    }//square
    
    /*****************
     * name: rectangle
     * Description: finds the area of a rectangle
     * @param x - user base
     * @param y - user height
     * @return area - the calculated area of the rectangle
     ******************/
    public static double rectangle(double x,double y)
    {
        double area = x*y;
        return area;
    }//rectangle/square
    
    /*****************
     * name: circle
     * Description: finds the area of a circle
     * @param x - user radius
     * @return area - the calculated area of the circle
     ******************/
    public static double circle(double x)
    {
        double area = 3.14*x*x;
        return area;
    }//circle

}//class

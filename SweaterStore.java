/*
Programmer: Ibrahim Salam 
Date: 2024-04-04
Description: Mini Assignment where we have to make an online sweater shop in java
 */
package sweaterstore;

import java.util.Scanner;
import java.text.DecimalFormat;

public class SweaterStore 
{


    public static void main(String[] args) 
    {
        
         //making scanners
        Scanner scanN = new Scanner(System.in);
        Scanner scanS = new Scanner(System.in);
       
        //welcoming user and asking them for their cash balance
        System.out.println("Welcome to the Milton Sweater Shop! Where we have"
                + " the best sweaters for the season.");
        System.out.println("Before you begin shopping, please input the "
                + " amount of cash you have available to spend "
                + "(integers and decimals only, no dollar sign):");
        double userCash = scanN.nextDouble();
       
        //showing user the sweater selection and asking which sweater they want
        System.out.println("Great! Now you can begin shopping from our "
              + "selection of sweaters. Each sweater costs $40.00 before tax");
        System.out.println("The colours we have are:");
        System.out.println("Blue\nBlack\nRed\nBrown\nWhite");
        System.out.println("Please type the colour of sweater you want to "
                + "purchase:");
        String sweater = scanS.nextLine();
       
        //price of sweater
        double rawCost = 40.00;
        
        //creating decimal format object
        DecimalFormat decFor = new DecimalFormat("$#,###,##0.00");
        
        //if statements to determine the programs response
        if(userCash<40) //if user doesnt have money
        {
            System.out.println("Sorry, you do not have enough money to "
                    + "make a purchase...");
            System.out.println("Hope you at least enjoyed browsing our "
                    + "collection.");
           
            //blue sweater
        } else if(sweater.equalsIgnoreCase("blue")&&userCash>=40){
               //calculate the tax. store into var
        double taxTotal = rawCost*0.13;
        //calculate the total cost after tax. store into var
        double finalCost = rawCost+taxTotal;
        //print out the rawCost, taxTotal, and finalCost for the user
        System.out.println("\nRecipt:");
        System.out.println("*************************************************");
        System.out.println("Your cost before tax is: "
                + decFor.format(rawCost));
        System.out.println("Your total tax is: " + decFor.format(taxTotal));
        System.out.println("Your final cost is: " + decFor.format(finalCost));
        System.out.println("*************************************************");
            System.out.println("\nHow about a pair of jeans to go with that"
                    + " sweater?");
           
            //black +white sweater
        } else if(sweater.equalsIgnoreCase("black")&&userCash>=40
                || sweater.equalsIgnoreCase("white")&&userCash>=40){
           
            System.out.println("You have enough sweaters in this colour!");
           
            //red +brown sweater
        } else if(sweater.equalsIgnoreCase("red")&&userCash>=40
                || sweater.equalsIgnoreCase("brown")&&userCash>=40){
           
            System.out.println("Sorry... we are out of that colour...");
        } else {
            System.out.println("Your choice is invalid");
        }
       
        System.out.println("\nThank you for coming to our store! Please "
                + "come again soon!");
       
        scanS.close();
        scanN.close();
        
    }
    
}
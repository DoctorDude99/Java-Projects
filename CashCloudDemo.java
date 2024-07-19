/*
Programmer: Ibrahim 
Date: 2024-06-11
Description: A fully functioning user friendly java atm with
multiple functions including deposit, withdraw, and currency converter
 */
package cashclouddemo;

import java.util.Scanner;
import java.text.DecimalFormat;

public class CashCloudDemo  
{
    //main method starts  
    public static void main(String args[] )  
    {
        //format for money
        DecimalFormat money = new DecimalFormat("$#,###,##0.00");
       
        //declare and initialize balance, withdraw, and deposit  
        double balance = 100000;
        double withdraw;
        double deposit;  
        int choice;
        int pass1 = 3;
        int pass2 = 2;
        int pass3 = 1;
        int input = 0;
        int ran = 0;
        //create scanner  
        Scanner scanN = new Scanner(System.in);  
       
        do
        {
            System.out.println("Before you access this account, please verify "
                    + "you are human by answering this question...");
            ran = (int)(1+Math.random()*3);
          if(ran == 1)
          {
              caseOne();
          } else if(ran == 2)
          {  
              caseTwo();
          } else if (ran == 3)
          {
              caseThree();
          }
               
        do  
        {  
            System.out.println("------------------------------------------");
            System.out.println("Welcome to CashCloud Demo Version!");
            System.out.println("Type the corresponding number for the function"
                    + " you wish to access");
            System.out.println("Type 1 for Withdraw");  
            System.out.println("Type 2 for Deposit");  
            System.out.println("Type 3 for Check Balance");  
            System.out.println("Type 4 for EXIT");  
            System.out.println("Type 5 for Currency Converter");
                       
            //get choice from user  
            choice = scanN.nextInt();  
         
         if(choice==1)
            {
        System.out.print("Enter money to be withdrawn:");                      
        //get the withdraw money from user  
        withdraw = scanN.nextDouble();  
                     
        //check if balance is greater than withdraw  
        if(balance >= withdraw)  
        {  
            //remove the withdrawl amount from the total balance  
            balance = balance - withdraw;  
            System.out.println("Please collect your money");  
        }
        //if balance is less than withdraw
        else  
        {  
            //show error message  
            System.out.println("Insufficient Balance");  
            System.out.println("");
        }  
       
        }else if(choice==2)  
                {
        System.out.print("Enter money to be deposited:");                    
        //get deposit amount from te user  
        deposit = scanN.nextDouble();  
                     
        //add the deposit amount to the total balanace  
        balance = balance + deposit;  
        System.out.println("Your Money has been successfully depsited");  
        System.out.println("");  
                }
   
        else if(choice==3)
        {
        //displaying the total balance of the user  
        System.out.println("Balance : "+money.format(balance));  
        System.out.println("");  
        }
   
        else if(choice==4)  
        {
           //exit from the menu
            System.exit(0);
        }
           
            //currency converter
        else if (choice ==5)
        {
            //converter();
                    //currency message
        System.out.println("");
        System.out.println("Which Currency do you want to convert?");
        System.out.println("Type the corresponding number");
        System.out.println("-----------------------");
        System.out.println("        EUROS");
        System.out.println("-----------------------");
        System.out.println("1. CAD to Euros");
        System.out.println("2. Euros to CAD");
        System.out.println("-----------------------");
        System.out.println("        USD");
        System.out.println("-----------------------");
        System.out.println("3. CAD to USD");
        System.out.println("4. USD to CAD");
        System.out.println("-----------------------");
        System.out.println("    BRITISH POUND");
        System.out.println("-----------------------");
        System.out.println("5. CAD to British Pound");
        System.out.println("6. British Pound to CAD");
        System.out.println("-----------------------");
        System.out.println("    JAPANESE YEN");
        System.out.println("-----------------------");
        System.out.println("7. CAD to Japanese Yen");
        System.out.println("8. Japanese Yen to CAD");
        int currChoice = scanN.nextInt();
       
        switch(currChoice)
        {
            //cad to euros
            case 1:
               System.out.println("1 Canadian Dollar = 0.67 Euros");
               System.out.println("What is the amount you want to convert?");
               double euro1 = scanN.nextDouble();
               euro1(euro1);
               break;
               //euros to cad
            case 2:
               System.out.println("1 Euro = 1.49 Canadian Dollars");
               System.out.println("What is the amount you want to convert?");
               double euro2 = scanN.nextDouble();
               break;
               //cad to usd
            case 3:
                System.out.println("1 Canadian Dollar = 0.73 USD");
               System.out.println("What is the amount you want to convert?");
               double usd1 = scanN.nextDouble();
               usd1(usd1);
               break;
               //usd to cad
            case 4:
                System.out.println("1 USD = 1.38 Canadian Dollars");
               System.out.println("What is the amount you want to convert?");
               double usd2 = scanN.nextDouble();
               usd2(usd2);
               break;
               //cad to british pound
            case 5:
                 System.out.println("1 Canadian Dollar = 0.57 Pound sterling");
               System.out.println("What is the amount you want to convert?");
               double bp1 = scanN.nextDouble();
               bp1(bp1);
               break;
               //british pound to cad
            case 6:
                System.out.println("1 Pound sterling = 1.75 Canadian Dollars");
               System.out.println("What is the amount you want to convert?");
               double bp2 = scanN.nextDouble();
               bp2(bp2);
               break;
               //cad to japanese yen
            case 7:
               System.out.println("1 Canadian Dollar = 113.94 Japanese Yen");
               System.out.println("What is the amount you want to convert?");
               double jp1 = scanN.nextDouble();
               jp1(jp1);
               break;
               //japanese yen to cad
            case 8:    
             System.out.println("1 Japanese Yen = 0.0088 Canadian Dollars");
               System.out.println("What is the amount you want to convert?");
               double jp2 = scanN.nextDouble();
               jp2(jp2);
               break;
        }
        }
               
    else if(choice !=1 && choice !=2 && choice != 3 && choice !=4 && choice !=5)
          {
               //if incompatible option is chosen
                System.out.println("That was not one of the options.");
                System.out.println("Please select again...");
           }
        }while(choice > 0 || choice <= 5);//first do while
       
        }while(input == pass1||input == pass2||input == pass3);//second do while
     
       
   }//main

    /*******************************************
     * Name: Case One
     * Description: Gives the first security question
     ***********************************************/
    public static void caseOne()
     {
       int input = 0;
       do
       {
       Scanner scanN = new Scanner(System.in);
       System.out.println("what is one times three?");
           System.out.println("Answer with an integer");
       input = scanN.nextInt();
       }while(input != 3);
       //return input;
     }
   /*****************************************
     * Name: Case Two
     * Description: Gives the second security question
     **************************************/
    public static void caseTwo()
     {
       int input = 0;
       do
       {
       Scanner scanN = new Scanner(System.in);
       System.out.println("what is one times two?");
           System.out.println("Answer with an integer");
       input = scanN.nextInt();
       }while(input != 2);
     }
   /*****************************************
     * Name: Case Three
     * Description: Gives the third security question
     **************************************/
    public static void caseThree()
     {
       int input = 0;
       do
       {
       Scanner scanN = new Scanner(System.in);
       System.out.println("what is one times one?");
           System.out.println("Answer with an integer");
       input = scanN.nextInt();
       }while(input != 1);
     
     }
   
   
    /****
     * CAD to EURO
     * Converts Cad to euro
     * @param amt - amount given by user to convert
     * @return convert: returns the converted amount
     */
    public static double euro1(double amt)
    {
        double convert = amt*0.67;
        System.out.println(amt+" Canadian Dollars are now "+convert
                + " Euros");
        return convert;
    }//euro1
   
    /****
     * Euro to Cad
     * Converts Euro to Cad
     * @param amt - amount given by user to convert
     * @return convert: returns the converted amount
     */
    public static double euro2(double amt)
    {
        double convert = amt*1.49;
        System.out.println(amt+" Euros are now "+convert
                + " Canadian Dollars");
        return convert;
    }//euro2
    /****
     * CAD to USD
     * Converts Cad to euro
     * @param amt - amount given by user to convert
     * @return convert: returns the converted amount
     */
    public static double usd1(double amt)
    {
        double convert = amt*0.73;
        System.out.println(amt+" Canadian Dollars are now "+convert
                + " US Dollars");
        return convert;
    }//usd1
    /****
     * USD to CAD
     * Converts Cad to euro
     * @param amt - amount given by user to convert
     * @return convert: returns the converted amount
     */
    public static double usd2(double amt)
    {
        double convert = amt*1.38;
        System.out.println(amt+" US Dollars are now "+convert
                + " Canadian Dollars");
        return convert;
    }//usd2
    /****
     * CAD to BRITISH POUND
     * Converts Cad to pound sterling
     * @param amt - amount given by user to convert
     * @return convert: returns the converted amount
     */
    public static double bp1(double amt)
    {
        double convert = amt*0.57;
        System.out.println(amt+" Canadian Dollars are now "+convert
                + " Pound sterling");
        return convert;
    }//bp1
    /****
     * BRITISH POUND to CAD
     * Converts pound sterling to Canadian dollar
     * @param amt - amount given by user to convert
     * @return convert: returns the converted amount
     */
    public static double bp2(double amt)
    {
        double convert = amt*1.75;
        System.out.println(amt+" Pound sterling are now "+convert
                + " Canadian Dollars");
        return convert;
    }//bp2
    /****
     * CAD to JP
     * Converts Canadian dollar to Japanese yen
     * @param amt - amount given by user to convert
     * @return convert: returns the converted amount
     */
    public static double jp1(double amt)
    {
        double convert = amt*113.94;
        System.out.println(amt+" Canadian Dollars are now "+convert
                + " Japanese Yen");
        return convert;
    }//jp1
    /****
     * JP to CAD
     * Converts Japanese Yen to Canadian Dollar
     * @param amt - amount given by user to convert
     * @return convert: returns the converted amount
     */
    public static double jp2(double amt)
    {
        double convert = amt*0.0088;
        System.out.println(amt+" Japanese Yen are now "+convert
                + " Canadian Dollars");
        return convert;
    }//jp2
 
}//class
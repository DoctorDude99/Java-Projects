/*
Programmer: Ibrahim Salam
Date: 2024-03-21
Description: Library Assignment, designing a library software that
tracks the number of weeks spent reading a book. Uses a variety of java
skills.
 */
package librabryassignemnt;

   import java.util.Scanner;
   import java.text.DecimalFormat;

public class Librabryassignemnt 
{

    public static void main(String[] args) 
    {
           /***********************************************************
        welcoming message.
        ************************************************************/
        System.out.println("Welcome to the Milton Public Library!"
                + " I will help you be"
                + " the best reader you can by keeping you on track."
                + " I will track what books you've read and how long it took"
                + " you to read them. ");  
        //asking for user input
        System.out.println("Please enter your name(Last name, First name)"
      + " remember to add the space and comma or i'll get confused ");
        Scanner userName = new Scanner(System.in);
        String name = userName.nextLine();
        int comma = name.indexOf(',');
        int index = name.indexOf(',');
        /****************************************************
        asking for book name and time taken to read in days, decided to use
        days as its more precise plus the number of weeks will eventually
        turn into the cost and i dont want to overcharge the user
       
        ***************************************************/
         //asking for the users first book and the time taken to read
         //(very sub-par and below average)
         
         //creating scanners
         Scanner scanS = new Scanner(System.in);
         Scanner scanN = new Scanner(System.in);
         
        //book 1 input module
        System.out.println("What is the name of your first book? ");        
        String bookOne = scanS.nextLine();
        System.out.println("how many days did it take you to read?");    
        double book1Days = scanN.nextDouble();
       
        //book 2 input module
        System.out.println("What is the name of your second book? ");
        String bookTwo = scanS.nextLine();
        System.out.println("how many days did it take you to read?");    
        double book2Days = scanN.nextDouble();
       
        //book 3 input module
        System.out.println("What is the name of your third book? ");      
        String bookThree = scanS.nextLine();
        System.out.println("how many days did it take you to read?");      
        double book3Days = scanN.nextDouble();
       
        //book 4 input module
        System.out.println("What is the name of your fourth book? ");        
        String bookFour = scanS.nextLine();
        System.out.println("how many days did it take you to read?");      
        double book4Days = scanN.nextDouble();
       
        //converting days to weeks
        //differentiating between days and weeks since both are needed for
        //different things
        double book1weeks = book1Days/7;
        double book2weeks = book2Days/7;
        double book3weeks = book3Days/7;
        double book4weeks = book4Days/7;
       
        //decimal format
        DecimalFormat dec = new DecimalFormat("##0.#");
       
        //creating the table
        System.out.println("--------------------------------------------");
        System.out.format("%-30s%30s","Books","Number of Weeks");
        System.out.format("%n%-30s%30s",bookOne
                ,dec.format(book1weeks));
        System.out.format("%n%-30s%30s",bookTwo
                ,dec.format(book2weeks));
        System.out.format("%n%-30s%30s",bookThree
                ,dec.format(book3weeks));
        System.out.format("%n%-30s%30s",bookFour
                ,dec.format(book4weeks));
        System.out.println("\n--------------------------------------------");
       
        //receipt
        DecimalFormat money = new DecimalFormat("$#,###,##0.00");
        System.out.println("\n**************Your Receipt********************");
         System.out.format("%-15s","Price per week");
        System.out.format("%n%-15s",money.format(book1weeks*5.25));
        System.out.format("%n%-15s",money.format(book2weeks*5.25));
        System.out.format("%n%-15s",money.format(book3weeks*5.25));
        System.out.format("%n%-15s",money.format(book4weeks*5.25));
        System.out.format("%n%-15s%15s","Before Tax","after tax");
        System.out.format("%n%-15s%15s"
        ,money.format((book1weeks+book2weeks+book3weeks+book4weeks)*5.25)
        ,money.format(((book1weeks+book2weeks+book3weeks+book4weeks)*5.25)
        *1.13));
        System.out.println("\n***********************************************");
        System.out.println("");
        
        //book average
          
        double bookAve = 7/((book1Days+book2Days+book3Days+book4Days)/4);
        System.out.println("You read an average of "+dec.format(bookAve)
                +" books per week");        
        System.out.println("You are able to read an average of "
                +dec.format(bookAve*52) +" books per year!");
        System.out.println("");
        
        //ending message
        String firstInitial = name.substring(comma+2, comma+3);
        String lastName = name.substring(0, comma);
       
        System.out.println("Thank you Mr/Ms. "
         + firstInitial + "."+ lastName.toUpperCase()
         +" I'm proud of all the progress you've made this summer. "
         + "You've exceeded all of my expectations and I couldn't be happier. "
         + "");
       
       
       
        userName.close();
        scanS.close();
        scanN.close();
        
        
        
        
        
        
    }
    
}

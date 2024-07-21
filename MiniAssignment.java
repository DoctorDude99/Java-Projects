/*
Programmer: Ibrahim Salam
Date: 2024-03-05
Description: Practicing many types of java skills through an assignment
 */
package miniassignment;

import java.util.Scanner; 

public class MiniAssignment 
{


    public static void main(String[] args) 
    {
      System.out.println("Welcome to Premium Hakka House!");
      System.out.println("I am a software programmed to let you "
              + "know when your table is ready and give you a smoother "
              + "experience at our restaurant.");
        System.out.println("Unfortuantely there are no tables available"
                          + "at the moment...");
        //creating varaibles for name and phone number
        Scanner userName = new Scanner(System.in);
        String name;
             
        Scanner userPhone = new Scanner(System.in);
        String phone;
        //asking user for name and phone number
        System.out.println("\nPlease type your name in the format \"Last " +
         "Name, First Name\" Remember to add a space between your first "
          + "and last name :)");
        
        name = userName.nextLine();        
        int space;
        space = name.indexOf(' ');
        
        System.out.println("Also type a phone number(no spaces)"
          + " which we can use to reach you when your table is ready.");
        phone = userPhone.nextLine();
        
        
        System.out.println("A table is now ready for you "
        +name.charAt(0) +"."+name.substring(space));
        System.out.println("Calling phone number "    
      /*
      Added spaces to the users phone number to make it look nicer 
      I guess I could have just asked for the user to use spaces but it was
      good practice to use other methods which I don't use very often.
       */
        +phone.substring(0,3)+" "+phone.substring(3,6)+ " "+ 
        phone.substring(6));
        
        Scanner userReview = new Scanner(System.in);
        int review;
        System.out.println("\nThank you for waiting, if you don't mind please "
        + "rate your experience with this software (1 being the worst and 10"
        + " being the Best)");
        review = userReview.nextInt();
        
        System.out.println("You selected "+review+"!");
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
    }
    
}

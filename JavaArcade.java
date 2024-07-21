/*
Programmer: Ibrahim Salam
Date: 2024-05-05
Desc: Assessing skill in different types of looping in java by creating an 
      arcade which relies on looping back to main menu and other functions
 */
package javaarcade;

import java.util.Scanner;
         
public class JavaArcade 
{


    public static void main(String[] args) 
    {
         //scanners and variables section
        int choice, guess, tries, score1, score2, pPlay;       
        Scanner scanN = new Scanner(System.in);
        int userPlay;
        
        /******************************
        arcade begins  
        *****************************/
        do{ 
            //choosing ranNum for math game
            int ranNum = (int)(1+Math.random()*50);
            
            //resetting all scores and number of tries
            tries = 5;
            score1= 0;
            score2 = 0;
            
            System.out.println("WELCOME TO THE MAIN MENU "
                + "\n1. Guess the Number\n2. Rock Paper Scissors\n3. Exit");
                    
            //invalid choice module
            do{
            choice = scanN.nextInt();
               
            if(choice != 1 && choice != 2 && choice != 3)
            {
                System.out.println("Invalid choice D:\nPlease enter again.");
            }
            }while(choice != 1 && choice != 2 && choice != 3);
            
            /*********************************************************
            GUESS THE NUMBER MODULE
            *****************************************************/
            guess = -1;//initializing guess early
            
            if(choice == 1)
            {
            do{
     
                System.out.println("I will choose a number between 1 and 50."
                        + "\nyou you have "+tries+" tries remaining."
                        + "\nWhat is your guess?");
                
                guess = scanN.nextInt();
                if(tries == 1)
                {
                  System.out.println("Sorry, out of tries... "
                            + "Better luck next time."); 
                  break;//program ignores break; so had to use
                                //System.exit(0)
                }
                else if(guess == ranNum)
                {
                  System.out.println("Congratulations, you guessed correct!");
                  break;//break; is not ignored here for some reason
                } else if (guess < ranNum)
                {
                    System.out.println("HINT: Guess Higher...");
                } else if (guess > ranNum)
                {
                    System.out.println("HINT: Guess Lower...");
                } 
                 tries--;   
            
            } while(guess != ranNum || tries != 1);//end of do while loop
            
            }//if choice == 1
            
            /*********************************************************
            ROCK  PAPER SCISSORS MODULE
            *****************************************************/
            if(choice == 2)
            {
                System.out.println("WELCOME TO ROCK PAPER SCISSORS"
                      + "\nTo play simply type rock, paper, or scissors and"
                      + " see who wins.\n We will be playing best of 3"
                      + "\n Press 1 for rock, 2 for paper, and 3 for scissors");
                
             do{                
                //program chooses rock, paper, or scissors
                pPlay = (int)(1+Math.random()*3);             
                    
                //if user dooesn't type 1, 2 or 3
                do
                {
                userPlay = scanN.nextInt();
                        
                if(userPlay != 1 && userPlay != 2 && userPlay != 3){
                            System.out.println("Invalid, please enter again.");
                    }
                        
                }while(userPlay != 1 && userPlay != 2 && userPlay != 3);
                    
                /* beginning of ONE BILLION if statements and the most complex
                   section of this program
                   lots of comments in this section too...
                    */
                
                    //changed my if formatting to make more compact since there
                    // was so many if statements
                    
                    if(userPlay == 1 && pPlay == 1){
                        System.out.println("I chose "+pPlay+" and we draw");}
                        //user rock, program rock
                    else if(userPlay == 1 && pPlay == 2){
                        System.out.println("I chose "+pPlay+" and you lose");
                       //user rock,program paper
                    }else if(userPlay == 1 && pPlay == 3){
                        System.out.println("I chose "+pPlay+" and you win");
                        //user rock,program scissor
                    }else if(userPlay == 2 && pPlay == 1)
                    {
                        System.out.println("I chose "+pPlay+" and you win");
                       //user paper,program rock
                    }else if(userPlay == 2 && pPlay == 2){
                        System.out.println("I chose "+pPlay+" we draw");
                        //user paper,program paper
                    } else if(userPlay == 2 && pPlay == 3){
                        System.out.println("I chose "+pPlay+" and you lose");
                        //user paper,program scissor
                    } else if(userPlay == 3 && pPlay == 1){
                        System.out.println("I chose "+pPlay+" and you lose");
                        //user scissor,program rock
                    } else if(userPlay == 3 && pPlay == 2){ 
                        //user scissor,program paper
                        System.out.println("I chose "+pPlay+" and you win");                   
                    } else if(userPlay == 3 && pPlay == 3){
                        //user rock,program rock
                        System.out.println("I chose "+pPlay+" and we draw");
                     }
                
                 // updates scores based on a games outcome
                if (userPlay == 1 && pPlay == 2) {
                    score2++; //user loses
                } else if (userPlay == 1 && pPlay == 3) {
                    score1++; //user win
                }else if (userPlay == 2 && pPlay == 1) {
                    score1++; //user win
                } else if (userPlay == 2 && pPlay == 3) {
                    score2++; //user loses
                } else if (userPlay == 3 && pPlay == 1){
                    score2++; //user loses
                } else if (userPlay == 3 && pPlay == 2){
                    score1++; //user win
                }
            // output scores after each round
            System.out.println("Score: You - " + score1 + ", Me - " + score2);
            
            // win/loss messages output
            //no comments in this section im done with comments and its fairly
            //obvious for me to tell what each if does
             if(score1 == 2 && score2 ==0){
                    System.out.println("Congratulations, you win!");
                    break;
                }else if(score1 == 3 && score2 == 0){
                    System.out.println("Congratulations, you win!");
                    break;
                } else if(score1 == 0 && score2 == 2){
                    System.out.println("Sorry, you lose...");
                    break;
                }else if(score1 == 0 && score2 == 3){
                    System.out.println("Sorry, you lose...");
                    break;
                }

                
                
                }while(!(score1 == 2 || score2 == 2));//end of do while

                            
            }//if choice == 2
            
            /*********************************************************
            EXIT MODULE
            *****************************************************/
            if(choice == 3)
            {
                System.out.println("Thank you for visiting the java arcade, "
                        + "hope to see you again!");
                System.exit(0);
            }
            
        }while(choice == 1|| choice == 2|| choice == 3);
       
        //project FINALLLY DONE did i mention i wrote this in one day 
    }
    
}

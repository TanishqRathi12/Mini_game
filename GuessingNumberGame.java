import java.util.Scanner;
import java.util.Random;

public class GuessingNumberGame{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String play = "yes";

        while(play.equals("yes")){
            Random number = new Random();77
             int randnumber = number.nextInt(100);
             int guess = -100;
             int tries = 0;
        
        while(randnumber != guess){
            System.out.println("Guess the number between 1 and 100");
            System.out.print("Type your number:");
            guess = sc.nextInt();
            tries++;
            if(guess == randnumber){
                System.out.println("Wow!,Congratulations you guess the correct number");
                System.out.println("you guessed the number in "+tries+" attempt");
                System.out.println("Would you like to play again!");
                System.out.println("Type YES or NO");
                play = sc.next().toLowerCase();
            }
            else if(guess > randnumber){
                System.out.println("The number is less than your guess Try again!");
            }
            else{
                System.out.println("The number is greater then your guess Try again!");
            }
        }    
        }
        sc.close();
    }
}

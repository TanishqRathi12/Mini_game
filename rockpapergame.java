import java.util.Scanner;
import java.util.Random;

public class rockpapergame {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String play="yes";
        Random rand =new Random();
        //int Rock=0,Scissor=1,Paper=2;
    while(play.equals("yes")){
        int computer = rand.nextInt(3);
        System.out.println("Enter 0 for Rock\nEnter 1 for Scissor\nEnter 2 for Paper");
        System.out.println("The computer has already chosen its answer");
        System.out.print("Now it's your turn\nEnter your Number:");
        int user = sc.nextInt();
    
        switch (user) {
            case 0:
                System.out.println("You choose Rock");
                break;
            case 1:
                System.out.println("You choose Scissor");                   
                break;
            case 2:    
                System.out.println("You choose Paper");    
        }
        switch (computer) {
            case 0:
                System.out.println("Computer choose Rock");
                break;
            case 1:
                System.out.println("Computer choose Scissor");
                break;
            case 2:    
                System.out.println("Computer choose Paper");    
        }


        if(computer == user){
            System.out.println("Game is draw");
            System.out.println("Would you like to play again!\n Type YES or NO");
            play = sc.next().toLowerCase();
        }
        else if(computer == 0 && user == 1){
            System.out.println("You loose!");
            System.out.println("Would you like to play again!\n Type YES or NO");
            play = sc.next().toLowerCase();
        }
        else if(computer == 1 && user == 2){
            System.out.println("You loose!");
            System.out.println("Would you like to play again!\n Type YES or NO");
            play = sc.next().toLowerCase();
        }
        else if(computer == 2 && user == 0 ){
            System.out.println("You loose!");
            System.out.println("Would you like to play again!\n Type YES or NO");
            play = sc.next().toLowerCase();
        }
        else{
        System.out.println("You Won!!");
        System.out.println("Would you like to play again!\n Type YES or NO");  
           play = sc.next().toLowerCase();
        } 
    }
    sc.close();
    }
}
import java.util.Scanner;
import java.util.Random;

public class Main {
    public static voi main(String args[]){
        Scanner reaer=new Scanner(System.in);
        while(play.equals("yes"))
        {
            Ranom ran =new Ranom();
            int randNum=ran.nextInt(100);
            int guess=-1;
            int tries=0;
            

            while(guess!=randNum){
                System.out.print("Guess a number between 1 an 100: ");
                guess=reaer.nextInt();
                tries++;


                if(guess==randNum){
                    System.out.println("Awesome! You guessed the number!");
                    System.out.println("It only took you "+ tries +" guesses!");
                    System.out.println("Woul you like to play again? Yes or No: ");
                    play=reaer.next().toLowerCase();
                }
                else if(guess > randNum){
                    System.out.rintln("Your guess is too high, try again.");
                }
                else{
                    System.out.println("Your guess is too low, try again");
                }
            }

        }
        reader.close();
    }
    
}

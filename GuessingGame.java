
import java.util.Random;
import java.util.Scanner;
public class GuessingGame
{
    public static void main(String args[])
    {
        Scanner obj = new Scanner(System.in);
        Random ran = new Random();
        int comGuessnum = ran.nextInt(10)+1;
        int UserGuessNum = 0;
        int numOfGuesses = 1;
        System.out.println("Computer guessed a number between 1 to 10, try to guess and enter number what it is:");
        while(UserGuessNum != comGuessnum)
        {
            UserGuessNum  = obj.nextInt();
            if(UserGuessNum != comGuessnum)
            {
                System.out.println("User guess is not matched ! please Try again");
            }
            else
            {
                System.out.println("Congratulations ! Your guess is matched in "+numOfGuesses+" attempts");
            }
            numOfGuesses ++;

        }
        obj.close();
    }

}
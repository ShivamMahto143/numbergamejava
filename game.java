import java.util.Random;
import java.util.Scanner;

public class game 
{
    public static void main(String[] args)
    {
        Random random = new Random();
        int RandNum = random.nextInt(100)+1;
        int count = 0;
        boolean isCorrect = false;
        System.out.println("Welcome to the Number Guessing Game!");

        Scanner scanner = new Scanner(System.in);

        while (!isCorrect) 
        {
            System.out.print("Guess a number between 1 to 100: ");
            int guess = scanner.nextInt();
            count++;

            if (guess == RandNum) 
            {
                System.out.println("Congratulations! You guessed the correct number in " + count + " attempts.");
                isCorrect = true;
            }
            else if (guess < RandNum) 
            {
                System.out.println("Try Some Higher Number! Try again.");
            }
            else 
            {
                System.out.println("Try some Lower Number! Try again.");
            }
        }

        scanner.close();
    }
}
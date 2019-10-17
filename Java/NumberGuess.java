package Java;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class NumberGuess {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.print("What is your name? ");
        String name = scan.nextLine();
        System.out.println("Hello " + name + ", I want to play a game.");

        ArrayList<Integer> guesses = new ArrayList<Integer>();
        Random random = new Random();
        int number = random.nextInt(100 - 1) + 1;
        int attempts = 0;
        int guess = 0;

        while(attempts < 10){
            try{
                System.out.print("Guess a number: ");
                guess = scan.nextInt();
                guesses.add(guess);
            }
            catch(Exception ex){
                System.out.println("You entered a non valid integer!");
                continue;
            }

            attempts++;

            if(guess > number){
                System.out.println("Your guess is too high!");
            }
            else if(guess < number){
                System.out.println("Your guess is too low!");
            }
            else{
                System.out.println("That is correct!");
                System.out.println("Found answer in attempt " + attempts);
                scan.close();
                break;
            }

            System.out.println("Attempts made: " + attempts);
        }

        System.out.println("Guess history:");
        for (Integer value : guesses) {
            System.out.println(value);
        }

        System.out.println("Game over!");
    }
}
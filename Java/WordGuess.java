package Java;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class WordGuess {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.print("What is your name? ");
        String name = scan.nextLine();
        System.out.println("Hello " + name + ", I want to play a game.");

        ArrayList<String> guesses = new ArrayList<String>();
        ArrayList<String> words = new ArrayList<String>();
        
        String guess;
        String word;

        while(true){
            System.out.print("Enter a word: ");
            word = scan.nextLine();
            if(word == null || word == ""){
                break;
            }
            words.add(word);
        }

        Random random = new Random();
        int number = random.nextInt(words.size());
        word = words.get(number);
        int attempts = 0;

        while(attempts < 10){
            try{
                System.out.print("Guess a word: ");
                guess = scan.nextLine();
                if(word == null || word == ""){
                    continue;
                }
                guesses.add(guess);
            }
            catch(Exception ex){
                System.out.println("You entered a non valid string!");
                continue;
            }

            attempts++;

            if(!guess.equals(word)){
                System.out.println("That is not correct!");
                System.out.println("Attempts made: " + attempts);
            }
            else{
                System.out.println("That is correct!");
                System.out.println("Found answer in attempt " + attempts);
                scan.close();
                break;
            }
        }

        System.out.println("Guess history:");
        for (String value : guesses) {
            System.out.println(value);
        }

        System.out.println("Game over!");
    }
}
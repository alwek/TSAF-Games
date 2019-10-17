using System;
using System.Collections.Generic;

namespace TSAF{
    public class NumberGuess{
        public static void Main(){
            Console.Write("What is your name? ");
            string name = Console.ReadLine();
            Console.WriteLine("Hello " + name + ", I want to play a game.");

            Random random = new Random();
            int number = random.Next(1, 100);
            int attempts = 0;
            List<int> guesses = new List<int>();
            int guess = 0;
            
            while(attempts < 10){
                try{
                    Console.Write("Guess a number: ");
                    guess = int.Parse(Console.ReadLine());
                    guesses.Add(guess);
                } 
                catch(Exception){
                    Console.WriteLine("You entered a non valid integer!");
                    continue;
                }

                attempts++;

                if(guess > number){
                    Console.WriteLine("Your guess is too high!");
                }
                else if(guess < number){
                    Console.WriteLine("Your guess is too low!");
                }
                else{
                    Console.WriteLine("That is correct!");
                    Console.WriteLine("Found answer in attempt " + attempts);
                    break;
                }
                Console.WriteLine("Attempts made: " +  attempts);
            }

            Console.WriteLine("Guess history:");
            foreach(int value in guesses){
                Console.WriteLine(value);
            }

            Console.WriteLine("Game over!");
        }
    }
}
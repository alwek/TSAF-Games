using System;
using System.Collections.Generic;

namespace TSAF{
    public class WordGuess{
        public static void Main(){
            Console.Write("What is your name? ");
            string name = Console.ReadLine();
            Console.WriteLine("Hello " + name + ", I want to play a game.");

            List<string> guesses = new List<string>();
            List<string> words = new List<string>();
            string guess;
            string word;
            int attempts = 0;

            while(true){
                Console.Write("Enter a word: ");
                word = Console.ReadLine();
                if(string.IsNullOrEmpty(word)){
                    if(words.Count < 1){
                        continue;
                    }
                    break;
                }
                words.Add(word);
            }

            Random random = new Random();
            int number = random.Next(0, words.Count);
            word = words[number];

            while(attempts < 10){
                System.Console.Write("Guess a word: ");
                guess = Console.ReadLine();
                if(string.IsNullOrEmpty(guess)){
                    Console.WriteLine("You entered a non valid string!");
                    continue;
                }
                guesses.Add(guess);
                attempts++;

                if(word.Equals(guess)){
                    Console.WriteLine("That is correct!");
                    Console.WriteLine("Found answer in attempt: " + attempts);
                    break;
                }
                else{
                    Console.WriteLine("That is not correct!");
                    System.Console.WriteLine("Attempts made: " + attempts);
                }
            }

            Console.WriteLine("Guess history: ");
            foreach(string value in guesses){
                Console.WriteLine(value);
            }

            Console.WriteLine("Game over!");
        }
    }
}
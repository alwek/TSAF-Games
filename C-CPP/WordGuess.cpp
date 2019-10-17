#include <stdio.h>
#include <stdlib.h>
#include <time.h>
#include <ctype.h>
#include <iostream>
#include <limits>
#include <bits/stdc++.h>

int main(void) {
    char name[50];
    printf("What is your name? ");
    scanf("%s", name);
    printf("Hello %s, I want to play a game.\n", name);
    
    int i = 0;
    int turns = 10;
    int attempts = 0;
    char guess[50];
    char word[50];
    std::string guesses[turns];
    std::array<std::string, 10> words;
    while(true){
        printf("Enter a word: ");
        int result = scanf("%s", word);
        if(word[0] == 'q'){
            break;
        }
        words[i++] = word;
    }
    
    srand(time(NULL));
    int number = rand() % words.size();
    
    std::string wordToGuess = words.at(number);

    while(attempts < turns){
        printf("Guess a word: ");
        scanf("%s", guess);        
        guesses[attempts] = guess;
        attempts += 1;

        if(guess != word){
            printf("That is not correct!\n");
        }
        else{
            printf("That is correct!\n");
            printf("Found answer in attempt %d\n", attempts);
            break;
        }

        printf("Attemps made: %d\n", attempts);
    }

    printf("Guess history:\n");
    for(int i = 0; i < attempts; i++){
        printf("%s\n", guesses[i].c_str());
    }
}
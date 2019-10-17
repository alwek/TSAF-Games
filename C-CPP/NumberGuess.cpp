#include <stdio.h>
#include <stdlib.h>
#include <time.h>
#include <ctype.h>
#include <iostream>
#include <limits>

int main(void) {
  char name[50];
  printf("What is your name? ");
  scanf("%s", name);
  printf("Hello %s, I want to play a game.\n", name);

  srand(time(NULL));
  int number = rand() % 100 + 1;
  int turns = 10;
  int attempts = 0;
  int guess = 0;
  int guesses[turns];

  while(attempts < turns){
    try{
      printf("Guess a number: ");
      if(!(std::cin >> guess)){
          std::cin.clear();
          std::cin.ignore(std::numeric_limits<std::streamsize>::max(), '\n');
          throw -1;
      }
    }
    catch(int n){
      printf("You entered a non valid integer!\n");
      continue;
    }
    guesses[attempts] = guess;
    attempts += 1;

    if(guess > number){
      printf("Your guess is too high!\n");
    }
    else if(guess < number){
      printf("Your guess is too low!\n");
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
    printf("%d\n", guesses[i]);
  }
}
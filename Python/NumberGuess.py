import random

name = input("What is your name? ")
print("Hello %s, I want to play a game." % name)

number = random.randint(0, 100)
attempts = 0
guesses = []

while attempts < 10:
  try:
    guess = int(input("Guess a number: "))
    guesses.append(guess)
  except:
    print("You entered a non valid integer!")
    continue

  attempts += 1
  
  if guess > number:
    print("Your guess is high!")
  elif guess < number:
    print("Your guess is low!")
  else:
    print("That is correct!")
    print("Found answer in attempt " + str(attempts))
    break
  print("Attempts made: " + str(attempts))

print("Guess history:")
for i in guesses:
  print(i)

print("Game over!")
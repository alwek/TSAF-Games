import random

name = input("What is your name? ")
print("Hello %s, I want to play a game." % name)

words = []
guesses = []

while True:
  word = input("Enter a word: ")
  if word == "":
    break
  words.append(word)

for i in words:
  print(i)

print("Selecting a word from the list")
wordToGuess = random.choice(words)
attempts = 0

while attempts < 10:
  guess = input("Guess the word: ")
  guesses.append(guess)
  attempts += 1

  if guess == wordToGuess:
    print("That is correct!")
    print("Found answer in attempt " + str(attempts))
    break
  else:
    print("That is not correct!")
    print("Attempts made: " + str(attempts))

print("Guess history:")
for i in guesses:
  print(i)

print("Game over!")
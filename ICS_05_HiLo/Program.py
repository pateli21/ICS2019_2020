import random

#this function takes a guess, evluates it, and gives back the appropriate response
def hiLo(magicNum, b, count, guessList):
    try: 
        guess = int(input("Guess a number between 1 and " + str(b) + ": "))
        count += 1
        if guess < 1  or guess > b:
            print("Your guess is out of the number range. :(")  
            hiLo(magicNum, b, count, guessList)
        elif guess in guessList:
            print("That number has already been guessed.")
            hiLo(magicNum, b, count, guessList)
        else:
            guessList += [guess]
            if guess == magicNum:
                if count == 1:
                    print("Yay! You guessed correctly after " + str(count) + " try. :)")
                else:
                    print("Yay! You guessed correctly after " + str(count) + " tries. :)")
                return "a"
            elif guess != magicNum:
                if guess > magicNum:
                    print("Your guess is higher than the magic number. :(")
                    hiLo(magicNum, b, count, guessList)
                elif guess < magicNum:
                    print("Your guess is lower than the magic number. :(")  
                    hiLo(magicNum, b, count, guessList)
    except:
        print("Your guess is not an integer.")
        hiLo(magicNum, b, count, guessList)

        
#this asks if the player wants to play and reacts accordingly
play = input("Would you like to play \"Guess the Number\"? (y/n): ")
if play == "y":
    print("Instrustions: In this game you have to guess a number between 1 and the other number inclusive.\nAs you complete each level, the range of numbers will increase by five. \nGood Luck!")
elif play != "y" and play != "n":
    while play != "y" and play != "n":
        print("You must answer with \"y\" or \"n\".")
        play = input("Would you like to play \"Guess the Number\"? (y/n): ")
b = 5
level = 1
#this while loop keeps on running the game until the user quits the game
while play == "y":
    print("\nLevel " + str(level))
    count = 0
    guessList = []
    magicNum = random.randint(1, b)
    hiLo(magicNum, b, count, guessList)
    play = input("Would you like to move on to the next level? (y/n): ")
    if play != "y" and play != "n":
        while play != "y" and play != "n":
            print("You must answer with \"y\" or \"n\".")
            play = input("Would you like to play \"Guess the Number\"? (y/n): ")
    b += 5
    level += 1











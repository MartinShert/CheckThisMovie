# CheckThisMovie
This is the code for my game 'Guess the movie'


First we can download any movie list we want in .txt format.
Since the .txt file keeps each movie on it's own line,
iterate through that list and turn it into an Array list that we can iterate through each movie with a 
Random class random function and choose a movie at random so we can continue with our 'Guess the Movie' game.

Then we want to make a string called MovieToGuess and assign our random movie to that.

The rest is pretty basic, we just want to prompt the player to enter a letter for their guess and if that letter is a match in the string MovieToGuess then we 
change that hidden character in the string and display the correct character. They have 10 guesses and depending on whether they guess correctly or not, finally 
print out 'You win!!' or 'I am sorry, you didn't win this time, please play again.'

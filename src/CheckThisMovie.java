import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Random;
import java.util.*;
import java.util.regex.*;

public class CheckThisMovie {

    public static void main(String[] args) throws Exception {

        Scanner s = new Scanner(new File("movies.txt"));
        ArrayList<String> list = new ArrayList<String>();
        while (s.hasNext()) {
            list.add(s.nextLine());
//            String guessedMovie = list.get(Math.random);
        }
        s.close();


        System.out.println(list);
//        ListIterator<ArrayList> it = list;
        Random rand = new Random();
        String movieToGuess = list.get(rand.nextInt(list.size()));
        String nMovieToGuess = movieToGuess.replaceAll(" ", "");
        System.out.println(nMovieToGuess);
        int num = nMovieToGuess.length();
        System.out.println("You are guessing: ");
        for (int j = 0; j < num; j++) {
            System.out.print("_");
        }
        int guesses = 10;
        char str[] = nMovieToGuess.toCharArray();
        char blank[] = new char[str.length];
        System.out.println();
        for (int z = 0; z < blank.length; z++) {
            blank[z] = '_';
        }
        int wrongLetter = 0;
        List<Character> alphabets = new ArrayList<Character>();
        while (guesses > 0) {
            System.out.println("Please guess a letter: ");
            Scanner scan = new Scanner(System.in);
            char pickedLetter = scan.next().charAt(0);
//            System.out.println(str[4]); Right here we tested our method toCharArray-it works!!
            String mark;
            char b;
            for (int i = 0; i < str.length; i++) {
                b = str[i];
                if (b == pickedLetter) {
                    blank[i] = b;
//                    System.out.println(blank);
                }
            }
            //Starting on this line, we need to check the next several lines to see if we can run an alpha check on every element of blank and if all characters are alpha, print "You win!!"
            for (int x = 0; x < blank.length; x++) {
                if (blank[x] != ('_') && (x == str.length - 1)) {
                    System.out.println("You win!! Congratulations!");
                    break;
                }
            }
//            continue;
////            }else{
//            break;
//            This is the end of this possible check, not finished yet.
            System.out.println(blank);


//
//            System.out.println(blank);
//            System.out.println(alphabets);
//            guesses--;
            alphabets.add(pickedLetter);
            System.out.print("You have guessed: ");
            System.out.println(alphabets);
            guesses--;
            System.out.println("You have " + guesses + " guesses left.");

        }
        System.out.println(blank);
        System.out.println(alphabets);


//                System.out.println(alphabets);

    }
}




//                if (t != pickedLetter) {
////                    alphabets.add(t);
////                    System.out.println(alphabets);
//                    break;


//                char letterNotFound =


//                System.out.println(mark);


//        wrongLetter += 1;

//            String regex = "^[a-zA-Z0-9]+$";
//
//            Pattern pattern = Pattern.compile(regex);
//
//            for (char alphabet : alphabets)
//            {
//                Matcher matcher = pattern.matcher((CharSequence) alphabets);
//                System.out.println(matcher.matches());
//            }
//        guesses--;
//        System.out.println(guesses);


//            System.out.println(wrongLetter);
//            System.out.println(guesses);
//            for (int j = 0; j < blank.length; j++){ I have no clue if this and hte next two lines will work
//                if ((blank[j] >= 65 && blank[j] <= 90)
//                        || (blank[j] >= 97 && blank[j] <= 122))

//            System.out.println(blank);


//        System.out.println("Game Over, see you next time!");

//            break;

//        System.out.println(str);
//            System.out.println("I'm sorry, You didn't win this time!");

    // Now that our array is holding our list. Let us try to put the guessed movie
    // into a String called guessedMovie







package exercises;

import java.util.Scanner;

public class Alice {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String text = ("Alice was beginning to get very tired of sitting by her sister on the bank, and of having " +
                "nothing to do: once or twice she had peeped into the book her sister was reading, but it had no " +
                "pictures or conversations in it, 'and what is the use of a book,' thought Alice 'without pictures or " +
                "conversation?'");
        System.out.println("What term would you like to search for: ");
        String term = input.nextLine();
        boolean isFound = text.toLowerCase().contains(term); // true
        System.out.println(isFound);

    }
}


/* The first sentence of Alice’s Adventures in Wonderland is below. Store this sentence in a string, and then prompt the user for a term to search for within this string. Print whether or not the search term was found. Make the search case-insensitive, so that searching for “alice”, for example, prints true.

Alice was beginning to get very tired of sitting by her sister on the bank, and of having nothing to do: once or twice she had peeped into the book her sister was reading, but it had no pictures or conversations in it, 'and what is the use of a book,' thought Alice 'without pictures or conversation?'*/
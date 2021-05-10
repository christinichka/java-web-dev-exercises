package org.launchcode.java.studios.countingcharacters;

import java.util.*;

// Write a program to count the number of times each character occurs in a string
public class CountCharacterOccurrences {
    static void characterCount(String myString) {
        // HashMap allows a char as a key and the occurrences as a value
        HashMap<Character, Integer> charCountMap = new HashMap<Character, Integer>();
        // Convert the string to the array
         char[] charactersInString = myString.toCharArray();
//        char[] strArray = inputString.toCharArray();
        // Loop through to check each char of strArray and IF it occurs multiple times, add 1 for each occurrence
        for (char c : charactersInString) {
            // For each time the char occurs increase count by 1
            if (charCountMap.containsKey(c)) {
                charCountMap.put(c, charCountMap.get(c) + 1);
            // If char only occurs once then display 1
            } else {
                charCountMap.put(c, 1);
            }
        }
        for (Map.Entry entry : charCountMap.entrySet()) {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }
    }
    // Print the results to the console
    public static void main(String[] args) {
        String str = "If the product of two terms is zero then common sense says at least one of the two terms has to be zero to start with. So if you move all the terms over to one side, you can put the quadratics into a form that can be factored allowing that side of the equation to equal zero. Once you’ve done that, it’s pretty straightforward from there.";
        characterCount(str);
    }
}


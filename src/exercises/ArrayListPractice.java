package exercises;
import java.util.ArrayList; // import the ArrayList class
import java.util.*;

public class ArrayListPractice {

    public static void main(String args[]) {
        List<Integer> integerArray = new ArrayList<>(); // Within main, create a list with at least 10 integers and call your method on the list.
        integerArray.add(0);
        integerArray.add(1);
        integerArray.add(2);
        integerArray.add(3);
        integerArray.add(4);
        integerArray.add(5);
        integerArray.add(6);
        integerArray.add(7);
        integerArray.add(8);
        integerArray.add(9);

        List<Integer> arr = new ArrayList<Integer>(integerArray);


        // print ArrayList
        System.out.println("ArrayList : " + arr);

        // 1. Write a static method to find the sum of all the even numbers in an ArrayList
//        double sum = 0;
//        for (int integer: integerArray) {
//            if (integer % 2 == 0) {
//               total += integer;
//            }
//        }
//        return total;
//
//        for (int i = 0; i < arr.size(); i++) {
//            sum = sum +(double) arr.get(i);
//        }
//        return sum;

        // 2. Write a static method to print out each word in a list that has exactly 5 letters.

        // 3. Modify your code to prompt the user to enter the word length for the search.

        // BONUS: Instead of creating our own list of words, what if we want to use the string from the Array Practice section? Search “Java convert String to ArrayList” online to see how to split a string into the more flexible ArrayList collection.
    }
}

// Resource I found useful for initializing ArrayList https://www.geeksforgeeks.org/initialize-an-arraylist-in-java/
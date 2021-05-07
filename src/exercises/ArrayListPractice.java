package exercises;
import java.util.ArrayList; // import the ArrayList class

public class ArrayListPractice {
    // Within main, create a list with at least 10 integers and call your method on the list.
    int[] integerArray = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};

    public static int sumEven(ArrayList<Integer> arr) {
        // 1. Write a static method to find the sum of all the even numbers in an ArrayList
        int total = 0;
        for (int integer: arr) {
            if (integer % 2 == 0) {
                total += integer;
            }
        }
        return total;
    }
}


import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class Practice {
    /**
     * Returns the difference between the largest and smallest integer in an array.
     * 
     * @param nums a non-empty, non-null array of numbers
     * @return the difference between the largest and smallest number
     */
    public static int maxDiff(int[] nums) {
        int largest = nums[0];
        int smallest = nums[0];
        for(int i = 0; i < nums.length; i++){

            if(nums[i] > largest) {
                largest = nums[i];
            } else if(nums[i] < smallest) {
                smallest = nums[i];
            }
        }
        return largest - smallest;

    }

    public static String longestCharWord(ArrayList<String> words, String searchChar) {
        // Starts with letter, longest word
        searchChar = searchChar.toLowerCase();
        String longestWord = "";
        for(int i = 0; i < words.size() ; i++) {
            String wordOne = words.get(i);
            if (wordOne.toLowerCase().startsWith(searchChar) && longestWord.length() < wordOne.length()){
                longestWord = wordOne;
            }
        }
        return longestWord;
    }
    

    public static int longerThanOneShorterThanTwo(HashSet<String> words, int one, int two) {
        int count = 0;
        for(String n : words){
            if(one < n.length() && n.length() < two){
                count++;
            }
        }
        return count;
    }

    public static int diffEvenOdd(HashMap<Integer, Integer> numbers) {
        int odds = 0;
        int evens = 0;
        for(int n : numbers.values()) {            
            if( n % 2 == 0){
                odds++;
            }
            else{
                evens++;
            }
        }
        if(odds > evens){
            return odds - evens;
        }
        else{
            return evens - odds;
        }
    }

    public static int secondLargest(HashMap<Integer, Integer> numbers) {
        int largest = 0;
        int secondmost = 0;
        for(int n : numbers.keySet()) {          
            if(n > largest){
                secondmost = largest;
                largest = n;
            } 
            else{
                if( n > secondmost && n < largest) {
                secondmost = n;
                }
            }

        }
        return secondmost;
    }

    public static String longestCharWordArr(String[] strings, String charToSearch) {
        charToSearch = charToSearch.toLowerCase();
        String longestString = "";
        for (String n : strings) {
            if(n.toLowerCase().startsWith(charToSearch) && longestString.length() < n.length()) {
                longestString = n;
            }
        }
        return longestString;
    }
    // TODO: Implement the other methods from the study guide AND tests for each one

    // For each method you are only required to implement it for one of the data
    // structures. But use a different data structure for each method. For example,
    // do maxDiff with an array, the next question with a Set, etc.
}
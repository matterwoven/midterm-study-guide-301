
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
        // TODO: implement this
        int largest = 0;
        int smallest = 0;
        boolean flip = true;
        for(int i = 0; i < nums.length; i++){
            if(nums[i] > largest || flip == true){
                largest = nums[i];
            }
            if(nums[i] < smallest || flip == true){
                smallest = nums[i];
                flip = false;
            }
        }
        return largest - smallest;
    }

    public static String longestWordByStartingLetter(ArrayList<String> arrayList, String startLetter) {
        String currentLongest = "";
        for(String word : arrayList){
            if(word.toLowerCase().startsWith(startLetter.toLowerCase()) && word.length() > currentLongest.length()){
                currentLongest = word;                
            }
        }
        return currentLongest;
    
    }

    public static int wordsLongerThanAndShorterThan(HashSet<String> hashSet, int n, int m){
        int count = 0;
        for(String words : hashSet){
            if(words.length() > n && words.length() < m) {
                count++;
            }
        }
        return count;
    }

    public static int differenceBetweenEvenOddCountValues(HashMap<Integer, Integer> hashMap){
        int evenCount = 0;
        int oddCount = 0;
        for (int nums : hashMap.values()){
            if(nums % 2 == 0){
                evenCount++;
            }
            else{
                oddCount++;
            }
        }
        if(evenCount > oddCount){
            return evenCount - oddCount;
        }
        return oddCount - evenCount;
    }

    public static int secondLargestNumberKeys(HashMap<Integer, Integer> hashMap){
        int secondLargest = 0;
        int largest = 0;
        boolean flag = true;
        for (int key : hashMap.keySet()){
            if(flag == true){
                secondLargest = key;
                largest = key;
                flag = false;
            }
            if(key > largest){
                secondLargest = largest;
                largest = key;
            }
            if(key > secondLargest && key < largest){
                secondLargest = key;
            }
        }
        return secondLargest;
    }

    public static void main(String[] args) {
        int[] numbers = {3, 7, 2, 9, 4};
        //Difference in an array
        System.out.println(maxDiff(numbers));
        //Find the longest word that starts with a specific character letter in an arraylist
        String[] wordsArray = {"Word", "Animal", "Adjective", "Bull", "Bologna", "Super", "Secretive"};
        ArrayList<String> words = new ArrayList<String>(); 
        for(int i = 0; wordsArray.length > i; i++){
            words.add(wordsArray[i]);
        }
        System.out.println(longestWordByStartingLetter(words, "s"));
        //Count how many words are longer than n characters and shorter than m characters in a HashSet
        String[] wordsLongShortArray = {"Word", "Animal", "Adjective", "Bull", "Bologna", "Super", "Secretive"};
        HashSet<String> wordsLongShort = new HashSet();
        for(String wordShorter : wordsLongShortArray){
            wordsLongShort.add(wordShorter);
        }
        System.out.println(wordsLongerThanAndShorterThan(wordsLongShort, 4, 7));
        //Find the difference between how many odd and even numbers there are in the values of a HashMap
        int[] evenOddValuesHashMap = {1, 2, 15, 99, 32, 24, 17, 12, 16, 4, 1, 2, 7, 9, 3, 13, 6, 7, 5};
        HashMap<Integer, Integer> differenceValuesHash = new HashMap();
        int increment = 0;
        for(int num : evenOddValuesHashMap){
            differenceValuesHash.put(increment, num);
            increment++;
        }
        System.out.println(differenceBetweenEvenOddCountValues(differenceValuesHash));
        //Find the second-largest number in the keys of a HashMap
        int[] secondLargestOfKeysArray = {-55, -50, -8, -2, -1, 5,};
        HashMap<Integer, Integer> secondLargestKeysHash = new HashMap();
        for(int num : secondLargestOfKeysArray){
            secondLargestKeysHash.put(num, 1);
        }
        System.out.println(secondLargestNumberKeys(secondLargestKeysHash));
    }

    // TODO: Implement the other methods from the README AND tests for each one

    // For each method you are only required to implement it for one of the data
    // structures. But use a different data structure for each method. For example,
    // do maxDiff with an array, the next question with a Set, etc.
}
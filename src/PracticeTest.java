import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;

import org.junit.jupiter.api.Test;

public class PracticeTest {

    // TODO: Make more tests for maxDiff
    
    // Find the difference between the largest and smallest integer in:
    // - An array
    @Test
    public void testingDifferenceByStartingSpecialCharacters(){
        //Difference in an array
        int[] numbers = {3, 7, 2, 9, 4};
        assertEquals(7, Practice.maxDiff(numbers));
    }

    // Find the longest word that starts with a specific character letter in:
    // - An ArrayList
    @Test
    public void wordsLongestStartingWithLetter(){
        //Find the longest word that starts with a specific character letter in an arraylist
        String[] wordsArray = {"Word", "Animal", "Adjective", "Bull", "Bologna", "Super", "Secretive"};
        ArrayList<String> words = new ArrayList<String>(); 
        for(int i = 0; wordsArray.length > i; i++){
            words.add(wordsArray[i]);
        }
        assertEquals("Secretive", Practice.longestWordByStartingLetter(words, "s"));
    }
    // Count how many words are longer than n characters and shorter than m characters in:
    // - A HashSet
    @Test
    public void wordsLongerThanAndShorterThanWithNegatives(){
        String[] wordsLongShortArray = {"Word", "Animal", "Adjective", "Bull", "Bologna", "Super", "Secretive"};
        HashSet<String> wordsLongShort = new HashSet();
        for(String wordShorter : wordsLongShortArray){
            wordsLongShort.add(wordShorter);
        }
        assertEquals(2, Practice.wordsLongerThanAndShorterThan(wordsLongShort, -4, 5));
    }

    // Find the difference between the how many odd and even numbers there are in:
    // - The values of a HashMap
    @Test
    public void diffBetweenOddEvenRandomized(){
        //Find the difference between how many odd and even numbers there are in the values of a HashMap
        int[] evenOddValuesHashMap = {1, 2, 15, 99, 32, 24, 17, 12, 16, 4, 1, 2, 7, 9, 3, 13, 6, 7, 5};
        HashMap<Integer, Integer> differenceValuesHash = new HashMap();
        int increment = 0;
        for(int num : evenOddValuesHashMap){
            differenceValuesHash.put(increment, num);
            increment++;
        }
        assertEquals(3, Practice.differenceBetweenEvenOddCountValues(differenceValuesHash));
    }

    // Find the second-largest number in:
    // - The keys of a HashMap
    @Test
    public void secondLargestKeysNegatives(){
        //Find the second-largest number in the keys of a HashMap
        int[] secondLargestOfKeysArray = {-55, -50, -8, -2, -1, 5,};
        HashMap<Integer, Integer> secondLargestKeysHash = new HashMap();
        for(int num : secondLargestOfKeysArray){
            secondLargestKeysHash.put(num, 1);
        }
        assertEquals(-1, secondLargestNumberKeys(secondLargestKeysHash));
    }
}



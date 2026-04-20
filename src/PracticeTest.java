import static org.junit.Assert.*;

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
    public static void testingDifferenceByStartingSpecialCharacters(){
        //Difference in an array
        int[] numbers = {3, 7, 2, 9, 4};
        assertEquals(7, Practice.maxDiff(numbers));
    }

    // Find the longest word that starts with a specific character letter in:
    // - An ArrayList
    @Test
    public static void wordsLongestStartingWithLetter(){
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

    // Find the difference between the how many odd and even numbers there are in:
    // - The values of a HashMap

    // Find the second-largest number in:
    // - The keys of a HashMap
    
}



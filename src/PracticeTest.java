import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;

import org.junit.jupiter.api.Test;

public class PracticeTest {

    // TODO: Make more tests for maxDiff
    @Test
    void testMaxDiffPositiveAndNegative() {
        // Arrange
        int[] numbers = {8, -2, 9, -5};

        // Act
        int actual = Practice.maxDiff(numbers);

        // Assert
        // Largest: 9, Smallest: -5, Difference: 9 - -5 = 14
        assertEquals(14, actual);
    }
    
    @Test
    void testMaxDiffNegativeAndNegative() {
        // Arrange
        int[] numbers = {-10, -2, -9, -5};

        // Act
        int actual = Practice.maxDiff(numbers);

        // Assert
        // Largest: 9, Smallest: -5, Difference: 9 - -5 = 14
        assertEquals(8, actual);
    }
    
    @Test
    void testlongestCharWordA() {
        // Arrange
        ArrayList<String> words = new ArrayList<>(Arrays.asList("What", "Long", "AceRang", "ZingZang", "PingPang", "Aches", "Assimilate"));
        
        // Act
        String actual = Practice.longestCharWord(words, "a");

        // Assert
        // Largest: 9, Smallest: -5, Difference: 9 - -5 = 14
        assertEquals("Assimilate", actual);
    }

    @Test
    void testLongerThanOneShorterThanTwoDoubles() {
        HashSet<String> words = new HashSet<>(Arrays.asList("One", "Twos", "Threes", "Fourths", "Fifteensy"));

        int actual = Practice.longerThanOneShorterThanTwo(words, 0, 10);

        assertEquals(5, actual);
    }

    @Test
    void testDiffEvenOddNoEvens() {
        HashMap<Integer, Integer> nums = new HashMap<>();
        nums.put(1, 1);
        nums.put(2, 5);
        nums.put(3, 5);
        nums.put(4, 5);
        nums.put(5, 9);
        nums.put(6, 15);
        int actual = Practice.diffEvenOdd(nums);

        assertEquals(6, actual);
    }

    @Test
    void secondLargestScrambled() {
        HashMap<Integer, Integer> nums = new HashMap<>();
        nums.put(1, 1);
        nums.put(5, 9);
        nums.put(3, 5);
        nums.put(2, 5);
        nums.put(4, 5);
        nums.put(6, 15);
        int actual = Practice.secondLargest(nums);

        assertEquals(5, actual);
    }
    

    // TODO: Make tests for each problem you solve
    
}



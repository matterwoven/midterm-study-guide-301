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

    public static void main(String[] args) {
        int[] numbers = {3, 7, 2, 9, 4};
        System.out.println(maxDiff(numbers));
    }

    // TODO: Implement the other methods from the README AND tests for each one

    // For each method you are only required to implement it for one of the data
    // structures. But use a different data structure for each method. For example,
    // do maxDiff with an array, the next question with a Set, etc.
}
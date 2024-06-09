//1470. Shuffle the Array
//Leetcode: https://leetcode.com/problems/shuffle-the-array/
public class ShuffledPair {
    public static int[] shuffle(int[] nums, int n) {
        int[] result = new int[2 * n];
        int index = 0;
        
        for (int i = 0; i < n; i++) {
            result[index++] = nums[i];
            result[index++] = nums[i + n];
        }
        
        return result;
    }
    
    public static void main(String[] args) {
        int[] nums = {2, 5, 1, 3, 4, 7};
        int n = 3;
        
        int[] shuffledArray = shuffle(nums, n);
        
        for (int num : shuffledArray) {
            System.out.print(num + " ");
        }
    }
}
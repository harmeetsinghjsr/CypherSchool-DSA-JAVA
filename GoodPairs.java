//1512. Number of Good Pairs
//Leetcode question: https://leetcode.com/problems/number-of-good-pairs/
public class GoodPairs {
    public static int countGoodPairs(int[] nums) {
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] == nums[j]) {
                    count++;
                }
            }
        }
        return count;
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 1, 1, 3};
        int result = countGoodPairs(nums);
        System.out.println("Number of good pairs: " + result);
    }
}
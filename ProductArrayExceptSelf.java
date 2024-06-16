//Problem 238: Product of Array Except Self`
public class ProductArrayExceptSelf {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int[] left = new int[n];
        int[] right = new int[n];
        int[] res = new int[n];
        left[0] = 1;
        right[n - 1] = 1;
        for (int i = 1; i < n; i++) {
            left[i] = left[i - 1] * nums[i - 1];
        }
        for (int i = n - 2; i >= 0; i--) {
            right[i] = right[i + 1] * nums[i + 1];
        }
        for (int i = 0; i < n; i++) {
            res[i] = left[i] * right[i];
        }
        return res;
    }
    public static void main(String[] args) {
        ProductArrayExceptSelf paes = new ProductArrayExceptSelf();
        int[] nums = {1, 2, 3, 4};
        int[] res = paes.productExceptSelf(nums);
        for (int i : res) {
            System.out.print(i + " ");
        }
    }
}
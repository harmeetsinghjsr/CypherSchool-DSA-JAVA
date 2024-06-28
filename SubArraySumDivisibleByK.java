public class SubArraySumDivisibleByK {
    public int subarraysDivByK(int[] nums, int K) {
        int[] count = new int[K];
        count[0] = 1;
        int sum = 0;
        int res = 0;
        for (int a : nums) {
            sum = (sum + a) % K;
            if (sum < 0) {
                sum += K;
            }
            res += count[sum];
            count[sum]++;
        }
        return res;
    }
    public static void main(String[] args) {
        SubArraySumDivisibleByK obj = new SubArraySumDivisibleByK();
        int[] nums = {4, 5, 0, -2, -3, 1};
        int K = 5;
        System.out.println(obj.subarraysDivByK(nums, K));
    }    
}

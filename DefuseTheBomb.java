public class DefuseTheBomb {
    public int[] decrypt(int[] code, int k) {
        int n = code.length;
        int[] res = new int[n];
        if (k == 0) {
            return res;
        }
        for (int i = 0; i < n; i++) {
            int sum = 0;
            if (k > 0) {
                for (int j = 1; j <= k; j++) {
                    sum += code[(i + j) % n];
                }
            } else {
                for (int j = 1; j <= -k; j++) {
                    sum += code[(i - j + n) % n];
                }
            }
            res[i] = sum;
        }
        return res;
    }
    public static void main(String[] args) {
        DefuseTheBomb defuseTheBomb = new DefuseTheBomb();
        int[] code = {5, 7, 1, 4};
        int k = 3;
        int[] res = defuseTheBomb.decrypt(code, k);
        for (int i = 0; i < res.length; i++) {
            System.out.print(res[i] + " ");
        }
    }
}
https://leetcode.com/problems/defuse-the-bomb/submissions/1296677528
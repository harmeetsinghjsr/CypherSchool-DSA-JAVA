public class ZeroesToFront {
    public static void main(String[] args) {
        int[] arr = {1, 0, 2, 0, 3, 0, 4, 5, 6, 7};
        int n = arr.length;
        int count = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] != 0) {
                arr[count++] = arr[i];
            }
        }
        while (count < n) {
            arr[count++] = 0;
        }
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
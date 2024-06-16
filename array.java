public class array {
    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4};
        int arr1[] = new int[2];
        arr1[0] = 1;
        arr1[1] = arr[0];
        System.out.println(arr[0]);
        System.out.println(arr[1]);
        System.out.println(arr[2]);
        System.out.println(arr[3]);
        for (int i = 0; i < arr1.length; i++) {
            System.out.println(arr1[i]);
        }
    }
}
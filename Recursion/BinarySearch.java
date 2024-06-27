public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = {2,5,7,25,11,8,4,23,14,31};
        int x = 25;
        int l = 0;
        int r = arr.length - 1;
        while(l<=r)
        {
            int mid = l + (r-l)/2;
            if(arr[mid] == x){
                System.out.println("Value found at index: " + mid);
                break;
            }
            else if(x<arr[mid])
            {
                r=mid-1;
            }
            else{
                l=mid+1;
            }
        }
        // System.out.println("Value not found in the array.");
    }
}
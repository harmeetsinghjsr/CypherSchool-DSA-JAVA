import java.util.*;
public class SelectionSort {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter the number of elements in the array: ");
        int n=in.nextInt();
        System.out.println("Enter the elements of the array: ");
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=in.nextInt();
        }
        for(int i=0;i<n-1;i++){
            int min=i;
            for(int j=i+1;j<n;j++){
                if(arr[j]<arr[min]){
                    min=j;
                }
            }
            int temp=arr[i];
            arr[i]=arr[min];
            arr[min]=temp;
        }
        System.out.println("Sorted Array is: ");
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
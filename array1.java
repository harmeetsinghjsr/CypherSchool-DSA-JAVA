import java.util.*;
public class array1
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the size of the array : ");
        int n = in.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter the elements of the array : ");
        for(int i=0;i<n;i++)
        {
            arr[i] = in.nextInt();
        }
        System.out.print("Array is: ");
        for(int i = 0; i<n ; i++)
        {
            System.out.print(arr[i]+" ");
        }
    }
}
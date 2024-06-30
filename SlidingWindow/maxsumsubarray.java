import java.util.*;
public class maxsumsubarray {
    public static void main(String[] args) {
        int arr[]={10,5,10,2,5,7};
        int k=3;
        int n=arr.length;
        int wsum=0;
        int maxsum=-1000;
        for(int i=0;i<k;i++){
            wsum+=arr[i];
        }
        maxsum=wsum;//forgot to add this line
        for(int i=k;i<n;i++){
            wsum+=arr[i]-arr[i-k];
            maxsum=Math.max(maxsum,wsum);
        }
        System.out.println("Maximum sum subarray is "+maxsum);
    }
}

public class ReverseString
{
    public static void main(String[] args)
    {
        String s = "Hello World";
        int n = s.length();

        //1st Method
        char arr[] = new char[n];
        for(int i = 0;i<n;i++)
        {
            arr[i] = s.charAt(n-1-i);
        }
        String rev = new String(arr);
        System.out.println(rev);

        //2nd Method
        String res = new String();
        for(int i = n-1;i>=0;i--)
        {
            res = res + s.charAt(i);
        }
        System.out.println(res);

        //3rd Method
        char strArr[] = s.toCharArray();
        int l = 0;
        int r = n-1;
        while(l<r)
        {
            char temp = strArr[l];
            strArr[l] = strArr[r];
            strArr[r] = temp; 
            l++;
            r--;
        }
        String result = new String(strArr);
        System.out.println(result);
    }
}
public class Descending {
    public void fun(int n)
    {
        if(n<1)
        return;
        System.out.println(n);
        fun(n-1);
    }
    public static void main(String[] args) {
        Descending r = new Descending();
        r.fun(5);
    }
}

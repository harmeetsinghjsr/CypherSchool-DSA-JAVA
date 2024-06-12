class Loan
{
    int rate;
    Loan()
    {
        System.out.println("default constructor");
    }
    Loan(int rate)
    {
        this.rate = rate;
    }
    void show()
    {
        System.out.println("Rate of interest is: "+this.rate);
    }
}
class HomeLoan extends Loan
{
    int rate;
    HomeLoan()
    {
        System.out.println("default constructor");
        System.out.println(super.rate);
    }
    HomeLoan(int rate)
    {
        super(7);
        this.rate = rate;
    }
    void show()
    {
        System.out.println("Rate of interest is: "+this.rate);
        super.show();
        System.out.println("Rate of interest is: "+super.rate);
    }
}
public class Super {
    public static void main(String[] args) {
        HomeLoan obj = new HomeLoan(8);
        HomeLoan ob = new HomeLoan();
        Loan obj1 = new Loan(9);
        obj.show();
        ob.show();
        obj1.show();
    }
}

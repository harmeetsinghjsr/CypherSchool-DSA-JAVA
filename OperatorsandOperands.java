import java.util.Scanner;

public class OperatorsandOperands {
    public static void main(String args[])
    {
        Scanner in = new Scanner(System.in);
        // a, b -> operands
        System.out.println("Enter values to Add: ");

        int x=in.nextInt();
        int y=in.nextInt();
        // + -> operator
        int c=x+y;
        // = -> assignment operator
        System.out.println("Sum of both is: "+c);


        // Increment and Decrement Operators
        System.out.println("Enter A and B values: ");
        int a=in.nextInt();
        int b=in.nextInt();
        a++;
        System.out.println("Value of a after postfix increment is: "+a);
        --b;
        System.out.println("Value of b after prefix b is: "+b);

        System.out.println("Enter M ");
        int m=in.nextInt();
        int n=m++;
        --n;
        System.out.println("Value of m after increment and decrement is: "+n);
    }
}

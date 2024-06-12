import java.util.*;
class Inherit{
    int roll;
    String name;
    void getDetails(int r,String n)
    {
        roll=r;
        name=n;
    }
    void display()
    {
        System.out.println("Roll No: "+roll);
        System.out.println("Name: "+name);
    }
}
public class Student {
    public static void main(String[] args) {
        Inherit i=new Inherit();
        i.getDetails(1,"John");
        i.display();
    }
}

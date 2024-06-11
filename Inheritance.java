class Shape
{
    double pi=3.14;
    double getSq(double r)
    {
        return r*r;
    }
}
class Circle extends Shape
{
    void getArea(int r)
    {
        System.out.println("Area of Circle is: "+pi*getSq(r));
    }
}
public class Inheritance {
    public static void main(String[] args) {
        Circle c=new Circle();
        c.getArea(5);
    }
}

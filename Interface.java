interface Shape{
    double pi = 3.14;
    double getArea(double r);

}
class Circle implements Shape{
    public double getArea(double r){
        return pi*r*r;
    }
    void fun()
    {
        System.out.println("Circle");
    }
}
public class Interface {
    public static void main(String[] args)
    {
        Circle obj = new Circle();
        System.out.println(obj.getArea(5));
        obj.fun();
    }
}
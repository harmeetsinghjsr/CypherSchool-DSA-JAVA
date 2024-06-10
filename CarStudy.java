class Car
{
    String name;
    String color;
    int year;
    int maxSpeed;
    void accelerate()
    {
        System.out.println("Accelerating...");
    }
}
public class CarStudy {
    public static void main(String[] args) {
        Car car1 = new Car();
        car1.name = "BMW";
        car1.color = "Black";
        car1.year = 2021;
        car1.maxSpeed = 200;
        System.out.println("Car 1: " + car1.name + " " + car1.color + " " + car1.year + " " + car1.maxSpeed);
        car1.accelerate();
        Car car2 = new Car();
        car2.name = "Audi";
        car2.color = "White";
        car2.year = 2020;
        car2.maxSpeed = 180;
        System.out.println("Car 2: " + car2.name + " " + car2.color + " " + car2.year + " " + car2.maxSpeed);
        car2.accelerate();
    }
}
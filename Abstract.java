abstract class Car{
    abstract void brake();
    abstract void accelerate();
}
abstract class BMW extends Car{
    void brake(){
        System.out.println("BMW is braking");
    }
}
abstract class Audi extends Car{
    void accelerate(){
        System.out.println("Audi is accelerating");
    }
}
public class Abstract {
    public static void main(String[] args) {
        BMW b = new BMW() {
            @Override
            void accelerate() {
                System.out.println("BMW is accelerating");
            }
        };
        b.accelerate();
        b.brake();
    }
}
interface Animal {
    void sound();
}

interface Vehicle {
    void drive();
}

class MI implements Animal, Vehicle {
    public void sound() {
        System.out.println("Sound");
        // implementation for sound method
    }

    public void drive() {
        System.out.println("Drive");
        // implementation for drive method
    }
}
public class MultipleInheritance {
    public static void main(String[] args) {
        MI obj = new MI();
        obj.sound();
        obj.drive();
    }
}
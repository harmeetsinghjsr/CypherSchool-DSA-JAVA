public class Animal {
    public void eat() {
        System.out.println("Animal is eating.");
    }
}

public class Mammal extends Animal {
    public void run() {
        System.out.println("Mammal is running.");
    }
}

public class Dog extends Mammal {
    public void bark() {
        System.out.println("Dog is barking.");
    }
}

public class Cat extends Mammal {
    public void meow() {
        System.out.println("Cat is meowing.");
    }
}

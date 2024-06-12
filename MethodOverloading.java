class A{
    void show(){
        System.out.println("Hi");
    }
    void show(int a){
        System.out.println("Hello, "+a);
    }
    void show(int a, int b){
        System.out.println("Hello, "+a+" "+b);
    }
    void show(string s){
        System.out.println("Hello, "+s);
    }
}
public class MethodOverloading {
    public static void main(String[] args) {
        A obj = new A();
        obj.show();
        obj.show(10);
        obj.show(10, 20);
        obj.show("CypherSchool");
    }
}
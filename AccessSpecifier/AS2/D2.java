package CypherSchool-DSA-JAVA.AccessSpecifier.AS2;
import CypherSchool-DSA-JAVA.AccessSpecifier.AS1.A1;
public class D2 {
    public static void main(String[] args) {
        A1 obj = new A1();
        System.out.println(obj.w);
        // System.out.println(obj.z); // Compilation Error\
        D1 obj1 = new D1();
        System.out.println(obj1.z);
        System.out.println(obj1.x);
        
    }
}
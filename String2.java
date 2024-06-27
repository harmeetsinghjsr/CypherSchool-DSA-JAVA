import java.util.*;

public class String2 {
    public static void main(String[] args) {
        String name = "Cipher Schools";
        String name2 = "Cipher Schools";
        String name3 = new String("Cipher Schools");
        String name4 = new String("Cipher Schools");

        System.out.println(name == name2);
        System.out.println(name3 == name4);
        System.out.println(name == name3);

        String s1 = "Hello";
        s1 = s1 + "peeps";
        System.out.println(s1);
        System.out.println(s1 + ", how're you doing");
        System.out.println(s1);

        String s2 = new String("Hello");
        String s3 = new String("People");
        String s4 = s2.concat(s3);
        System.out.println(s4);
        System.out.println(s2);

        System.out.println("*******************");

        System.out.println("CHECKING STRINGS ARE EQUAL IN VALUE");

        System.out.println(name.equals(name2));
        System.out.println(name.equals(name3));

        System.out.println("*******************");

        System.out.println("3) Creating new string object from character array");

        char arr[] = { 'C', 'I', 'P', 'H', 'E', 'R' };
        String strfromArr = new String(arr);
        System.out.println(strfromArr);

        System.out.println("*******************");

        System.out.println("4) Creating partial string object from character array");
        String pstrfromArr = new String(arr, 1, 3);
        System.out.println(pstrfromArr);
        String pstrfromArr2 = new String(arr, 2, 3);
        System.out.println(pstrfromArr2);

        System.out.println("*******************");

        System.out.println("5) Changing cases");
        System.out.println(name.toLowerCase());
        System.out.println(name.toUpperCase());
        System.out.println(name);

        System.out.println("*******************");

        System.out.println("6) Splitting strings");
        String ss = "Hello, I am a string";
        String[] strArr = ss.split(" ");
        for (String s : strArr) {
            System.out.println(s);
        }
        // dots are special characters in regex, so we need to escape them
        String ss2 = "www.cipherschools.com";
        String[] strArr2 = ss2.split("[.]");
        for (String s : strArr2) {
            System.out.println(s);
        }

        System.out.println("*******************");

        System.out.println("7) Substring");
        String sub = name.substring(2);
        System.out.println(sub);
        String sub2 = name.substring(2, 5);
        System.out.println(sub2);

        System.out.println("*******************");

        System.out.println("8) Length of string");
        System.out.println(name.length());

        System.out.println("*******************");

        System.out.println("9) Find Index of a character");
        System.out.println(name.indexOf('S'));
        System.out.println(name.indexOf('S', 8));
        System.out.println(name.lastIndexOf('S'));
        // returns -1 if not found
        System.out.println(name.indexOf('Z'));

        System.out.println("*******************");

        System.out.println("10) Replace");
        System.out.println(name.replace('C', 'Z'));
        System.out.println(name.replace("Cipher", "Schools"));
    }
}
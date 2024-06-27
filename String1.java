import java.util.*;
public class String1{
public static void main(String[] args)
{
String name = "Cipher Schools";
String name2 = "Cipher Schools";
String name3 = new String("Cipher Schools");
String name4 = new String("Cipher Schools");

System.out.println(name==name2);
System.out.println(name3==name4);
System.out.println(name==name3);

String s1 = "Hello";
s1= s1 +"peeps";
System.out.println(s1);
System.out.println(s1+",how're you doing");
System.out.println(s1);

String s2= new String("Hello");
String s3= new String("People");
String s4= s2.concat(s3);
System.out.println(s4);
System.out.println(s2);

System.out.println("*******************");

System.out.println("CHECKING STRINGS ARE EQUAL IN VALUE");

System.out.println(name.equals(name2));
System.out.println(name.equals(name3));

System.out.println("*******************");

System.out.println("3) Creating new string object from character array");

char arr[] = {'C', 'I', 'P', 'H', 'E', 'R'};
String strfromArr = new String(arr);
System.out.println(strfromArr);
}
}
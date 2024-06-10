class Student {
    String name;
    int marks;
    String checkPassFail() {
        if (marks >= 40)
        return "Pass";
        else
        return "Fail";
    }
}
public class PassFail {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.name = "John";
        s1.marks = 35;
        System.out.println("Student 1: " + s1.name + " " + s1.marks + " " + s1.checkPassFail());
        Student s2 = new Student();
        s2.name = "Doe";
        s2.marks = 45;
        System.out.println("Student 2: " + s2.name + " " + s2.marks + " " + s2.checkPassFail());
    }   
}

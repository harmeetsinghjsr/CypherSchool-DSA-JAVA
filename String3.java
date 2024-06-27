public class String3 {
    public static void main(String[] args) {
        System.out.println("************************");
        System.out.println("1) String Concatenation");
        String wF = "Wakanda Forever";
        String sub= wF.substring(3);
        System.out.println(sub);
        String sub2= wF.substring(3, 7);
        System.out.println(sub2);

        System.out.println("************************");
        System.out.println("2) character at given Index");
        char ch = wF.charAt(3);
        System.out.println(ch);

        System.out.println("************************");
        System.out.println("3) String Comparison");
        String s1 = "Wakanda";
        String s2 = "Wakanda";
        String s3 = "Forever";
        System.out.println(s1.equals(s2));
        System.out.println(s1.equals(s3));
        System.out.println(s1.equalsIgnoreCase(s2));
        System.out.println(s1.equalsIgnoreCase(s3));

        System.out.println("************************");
        System.out.println("4) Array from a String");
        char[] arr = wF.toCharArray();
        for (char c : arr) {
            System.out.print(c + " ");
        }
        System.out.println();
        System.out.println("************************");
        System.out.println("5) String is empty or not");
        String s4 = "";
        System.out.println(s4.equals(""));

        System.out.println(s4.isEmpty());
        System.out.println(wF.isEmpty());

        System.out.println("************************");
        System.out.println("Comparing Strings using compareTo() method");
        String s5 = "Wakanda";
        String s6 = "Wakanda";
        String s7 = new String("Wakanda");
        System.out.println(s5 == s6);
        System.out.println(s5 == s7);
        System.out.println(s5.equals(s6));
        System.out.println(s5.equals(s7));
        System.out.println(s5.compareTo(s6));
        System.out.println(s5.compareTo(s7));
        System.out.println(s5.compareToIgnoreCase(s7));

        System.out.println("************************");
        System.out.println("String startsWith() and endsWith() method");
        System.out.println(wF.startsWith("Wak"));
        System.out.println(wF.endsWith("ver"));

        System.out.println("************************");
        System.out.println("String indexOf() and lastIndexOf() method");
        System.out.println(wF.indexOf('a'));
        System.out.println(wF.lastIndexOf('a'));

        System.out.println("************************");
        System.out.println("Trimming a String");
        String s8 = "  Wakanda Forever  ";
        System.out.println(s8.trim());
        
        System.out.println("************************");
        System.out.println("Replacing a character in a String");
        System.out.println(wF.replace('a', 'A'));
        System.out.println(wF.replace("Wakanda", "WAKANDA"));
        
    }
}
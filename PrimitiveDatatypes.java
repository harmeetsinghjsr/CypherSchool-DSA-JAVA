public class PrimitiveDatatypes {
    public static void main(String[] args) {
        // Primitive Datatypes
        // Integer
        int a = 10;
        System.out.println("int value is "+a);
        // Float
        float b = 10.5f;
        System.out.println("float value is "+b);
        // Double
        double c = 10.5;
        System.out.println("double value is "+c);
        // Character
        char d = 'A';
        System.out.println("char value is "+d);
        // Boolean
        boolean e = true;
        System.out.println("boolean value is "+e);
        // Short
        short f = 10;
        System.out.println("short value is "+f);
        // Long
        long g = 1000000000;
        System.out.println("long value is "+g);
        // Byte
        byte h = 10;
        System.out.println("byte value is "+h);
        System.out.println("-------------------------------------------------");

        //Implicit Conversions
        // byte to int
        int i=h;
        System.out.println("byte to int "+i);
        // short to int
        int j=f;
        System.out.println("short to int "+j);
        // int to long
        long k=a;
        System.out.println("int to long "+k);
        // int to float
        float l=a;
        System.out.println("int to float "+l);
        // long to float
        float m=k;
        System.out.println("long to float "+m);
        // float to double
        double n=b;
        System.out.println("float to double "+n);
        System.out.println("-------------------------------------------------");

        //Explicit Conversions
        // int to byte
        byte o=(byte)a;
        System.out.println("int to byte "+o);
        // int to short
        short p=(short)a;
        System.out.println("int to short "+p);
        // long to int
        int q=(int)k;
        System.out.println("long to int "+q);
        // float to int
        int r=(int)b;
        System.out.println("float to int "+r);
        // double to float
        float s=(float)c;
        System.out.println("double to float "+s);
        // float to long
        long t=(long)b;
        System.out.println("float to long "+t);
        System.out.println("-------------------------------------------------");
    }
}

public class Loops {
    public static void main(String[] args) {
        System.out.println("for loop");
        // for loop
        for (int i = 0; i < 5; i++) {
            System.out.println("Hello World");
        }
        System.out.println("while loop");
        // while loop
        int i = 0;
        while (i < 5) {
            System.out.println(i);
            i++;
        }
        System.out.println("do-while loop");
        // do-while loop
        int j = 0;
        do {
            System.out.println(j);
            j++;
        } while (j < 5);

        //for loop reverse
        System.out.println("for loop reverse");
        for (int k = 5; k > 0; k--) {
            System.out.println(k);
        }
    }
}
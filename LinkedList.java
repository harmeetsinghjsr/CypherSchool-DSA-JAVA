import java.util.*;
public class LinkedList {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();
        list.add("B");
        list.add("C");
        list.addFirst("A");
        list.addLast("D");
        System.out.println(list);
        list.remove("B");
        list.removeFirst();
        System.out.println(list);
        int size = list.size();
        System.out.println("Size of list "+size);
        list.clear();
        System.out.println(list);
        list.addFirst("A");
    }
}
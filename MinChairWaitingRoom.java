import java.util.Arrays;
import java.util.PriorityQueue;
public class MinChairWaitingRoom
{
    public static int minChair(String s) {
        int n = s.length();
        int[] arrival = new int[n];
        int[] departure = new int[n];
        for (int i = 0; i < n; i++) {
            arrival[i] = s.charAt(i) - '0';
        }
        for (int i = 0; i < n; i++) {
            departure[i] = s.charAt(++i) - '0';
        }
        Arrays.sort(arrival);
        Arrays.sort(departure);
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        int i = 0, j = 0;
        int chairs = 0;
        while (i < n && j < n) {
            if (arrival[i] < departure[j]) {
                if (pq.isEmpty()) {
                    chairs++;
                } else {
                    pq.poll();
                }
                i++;
            } else {
                pq.add(departure[j]);
                j++;
            }
        }
        return chairs;
    }
    public static void main(String[] args) {
        String s = "12345678";
        System.out.println(minChair(s));
    }
}
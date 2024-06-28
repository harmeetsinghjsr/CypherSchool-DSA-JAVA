import java.util.*;
public class MergeInterval {
    public int[][] merge(int[][] intervals)
    {
        if(intervals.length <= 1)
            return intervals;
        Arrays.sort(intervals, (arr1, arr2) -> Integer.compare(arr1[0], arr2[0]));
        List<int[]> result = new ArrayList<>();
        int[] currentInterval = intervals[0];
        result.add(currentInterval);
        for(int[] interval : intervals)
        {
            int currentBegin = currentInterval[0];
            int currentEnd = currentInterval[1];
            int nextBegin = interval[0];
            int nextEnd = interval[1];
            if(currentEnd >= nextBegin)
            {
                currentInterval[1] = Math.max(currentEnd, nextEnd);
            }
            else
            {
                currentInterval = interval;
                result.add(currentInterval);
            }
        }
        return result.toArray(new int[result.size()][]);
    }
    public static void main(String[] args) {
        MergeInterval mi = new MergeInterval();
        int[][] intervals = {{1,3},{2,6},{8,10},{15,18}};
        int[][] result = mi.merge(intervals);
        for(int i = 0; i < result.length; i++)
        {
            System.out.println(result[i][0] + " " + result[i][1]);
        }
    }
}
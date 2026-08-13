package step3_arrays.lec_3_hard;

import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;

public class Merge_Overlapping_Subintervals {
    public List<List<Integer>> mergeOverlap(List<List<Integer>> intervals){
        intervals.sort((a,b) -> Integer.compare(a.get(0), b.get(0)));
        List<List<Integer>> ans = new ArrayList<>();

        for(List<Integer> interval : intervals){
            if(ans.isEmpty() || interval.get(0) > ans.get(ans.size() - 1).get(1)){
                ans.add(new ArrayList<>(interval));
            }else{
                int lastEnd = ans.get(ans.size() - 1).get(1);
                int currentEnd = interval.get(1);

                ans.get(ans.size() -1).set(1, Math.max(lastEnd, currentEnd));
            }
        }
        return ans;
    }

    public static void main(String args[]){
        Merge_Overlapping_Subintervals s = new Merge_Overlapping_Subintervals();
        List<List<Integer>> intervals = new ArrayList<>();

        intervals.add(Arrays.asList(1,5));
        intervals.add(Arrays.asList(3,6));
        intervals.add(Arrays.asList(8,10));
        intervals.add(Arrays.asList(15,18));

        List<List<Integer>> result = s.mergeOverlap(intervals);
        System.out.println(result);
    }
}

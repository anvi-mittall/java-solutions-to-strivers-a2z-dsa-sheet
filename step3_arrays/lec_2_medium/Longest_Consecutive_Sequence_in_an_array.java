package step3_arrays.lec_2_medium;

import java.util.HashSet;

public class Longest_Consecutive_Sequence_in_an_array {
    public int longestConsecutive(int[] nums) {
        HashSet<Integer> set = new HashSet<>();

        for(int num: nums){
            set.add(num);
        }

        int longest = 0;
        for(int num: set){
            if(!set.contains(num - 1)){
                int current = num;
                int count = 1;

                while(set.contains(current + 1)){
                    current++;
                    count++;
                }
                longest = Math.max(longest, count);
            }
        }
        return longest;
    }

    public static void main(String args[]){
        Longest_Consecutive_Sequence_in_an_array s = new Longest_Consecutive_Sequence_in_an_array();
        int[] nums = {100, 4, 200, 1, 3, 2};
        System.out.println(s.longestConsecutive(nums));
    }
}

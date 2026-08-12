package step3_arrays.lec_3_hard;

import java.util.HashMap;

public class Largest_Subarray_with_sum_zero {
    public int maxLen(int[] nums){
        HashMap<Integer, Integer> map = new HashMap<>();
        int n = nums.length;
        int sum = 0;
        int maxlen = 0;

        for(int i=0; i<n; i++){
            sum += nums[i];

            if(sum == 0){
                maxlen = i+1;
            }

            if(map.containsKey(sum)){
                int len = i - map.get(sum);
                maxlen = Math.max(maxlen, len);
            }else{
                map.put(sum, i);
            }
        }
        return maxlen;
    }

    public static void main(String args[]){
        Largest_Subarray_with_sum_zero s = new Largest_Subarray_with_sum_zero();
        int[] nums = {15,-2,2,-8,1,7,10,23};
        System.out.println(s.maxLen(nums));
    }
}

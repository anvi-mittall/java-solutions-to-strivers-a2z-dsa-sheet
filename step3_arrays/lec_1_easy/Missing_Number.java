package step3_arrays.lec_1_easy;

import java.util.Arrays;

public class Missing_Number {
    public int missingNumber(int[] nums){
        int n = nums.length;
        Arrays.sort(nums);

        for(int i=1; i<n; i++){
            if(nums[i] != i){
                return i;
            }
        }
        return n;
    }

    public static void main(String args[]){
        Missing_Number s = new Missing_Number();
        int[] nums = {0,2,3,1,4};
        System.out.println(s.missingNumber(nums));
    }
}

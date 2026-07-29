package step3_arrays.lec_1_easy;

import java.util.Arrays;

public class Left_Rotate_array_by_one {
    public void rotateArrayByOne(int[] nums){
        int n = nums.length;

        int first = nums[0];
        for(int i=0; i<n-1; i++){
            nums[i] = nums[i+1];
        }
        nums[n-1] = first;
    }

    public static void main(String args[]){
        Left_Rotate_array_by_one s = new Left_Rotate_array_by_one();
        int[] nums = {1,2,3,4,5};
        s.rotateArrayByOne(nums);
        System.out.println(Arrays.toString(nums));
    }
}

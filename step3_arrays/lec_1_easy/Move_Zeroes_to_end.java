package step3_arrays.lec_1_easy;

import java.util.Arrays;

public class Move_Zeroes_to_end {
    public void moveZeroes(int[] nums){
        int n = nums.length;
        int j = 0;

        for(int i=0; i<n; i++){
            if(nums[i] != 0){
                int temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;
                j++;
            }
        }
    }

    public static void main(String args[]){
        Move_Zeroes_to_end s = new Move_Zeroes_to_end();
        int[] nums = {0,1,4,0,5,2};
        s.moveZeroes(nums);
        System.out.println(Arrays.toString(nums));
    }
}

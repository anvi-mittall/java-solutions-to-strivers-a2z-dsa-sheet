package step3_arrays.lec_2_medium;

import java.util.Arrays;

public class Sort_an_array_of_0s_1s_and_2s {
    public void sortZeroOneTwo(int[] nums){
        int n = nums.length;

        for(int i=0; i<n; i++){
            for(int j=i+1; j<n; j++){
                if(nums[i] >= nums[j]){
                    int temp = nums[i];
                    nums[i] = nums[j];
                    nums[j] = temp;
                }
            }
        }
    }

    public static void main(String args[]){
        Sort_an_array_of_0s_1s_and_2s s = new Sort_an_array_of_0s_1s_and_2s();
        int[] nums = {1,0,2,1,0};
        s.sortZeroOneTwo(nums);
        System.out.println(Arrays.toString(nums));
    }
}

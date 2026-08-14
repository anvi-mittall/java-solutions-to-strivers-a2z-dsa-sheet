package step3_arrays.lec_3_hard;

import java.util.Arrays;

public class repeating_and_missing_number {
    public int[] findMissingRepeatingNumbers(int[] nums){
        Arrays.sort(nums);
        int n = nums.length;
        int[] arr = new int[2];

        for(int i=0; i<n-1; i++){
            if(nums[i] == nums[i+1]){
                arr[0] = nums[i];
                break;
            }
        }

        for(int i=0; i<n; i++){
            if(nums[i] != i+1){
                arr[1] = i+1;
            }
        }

        if(arr[1] == 0){
            arr[1] = n;
        }
        return arr;
    }

    public static void main(String args[]){
        repeating_and_missing_number s = new repeating_and_missing_number();
        int[] nums = {3,5,4,1,1};
        System.out.println(s.findMissingRepeatingNumbers(nums));
    }
}

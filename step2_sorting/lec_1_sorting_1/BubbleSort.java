package step2_sorting.lec_1_sorting_1;

import java.util.Arrays;

public class BubbleSort {
    public int[] bubbleSort(int[] nums){
        int n = nums.length;
        for(int i=0; i<=n-1; i++){
            for(int j=0; j<n-1-i; j++){
                if(nums[j] > nums[j+1]){
                    int temp = nums[j];
                    nums[j] = nums[j+1];
                    nums[j+1] = temp;
                }
            }
        }
        return nums;
    }

    public static void main(String args[]){
        BubbleSort s = new BubbleSort();
        int[] nums = {7,4,1,5,3};
        System.out.println(Arrays.toString(s.bubbleSort(nums)));
    }
}

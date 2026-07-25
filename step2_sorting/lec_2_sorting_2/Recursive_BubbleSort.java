package step2_sorting.lec_2_sorting_2;

import java.util.Arrays;

public class Recursive_BubbleSort {
    public int[] bubbleSort(int[] nums){
        bubbleSort(nums, nums.length);
        return nums;
    }

    private void bubbleSort(int[] nums, int n){
        if(n == 1){
            return;
        }

        for(int i=0; i<n-1; i++){
            if(nums[i] > nums[i+1]){
                int temp = nums[i];
                nums[i] = nums[i+1];
                nums[i+1] = temp;
            }
        }
        bubbleSort(nums, n-1);
    }

    public static void main(String args[]){
        Recursive_BubbleSort b = new Recursive_BubbleSort();
        int[] nums = {7,4,1,5,3};
        System.out.println(Arrays.toString(b.bubbleSort(nums)));
    }
}

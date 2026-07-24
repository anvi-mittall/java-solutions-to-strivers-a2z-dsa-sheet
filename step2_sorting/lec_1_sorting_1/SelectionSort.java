package step2_sorting.lec_1_sorting_1;

import java.util.Arrays;

public class SelectionSort {
    public int[] selectionSort(int[] nums){
        int n = nums.length;
        for(int i=0; i<=n-1; i++){
            int minIndex = i;

            for(int j=i+1; j<n; j++){
                if(nums[minIndex] > nums[j]){
                    minIndex = j;
                }
            }

            int temp = nums[i];
            nums[i] = nums[minIndex];
            nums[minIndex] = temp;
        }
        return nums;
    }

    public static void main(String args[]){
        SelectionSort s = new SelectionSort();
        int[] nums = {7,4,1,5,3};
        System.out.println(Arrays.toString(s.selectionSort(nums)));
    }
}

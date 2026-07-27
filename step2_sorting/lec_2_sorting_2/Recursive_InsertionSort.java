package step2_sorting.lec_2_sorting_2;

import java.util.Arrays;

public class Recursive_InsertionSort {
    public int[] insertionSort(int[] nums) {
        sort(nums, 1);
        return nums;
    }

    void sort(int[] nums, int i){
        if(i == nums.length){
            return;
        }
        
        int key = nums[i];

        insert(nums, i-1, key);
        sort(nums, i+1);
    }

    void insert(int[] nums, int j, int key){
        if(j < 0 || nums[j] <= key){
            nums[j+1] = key;
            return;
        }

        nums[j+1] = nums[j];
        insert(nums, j-1, key);
    }

    public static void main(String args[]){
        Recursive_InsertionSort s = new Recursive_InsertionSort();
        int[] nums = {7,4,1,5,3};
        System.out.println(Arrays.toString(s.insertionSort(nums)));
    }
}

package step2_sorting.lec_2_sorting_2;

import java.util.Arrays;

public class QuickSort {
    public int[] quickSort(int[] nums){
        quickSort(nums, 0, nums.length-1);
        return nums;
    }

    void quickSort(int[] nums, int low, int high){
        if(low>=high){
            return;
        }
        int p = partition(nums, low, high);
        quickSort(nums, low, p-1);
        quickSort(nums, p+1 , high);
    }

    private int partition(int[] nums, int low, int high){
        int pivot = nums[low];
        int i = low + 1;
        int j = high;

        while(i<j){
            while(i <= high && nums[i] <= pivot){
                i++;
            }

            while(j >= low && nums[j] > pivot){
                j--;
            }

            if(i<j){
                int temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;
            }
        }
        int temp = nums[low];
        nums[low] = nums[j];
        nums[j] = temp;

        return j;
    }

    public static void main(String args[]){
        QuickSort q = new QuickSort();
        int[] nums = {7,4,1,5,3};
        System.out.println(Arrays.toString(q.quickSort(nums)));
    }
}

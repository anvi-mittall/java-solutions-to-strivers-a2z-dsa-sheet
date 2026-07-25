package step2_sorting.lec_2_sorting_2;

import java.util.Arrays;

public class MergeSort {
    public int[] mergeSort(int[] nums){
        mergeSort(nums, 0, nums.length-1);
        return nums;
    }

    public void merge(int[] nums, int low, int mid, int high){
        int[] B = new int[nums.length];
        int i = low;
        int j = mid + 1;
        int k = low;

        while(i<=mid && j<=high){
            if(nums[i] < nums[j]){
                B[k] = nums[i];
                i++;
                k++;
            }
            else{
                B[k] = nums[j];
                j++;
                k++;
            }
        }

        while(i<=mid){
            B[k] = nums[i];
            k++;
            i++;
        }

        while(j<=high){
            B[k] = nums[j];
            k++;
            j++;
        }

        for(i=low; i<=high; i++){
            nums[i] = B[i];
        }
    }

    public void mergeSort(int[] nums, int low, int high){
        int mid;
        if(low<high){
            mid = (low + high)/2;
            mergeSort(nums, low, mid);
            mergeSort(nums, mid+1, high);
            merge(nums, low, mid, high);
        }
    }

    public static void main(String args[]){
        MergeSort m = new MergeSort();
        int[] nums = {7,4,1,5,3};
        System.out.println(Arrays.toString(m.mergeSort(nums)));
    }
}

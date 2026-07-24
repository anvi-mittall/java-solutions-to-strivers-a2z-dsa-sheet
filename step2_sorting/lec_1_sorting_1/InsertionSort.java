package step2_sorting.lec_1_sorting_1;

public class InsertionSort {
    public int[] insertionSort(int[] nums){
        int n = nums.length;
        int key,j;

        for(int i=0; i<=n-1; i++){
            key = nums[i];
            j = i-1;

            while(j>=0 && nums[j] > key){
                nums[j+1] = nums[j];
                j--;
            }

            nums[j+1] = key;
        }
        return nums;
    }

    public static void main(String args[]){
        InsertionSort s = new InsertionSort();
        int[] nums = {7,4,1,5,3};
        System.out.println(s.insertionSort(nums));
    }
}

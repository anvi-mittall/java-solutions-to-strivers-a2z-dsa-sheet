package step3_arrays.lec_1_easy;

public class Remove_Duplicates_from_SortedArray {
    public int removeDuplicates(int[] nums){
        int n = nums.length;
        if(n == 0){
            return 0;
        }

        int i = 0;
        for(int j=1; j<n; j++){
            if(nums[j] != nums[i]){
                i++;
                nums[i] = nums[j];
            }
        }
        return i+1;
    }

    public static void main(String args[]){
        Remove_Duplicates_from_SortedArray s = new Remove_Duplicates_from_SortedArray();
        int[] nums = {0,0,3,3,5,6};
        System.out.println(s.removeDuplicates(nums));
    }
}

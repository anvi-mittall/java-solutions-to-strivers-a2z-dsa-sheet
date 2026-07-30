package step3_arrays.lec_1_easy;

public class LinearSearch {
    public int linearSearch(int nums[], int target) {
		int n = nums.length;
        for(int i=0; i<n; i++){
            if(nums[i] == target){
                return i;
            }
        }
        return -1;
    }

    public static void main(String args[]){
        LinearSearch s = new LinearSearch();
        int[] nums = {2,3,4,5,3};
        int target = 3;
        System.out.println(s.linearSearch(nums,target));
    }
}

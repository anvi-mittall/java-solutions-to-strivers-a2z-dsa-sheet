package step3_arrays.lec_1_easy;

public class Longest_Subarray_with_sum_k {
    public int longestSubarray(int[] nums, int k){
        int n = nums.length;
        int maxLen = 0;

        for(int i=0; i<n; i++){
            int sum = 0;

            for(int j=i; j<n; j++){
                sum += nums[j];

                if(sum == k){
                    maxLen = Math.max(maxLen, j-i+1);
                }
            }
        }
        return maxLen;
    }

    public static void main(String args[]){
        Longest_Subarray_with_sum_k s = new Longest_Subarray_with_sum_k();
        int[] nums = {10,5,2,7,1,9};
        int k = 15;
        System.out.println(s.longestSubarray(nums, k));
    }
}

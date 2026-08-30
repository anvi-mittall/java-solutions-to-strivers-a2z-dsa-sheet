package step4_binary_Search.BS_on_Answers;

import java.util.Arrays;

public class aggressive_cows{
    public int aggressiveCows(int[] nums, int k){
        int n = nums.length;
        Arrays.sort(nums);
        int low = 1;
        int high = nums[n-1] - nums[0];
        int ans = 0;

        while(low <= high){
            int mid = low + (high - low)/2;

            int count = 1;
            int lastPos = nums[0];
            for(int i = 1; i < n; i++){
                if(nums[i] - lastPos >= mid){
                    count++;
                    lastPos = nums[i];
                }
            }
            if(count >= k){
                ans = mid;
                low = mid + 1;
            }
            else{
                high = mid - 1;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        aggressive_cows obj = new aggressive_cows();
        int[] nums = {1, 2, 8, 4, 9};
        int k = 3;
        int result = obj.aggressiveCows(nums, k);
        System.out.println(result);
    }
}
package step3_arrays.lec_2_medium;

public class Count_subarrays_with_given_sum {
    public int subarraySum(int[] nums, int k) {
        int n = nums.length;
        int count = 0;

        for(int i=0; i<n; i++){
            int sum = 0;

            for(int j=i; j<n; j++){
                sum += nums[j];

                if(sum == k){
                    count++;
                }
            }
        }
        return count;
    }

    public static void main(String args[]){
        Count_subarrays_with_given_sum s = new Count_subarrays_with_given_sum();
        int[] nums = {1,1,1};
        int k = 2;
        System.out.println(s.subarraySum(nums, k));
    }
}

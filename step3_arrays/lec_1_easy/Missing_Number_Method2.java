package step3_arrays.lec_1_easy;

public class Missing_Number_Method2 {
    public int missingNumber(int[] nums){
        int n = nums.length;
        int expected_sum = n * (n+1)/2;
        int actual_sum = 0;

        for(int num : nums){
            actual_sum += num;
        }

        return expected_sum - actual_sum;
    }

    public static void main(String args[]){
        Missing_Number_Method2 s = new Missing_Number_Method2();
        int[] nums = {0,2,3,1,4};
        System.out.println(s.missingNumber(nums));
    }
}

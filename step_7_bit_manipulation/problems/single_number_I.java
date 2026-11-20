package step_7_bit_manipulation.problems;

public class single_number_I {
    public int singleNumber(int[] nums) {
        int ans = 0;

        for(int i=0; i<nums.length; i++){
            ans = ans ^ nums[i];
        }
        return ans;
    }

    public static void main(String[] args) {
        single_number_I obj = new single_number_I();
        int[] nums = {4, 1, 2, 1, 2};
        int result = obj.singleNumber(nums);
        System.out.println("The single number is: " + result);
    }
}

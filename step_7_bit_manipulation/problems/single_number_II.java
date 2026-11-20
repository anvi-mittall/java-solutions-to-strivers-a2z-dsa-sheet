package step_7_bit_manipulation.problems;

public class single_number_II {
    public int singleNumber(int[] nums) {
        int ans = 0;

        for(int i=0; i<32; i++){// Iterate through each bit position (0 to 31)
            int count = 0;

            for(int j=0; j<nums.length; j++){
                if((nums[j] & (1<<i)) != 0){ // Check if the ith bit is set in nums[j]
                    count++;
                }
            }

            if(count % 3 != 0){
                ans = ans | (1<<i); // Set the ith bit in the answer if count is not a multiple of 3
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        single_number_II obj = new single_number_II();
        int[] nums = {2, 2, 3, 2};
        int result = obj.singleNumber(nums);
        System.out.println("The single number is: " + result);
    }
}

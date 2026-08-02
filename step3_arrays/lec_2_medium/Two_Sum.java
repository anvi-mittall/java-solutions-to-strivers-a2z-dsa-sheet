package step3_arrays.lec_2_medium;

public class Two_Sum {
    public int[] twoSum(int[] nums, int target){
        int n = nums.length;

        for(int i=0; i<n; i++){
            for(int j=i+1; j<n; j++){
                if(nums[i] + nums[j] == target){
                    return new int[] {i,j};
                }
            }
        }
        return nums;
    }

    public static void main(String args[]){
        Two_Sum s = new Two_Sum();
        int[] nums = {1,6,2,10,3};
        int target = 7;
        System.out.println(s.twoSum(nums, target));
    }
}

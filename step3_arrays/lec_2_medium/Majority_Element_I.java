package step3_arrays.lec_2_medium;

public class Majority_Element_I {
    public int majorityElement(int[] nums){
        int n = nums.length;

        for(int i=0; i<n; i++){
            int count = 0;
            for(int j=0; j<n; j++){
                if(nums[i] == nums[j]){
                    count++;
                }
            }
            if(count > n/2){
                return nums[i];
            }
        }
        return -1;
    }

    public static void main(String args[]){
        Majority_Element_I s = new Majority_Element_I();
        int[] nums = {7,0,0,1,7,7,2,7,7};
        System.out.println(s.majorityElement(nums));
    }
}

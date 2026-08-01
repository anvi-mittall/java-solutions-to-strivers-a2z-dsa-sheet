package step3_arrays.lec_1_easy;

public class Single_Number_1 {
    public int singleNumber(int[] nums){
        int n = nums.length;

        for(int i=0; i<n; i++){
            int count = 0;

            for(int j=0; j<n; j++){
                if(nums[i] == nums[j]){
                    count++;
                }
            }
            if(count == 1){
                return nums[i];
            }
        }
        return -1;
    }

    public static void main(String args[]){
        Single_Number_1 s = new Single_Number_1();
        int[] nums = {1,2,2,4,3,1,4};
        System.out.println(s.singleNumber(nums));
    }
}

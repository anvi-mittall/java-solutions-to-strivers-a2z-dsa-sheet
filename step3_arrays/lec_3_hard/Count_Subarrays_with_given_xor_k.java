package step3_arrays.lec_3_hard;

public class Count_Subarrays_with_given_xor_k {
    public int subarraysWithXorK(int[] nums, int k){
        int n = nums.length;
        int count = 0;

        for(int i=0; i<n; i++){
            int xor = 0;
            for(int j=i; j<n; j++){
                xor ^= nums[i];

                if(xor == k){
                    count++;
                }
            }
        }
        return count;
    }

    public static void main(String args[]){
        Count_Subarrays_with_given_xor_k s = new Count_Subarrays_with_given_xor_k();
        int[] nums = {4,2,2,6,4};
        int k = 6;
        System.out.println(s.subarraysWithXorK(nums, k));
    }
}

package step3_arrays.lec_1_easy;


import java.util.Arrays;

public class Left_Rotate_Array_By_kPlaces {
    public void rotateArray(int[] nums, int k){
        int n = nums.length;

        k = k % n;

        while(k > 0){
            int first = nums[0];
            for(int i=0; i<n-1; i++){
                nums[i] = nums[i+1];
            }
            nums[n-1] = first;
            k--;
        }
    }

    public static void main(String args[]){
        Left_Rotate_Array_By_kPlaces s = new Left_Rotate_Array_By_kPlaces();
        int[] nums = {1,2,3,4,5,6};
        int k =2;
        s.rotateArray(nums, k);
        System.out.println(Arrays.toString(nums));
    }
}

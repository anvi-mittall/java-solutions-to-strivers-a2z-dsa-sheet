package step3_arrays.lec_1_easy;

public class Largest_Element {
    public int largestElement(int[] nums){
        int largest = nums[0];
        int n = nums.length;

        for(int i=0; i<n; i++){
            if(nums[i] > largest){
                largest = nums[i];
            }
        }
        return largest;
    }

    public static void main(String args[]){
        Largest_Element s = new Largest_Element();
        int[] nums = {3,3,6,1};
        System.out.println(s.largestElement(nums));
    }
}
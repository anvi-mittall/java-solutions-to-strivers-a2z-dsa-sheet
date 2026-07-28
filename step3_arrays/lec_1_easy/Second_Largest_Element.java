package step3_arrays.lec_1_easy;

public class Second_Largest_Element {
    public int secondLargestElement(int[] nums){
        int n = nums.length;
        if(n<2){
            return -1;
        }

        int largest = nums[0];
        int secondLargest = Integer.MIN_VALUE;

        for(int i=0; i<n; i++){
            if(nums[i] > largest){
                secondLargest = largest;
                largest = nums[i];
            }

            else if(nums[i] < largest && nums[i] > secondLargest){
                secondLargest = nums[i];
            }
        }

        if(secondLargest == Integer.MIN_VALUE){
            return -1;
        }

        return secondLargest;
    }

    public static void main(String args[]){
        Second_Largest_Element s = new Second_Largest_Element();
        int[] nums = {8,8,7,6,5};
        System.out.println(s.secondLargestElement(nums));
    }
}

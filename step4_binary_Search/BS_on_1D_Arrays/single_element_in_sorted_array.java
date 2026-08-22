package step4_binary_Search.BS_on_1D_Arrays;

public class single_element_in_sorted_array {
    public int singleNonDuplicate(int[] nums){
        
    //     int n = nums.length;
    //     for(int i=0; i<n-1; i+=2){
    //     if(nums[i] != nums[i+1]){
    //         return nums[i];
    //     }
    //    }
    //    return nums[n-1];

        int low = 0;
        int high = nums.length - 1;

        while(low < high){
            int mid = low + (high - low) / 2;

            if(mid % 2 == 1){
                mid--;
            }

            if(nums[mid] == nums[mid + 1]){
                low = mid + 2;
            } else {
                high = mid;
            }
        }

        return nums[low];
    }

    public static void main(String[] args) {
        single_element_in_sorted_array obj = new single_element_in_sorted_array();
        int[] nums = {1, 1, 2, 3, 3, 4, 4, 8, 8};
        int result = obj.singleNonDuplicate(nums);
        System.out.println(result);
    }
}

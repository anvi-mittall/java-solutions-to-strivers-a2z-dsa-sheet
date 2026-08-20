package step4_binary_Search.BS_on_1D_Arrays;

public class search_in_rotated_sorted_array_I {
    public int search(int[] nums, int target){
        int low = 0;
        int high = nums.length - 1;
        while(low <= high){
            int mid = low + (high - low)/2;
            if(nums[mid] == target){
                return mid;
            }

            if(nums[low] <= nums[mid]){
                if(nums[low] <= target && target < nums[mid]){
                    high = mid - 1;
                }else{
                    low = mid + 1;
                }
            }

            else{
                if(nums[mid] < target && target <= nums[high]){
                    low = mid + 1;
                }else{
                    high = mid - 1;
                }
            }
        }
        return -1;
    }

    public static void main(String args[]){
        search_in_rotated_sorted_array_I s = new search_in_rotated_sorted_array_I();
        int[] nums = {4,5,6,7,0,1,2};
        int target = 0;
        System.out.println(s.search(nums, target));
    }
}

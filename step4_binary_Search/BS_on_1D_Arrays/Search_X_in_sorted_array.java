package step4_binary_Search.BS_on_1D_Arrays;

public class Search_X_in_sorted_array {
    public int search(int[] nums, int target){
        int low = 0;
        int high = nums.length - 1;

        while(low <= high){
            int mid = low + (high - low)/2;
            if(nums[mid] == target){
                return mid;
            }else if(nums[mid] < target){
                low = mid + 1;
            }else{
                high = mid - 1;
            }
        }
        return -1;
    }

    public static void main(String args[]){
        Search_X_in_sorted_array s = new Search_X_in_sorted_array();
        int[] nums = {-1,0,3,5,9,12};
        int target = 9;
        System.out.println(s.search(nums, target));
    }
}

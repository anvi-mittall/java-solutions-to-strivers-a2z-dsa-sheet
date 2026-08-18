package step4_binary_Search.BS_on_1D_Arrays;

public class search_insert_position {
    // public int searchInsert(int[] nums, int target) {
    //   int n = nums.length;
    //   for(int i=0; i<n; i++){
    //     if(nums[i] == target){
    //         return i;
    //     }else if(nums[i] > target){
    //         return i;
    //     }
    //   }
    //   return n;
    // }

    public int searchInsert(int[] nums, int target){
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
        return low;
    }

    public static void main(String args[]){
        search_insert_position s = new search_insert_position();
        int[] nums = {1,3,5,6};
        int target = 5;
        System.out.println(s.searchInsert(nums, target));
    }
}

package step4_binary_Search.BS_on_1D_Arrays;

public class floor_and_ceil_in_sorted_array {
    public int[] getFloorAndCeil(int[] nums, int x){
        int f = getFloor(nums, x);
        int c = getCeil(nums, x);
        return new int[] {f,c};
    }

    public int getFloor(int[] nums, int x){
        int low = 0;
        int high = nums.length - 1;
        int ans = -1;
        while(low <= high){
            int mid = low + (high - low)/2;
            if(nums[mid] <= x){
                ans = nums[mid];
                low = mid + 1;
            }else{
                high = mid - 1;
            }
        }
        return ans;
    }

    public int getCeil(int[] nums, int x){
        int low = 0;
        int high = nums.length - 1;
        int ans = -1;
        while(low <= high){
            int mid = low + (high - low)/2;
            if(nums[mid] >= x){
                ans = nums[mid];
                high = mid - 1;
            }else{
                low = mid + 1;
            }
        }
        return ans;
    }

    public static void main(String args[]){
        floor_and_ceil_in_sorted_array s = new floor_and_ceil_in_sorted_array();
        int[] nums = {3,4,4,7,8,10};
        int x = 5;
        System.out.println(s.getFloorAndCeil(nums,x));
    }
}

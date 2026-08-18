package step4_binary_Search.BS_on_1D_Arrays;

public class upper_Bound {
    // public int upperBound(int[] nums, int x) {
    //     int n = nums.length;
    //     for(int i=0; i<n; i++){
    //         if(nums[i] > x){
    //             return i;
    //         }
    //     }
    //     return n;
    // }

    public int upperBound(int[] nums, int x) {
        int low = 0;
        int high = nums.length - 1;
        int ans = nums.length;

        while(low <= high){
            int mid = low + (high - low)/2;
            if(nums[mid] > x){
                ans = mid;
                high = mid - 1;
            }else{
                low = mid + 1;
            }
        }
        return ans;
    }

    public static void main(String args[]){
        upper_Bound s = new upper_Bound();
        int[] nums = {1,2,2,3};
        int x = 2;
        System.out.println(s.upperBound(nums, x));
    }
}

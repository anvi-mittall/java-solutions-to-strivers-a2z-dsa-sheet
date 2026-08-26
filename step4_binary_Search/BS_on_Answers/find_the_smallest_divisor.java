package step4_binary_Search.BS_on_Answers;

public class find_the_smallest_divisor {
    public int smallestDivisor(int[] nums, int limit){
        int n = nums.length;
        int maxVal = nums[0];

        for(int i=1; i<n; i++){
            if(nums[i] > maxVal){
                maxVal = nums[i];
            }
        }

        int low = 1;
        int high = maxVal;
        while(low < high){
        int mid = low + (high - low)/2;

        int sum = 0;
        for(int num: nums){
            sum += (num + mid - 1)/mid;
        }

        if(sum <= limit){
            high = mid;
        }else{
            low = mid+1;
        }
       }
       return low;
    }

    public static void main(String[] args) {
        find_the_smallest_divisor obj = new find_the_smallest_divisor();
        int[] nums = {1, 2, 5, 9};
        int limit = 6;
        int result = obj.smallestDivisor(nums, limit);
        System.out.println(result);
    }
}

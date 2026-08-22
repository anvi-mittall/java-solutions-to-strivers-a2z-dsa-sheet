package step4_binary_Search.BS_on_1D_Arrays;

public class peak_element {
    public int findPeakElement(int[] nums) {

        // int n = arr.length;
        // if(n == 1){
        //     return 0;
        // }

        // if(arr[0] > arr[1])[
        //     return 0;
        // ]

        // if(arr[n-1] > arr[n-2]){
        //     return n-1;
        // }

        // for(int i=1; i<n-1; i++){
        //     if(arr[i-1] < arr[i] && arr[i+1] < arr[i]){
        //         return i;
        //     }
        // }
        // return -1;
        
        int low = 0;
        int high = nums.length - 1;

        if(nums.length == 0) {
            return 0;
        }

        while (low < high) {
            int mid = low + (high - low) / 2;

            if (nums[mid] < nums[mid + 1]) {
                low = mid + 1;
            } else {
                high = mid;
            }
        }

        return low;
    }

    public static void main(String[] args) {
        peak_element obj = new peak_element();
        int[] nums = {1, 2, 3, 1};
        int peakIndex = obj.findPeakElement(nums);
        System.out.println(peakIndex);
    }
}

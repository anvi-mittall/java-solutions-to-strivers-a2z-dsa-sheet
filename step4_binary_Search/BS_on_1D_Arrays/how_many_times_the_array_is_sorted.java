package step4_binary_Search.BS_on_1D_Arrays;

import java.util.ArrayList;
import java.util.Arrays;

public class how_many_times_the_array_is_sorted {
    public int findMin(ArrayList<Integer> nums) {
        int low = 0;
        int high = nums.size() - 1;
        int minIndex = 0;
        int minVal = nums.get(0);

        while (low < high) {
            int mid = low + (high - low) / 2;

            if (nums.get(mid) > nums.get(mid + 1)) {
                minIndex = mid + 1;
                minVal = nums.get(mid + 1);
                break;
            } else if(nums.get(low) < nums.get(mid)) {
                low = mid + 1;
            } else {
                high = mid;
            }
        }

        return minIndex;
    }

    public static void main(String[] args) {
        how_many_times_the_array_is_sorted obj = new how_many_times_the_array_is_sorted();
        ArrayList<Integer> nums = new ArrayList<>(Arrays.asList(4, 5, 6, 7, 0, 1, 2));
        int rotations = obj.findMin(nums);
        System.out.println(rotations);
    }
}

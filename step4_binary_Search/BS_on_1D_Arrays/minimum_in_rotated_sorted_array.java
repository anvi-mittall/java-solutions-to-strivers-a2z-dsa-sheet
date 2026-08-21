package step4_binary_Search.BS_on_1D_Arrays;

import java.util.ArrayList;
import java.util.Arrays;

public class minimum_in_rotated_sorted_array {
    public int findMin(ArrayList<Integer> nums) {
        int low = 0;
        int high = nums.size() - 1;

        while (low < high) {
            int mid = low + (high - low) / 2;

            if (nums.get(mid) > nums.get(high)) {
                low = mid + 1;
            } else {
                high = mid;
            }
        }

        return nums.get(low);
    }

    public static void main(String[] args) {
        minimum_in_rotated_sorted_array obj = new minimum_in_rotated_sorted_array();
        ArrayList<Integer> nums = new ArrayList<>(Arrays.asList(4, 5, 6, 7, 0, 1, 2));
        int minValue = obj.findMin(nums);
        System.out.println(minValue);
    }
}

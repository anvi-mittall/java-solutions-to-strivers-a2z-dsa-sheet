package step3_arrays.lec_1_easy;

import java.util.TreeSet;

public class UnionOfTwoSortedArrays {
    public int[] unionArray(int[] nums1, int[] nums2) {
        TreeSet<Integer> set = new TreeSet<>();

        for(int num : nums1){
            set.add(num);
        }

        for(int num : nums2){
            set.add(num);
        }

        int[] ans = new int[set.size()];
        int i = 0;

        for(int num : set){
            ans[i++] = num;
        }

        return ans;
    }

    public static void main(String args[]){
        UnionOfTwoSortedArrays s = new UnionOfTwoSortedArrays();
        int[] nums1 = {1,2,3,4,5};
        int[] nums2 = {1,2,7};
        System.out.println(s.unionArray(nums1, nums2));
    }
}

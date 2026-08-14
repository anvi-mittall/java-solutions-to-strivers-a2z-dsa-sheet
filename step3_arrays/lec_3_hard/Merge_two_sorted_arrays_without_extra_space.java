package step3_arrays.lec_3_hard;

import java.util.Arrays;

public class Merge_two_sorted_arrays_without_extra_space {
    public void merge(int[] nums1, int m, int[] nums2, int n){
        for(int i=0; i<m; i++){
            if(nums1[i] > nums2[0]){
                int temp = nums1[i];
                nums1[i] = nums2[0];
                nums2[0] = temp;

                int first = nums2[0];
                int j = 1;
                while(j<n && nums2[j] < first){
                    nums2[j-1] = nums2[j];
                    j++;
                }
                nums2[j-1] = first;
            }
        }
        for(int i=0; i<n; i++){
            nums1[m+i] = nums2[i];
        }
    }

    public static void main(String args[]){
        Merge_two_sorted_arrays_without_extra_space s = new Merge_two_sorted_arrays_without_extra_space();
        int[] nums1 = {-5,-2,4,5};
        int[] nums2 = {-3,1,8};
        s.merge(nums1, 4, nums2, 3);
        System.out.println(Arrays.toString(nums1));
        System.out.println(Arrays.toString(nums2));
    }
}

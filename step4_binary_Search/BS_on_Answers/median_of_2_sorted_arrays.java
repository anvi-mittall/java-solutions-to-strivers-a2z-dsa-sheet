package step4_binary_Search.BS_on_Answers;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class median_of_2_sorted_arrays {
    public double median(int[] arr1, int[] arr2) {
        int m = arr1.length;
        int n = arr2.length;
        List<Integer> ans = new ArrayList<>();
        for(int i=0; i<m; i++){
            ans.add(arr1[i]);
        }

        for(int i=0; i<n; i++){
            ans.add(arr2[i]);
        }

        Collections.sort(ans);
        int size = ans.size();

        if (size % 2 != 0) {
            return ans.get(size / 2);
        }

        // Even
        else {
            return (ans.get(size / 2 - 1) + ans.get(size / 2)) / 2.0;
        }
    }

    public static void main(String[] args) {
        median_of_2_sorted_arrays obj = new median_of_2_sorted_arrays();
        int[] arr1 = {1, 3};
        int[] arr2 = {2};
        double result = obj.median(arr1, arr2);
        System.out.println(result);
    }
}

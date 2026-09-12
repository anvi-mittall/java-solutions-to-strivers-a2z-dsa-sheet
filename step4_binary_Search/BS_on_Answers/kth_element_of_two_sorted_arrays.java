package step4_binary_Search.BS_on_Answers;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class kth_element_of_two_sorted_arrays {
    public int kthElement(int[] a, int[] b, int k) {
        int m = a.length;
        int n = b.length;
        List<Integer> ans = new ArrayList<>();

        for(int i=0; i<m; i++){
            ans.add(a[i]);
        }

        for(int i=0; i<n; i++){
            ans.add(b[i]);
        }

        int s = ans.size();
        Collections.sort(ans);
        for(int i=0; i<s; i++){
            if(i==k){
                return ans.get(k-1);
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        kth_element_of_two_sorted_arrays obj = new kth_element_of_two_sorted_arrays();
        int[] a = {2, 3, 6, 7, 9};
        int[] b = {1, 4, 8, 10};
        int k = 5;
        int result = obj.kthElement(a, b, k);
        System.out.println(result);
    }
}

package step3_arrays.lec_2_medium;

import java.util.ArrayList;
import java.util.List;

public class MajorityElementII {
    public List<Integer> majorityElementTwo(int[] nums){
        List<Integer> ans  = new ArrayList<>();

        int n = nums.length;
        for(int i=0; i<n; i++){
            if(ans.contains(nums[i])){
                continue;
            }

            int count = 0;
            for(int j=0; j<n; j++){
                if(nums[i] == nums[j]){
                    count++;
                }
            }

            if(count > n/3){
                ans.add(nums[i]);
            }
        }
        return ans;
    }

    public static void main(String args[]){
        MajorityElementII s = new MajorityElementII();
        int[] nums = {1,2,1,1,3,2};
        List<Integer> result = s.majorityElementTwo(nums);
        System.out.println(result);
    }
}

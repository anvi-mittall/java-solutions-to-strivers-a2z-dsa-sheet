package step3_arrays.lec_3_hard;

import java.util.List;
import java.util.Arrays;
import java.util.ArrayList;

public class FourSum {
    public List<List<Integer>> fourSum(int[] nums, int target){
        List<List<Integer>> ans = new ArrayList<>();
        int n = nums.length;
        Arrays.sort(nums);

        for(int i=0; i<n-3; i++){
            if(i>0 && nums[i] == nums[i-1]){
                continue;
            }

            for(int j=i+1; j<n-2; j++){
                if(j>i+1 && nums[j] == nums[j-1]){
                    continue;
                }

                int l = j+1;
                int k = n-1;
                while(l<k){
                    long sum = (long) nums[i] + nums[j] + nums[l] + nums[k];
                    if(sum == target){
                        ans.add(Arrays.asList(nums[i], nums[j], nums[k], nums[l]));

                        while(l<k && nums[l] == nums[l+1]){
                            l++;
                        }

                        while(l<k && nums[k] == nums[k-1]){
                            k--;
                        }

                        l++;
                        k--;
                    }else if(sum < target){
                        l++;
                    }else{
                        k--;
                    }
                }
            }
        }
        return ans;
    }

    public static void main(String args[]){
        FourSum s = new FourSum();
        int[] nums = {1,-2,3,5,7,9};
        int target = 7;
        List<List<Integer>> result = s.fourSum(nums, target);
        System.out.println(result);
    }
}

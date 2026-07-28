package step3_arrays.lec_1_easy;

import java.util.ArrayList;

public class Check_array_is_sorted {
    public boolean isSorted(ArrayList<Integer> nums){
        int n = nums.size();

        for(int i=0; i<n-1; i++){
            if(nums.get(i) > nums.get(i+1)){
                return false;
            }
        }
        return true;
    }

    public static void main(String args[]){
        Check_array_is_sorted s = new Check_array_is_sorted();
        ArrayList<Integer> nums = new ArrayList<>();
        nums.add(1);
        nums.add(2);
        nums.add(3);
        nums.add(4);
        nums.add(5);
        System.out.println(s.isSorted(nums));
    }
}

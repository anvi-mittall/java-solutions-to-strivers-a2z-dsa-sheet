package step1_learn_the_basics.lec_6;

import java.util.HashMap;
import java.util.Map;

public class Highest_Occuring_Element_In_An_Array {
    public int mostFrequentElement(int[] nums){
        if(nums == null || nums.length == 0){
            throw new IllegalArgumentException("Array cannot be empty");
        }

        Map<Integer,Integer> mpp = new HashMap<>();
        for(int i: nums){
            mpp.put(i, mpp.getOrDefault(i,0) + 1);
        }

        Integer highestOccInteger = -1;
        Integer maxFrequency = 0;

        for(Map.Entry<Integer,Integer> entry: mpp.entrySet()){
            if(entry.getValue() >= maxFrequency){
                highestOccInteger = maxFrequency == entry.getValue() ? Math.min(highestOccInteger, entry.getKey()) : entry.getKey();
                maxFrequency = entry.getValue();
            }
        }
        return highestOccInteger;
    }

    public static void main(String args[]){
        Highest_Occuring_Element_In_An_Array max = new Highest_Occuring_Element_In_An_Array();
        int[] nums = {1,2,2,3,3,3};
        System.out.println(max.mostFrequentElement(nums));
    }
}

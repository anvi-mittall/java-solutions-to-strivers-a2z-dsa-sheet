package step1_learn_the_basics.lec_6;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CountingFrequenciesOfArrayElements {
    public List<List<Integer>> countFrequencies(int[] nums){
        HashMap<Integer,Integer> freqMap = new HashMap<>();
        for(int i: nums){
            freqMap.put(i, freqMap.getOrDefault(i,0) + 1);
        }

        List<List<Integer>> output = new ArrayList<>();
        for(Map.Entry<Integer,Integer> entry : freqMap.entrySet()){
            output.add(Arrays.asList(entry.getKey(), entry.getValue()));
        }

        return output;
    }

    public static void main(String args[]){
        CountingFrequenciesOfArrayElements freq = new CountingFrequenciesOfArrayElements();
        int[] nums = {1,2,2,1,3};
        List<List<Integer>> frequencies = freq.countFrequencies(nums);
        System.out.println(frequencies);
    }
}

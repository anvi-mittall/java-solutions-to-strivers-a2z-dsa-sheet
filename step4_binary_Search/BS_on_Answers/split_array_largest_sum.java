package step4_binary_Search.BS_on_Answers;

public class split_array_largest_sum {
    public int largestSuarraySumMinimized(int[] a, int k){
        if(k > a.length){
            return -1;
        }

        int low = 0;
        int high = 0;
        for(int num: a){
            low = Math.max(low, num);
            high += num;
        }

        int ans = high;
        while(low <= high){
            int mid = low + (high - low)/2;

            int count = 1;
            int sum = 0;
            for(int num: a){
                if(sum + num <= mid){
                    sum += num;
                }
                else{
                    count++;
                    sum = num;
                }
            }

            if(count <= k){
                ans = mid;
                high = mid - 1;
            }
            else{
                low = mid + 1;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        split_array_largest_sum obj = new split_array_largest_sum();
        int[] a = {7, 2, 5, 10, 8};
        int k = 2;
        int result = obj.largestSuarraySumMinimized(a, k);
        System.out.println(result);
    }
}
package step4_binary_Search.BS_on_Answers;

public class minimize_max_distance_to_gas_station{
    public double minimizeMaxDistance(int[] arr, int k){
        double low = 0;
        double high = 0;

        for(int i=1; i<arr.length; i++){
            high = Math.max(high, arr[i] - arr[i-1]);
        }

        while(high - low > 1e-6){
            double mid = low + (high - low)/2;

            int required = 0;
            for(int i=1; i<arr.length; i++){
                double gap = arr[i] - arr[i-1];
                int needed = (int)(gap/mid);
                if(gap % mid == 0){
                    needed--;
                }
                required += needed;
            }

            if(required <= k){
                high = mid;
            }else{
                low = mid;
            }
        }
        return high;
    }

    public static void main(String[] args) {
        minimize_max_distance_to_gas_station obj = new minimize_max_distance_to_gas_station();
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int k = 9;
        double result = obj.minimizeMaxDistance(arr, k);
        System.out.println(result);
    }
}
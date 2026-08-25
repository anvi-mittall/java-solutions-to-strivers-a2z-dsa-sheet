package step4_binary_Search.BS_on_Answers;

public class minimum_days_to_make_m_bouquets {
    public int roseGarden(int n, int[] nums, int k, int m){
        if((long) m*k > n){
            return -1;
        }

        int low = Integer.MAX_VALUE;
        int high = Integer.MIN_VALUE;

        for(int x: nums){
            low = Math.min(low, x);
            high = Math.max(high, x);
        }

        while(low <= high){
            int mid = low + (high - low)/2;
            if(canMake(nums, m, k, mid)){
                high = mid - 1;
            }else{
                low = mid + 1;
            }
        }
        return low;
    }

    public boolean canMake(int[] nums, int m, int k, int day){
        int bouquets = 0;
        int consecutive = 0;

        for(int bloomDay: nums){
            if(bloomDay <= day){
                consecutive++;
                if(consecutive == k){
                    bouquets++;
                    consecutive = 0;
                }
            }else{
                consecutive = 0;
            }
        }
        return bouquets >= m;
    }

    public static void main(String[] args) {
        minimum_days_to_make_m_bouquets obj = new minimum_days_to_make_m_bouquets();
        int n = 5;
        int[] nums = {1, 10, 3, 10, 2};
        int k = 1;
        int m = 3;
        int result = obj.roseGarden(n, nums, k, m);
        System.out.println(result);
    }
}

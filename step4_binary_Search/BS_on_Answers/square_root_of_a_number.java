package step4_binary_Search.BS_on_Answers;

public class square_root_of_a_number {
    // public int floorSqrt(int n) {
    //   for(int i=1; i<n; i++){
    //     if((long)i*i == n){
    //         return i;
    //     }else if((long)i*i > n){
    //         return i-1;
    //     }
    //   }
    //   return n;
    // }

    public int floorSqrt(int n) {
        if (n == 0 || n == 1) {
            return n;
        }

        int low = 1;
        int high = n;
        int ans = 0;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            for(int i=1; i<n; i++){
            if((long)mid*mid <= n){
                ans = mid;
                low = mid + 1;
            }else{
                high = mid - 1;
            }
        }
      }
      return ans;
    }

    public static void main(String[] args) {
        square_root_of_a_number obj = new square_root_of_a_number();
        int n = 16;
        int result = obj.floorSqrt(n);
        System.out.println(result);
    }
}
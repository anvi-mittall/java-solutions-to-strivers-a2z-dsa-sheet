package step4_binary_Search.BS_on_Answers;

public class Nth_root_of_a_number {
    // public int NthRoot(int N, int M) {
    //     for(int i=1; i<M; i++){
    //         if(Math.pow(i,N) == M){
    //             return i;
    //         }
    //     }
    //     return -1;
    // }

    public int NthRoot(int N, int M) {
        int low = 1;
        int high = M;
        //int ans = -1;
        
        while(low <= high){
            int mid = low + (high - low)/2;
            long power = 1;
            for(int i=1; i<=N; i++){
                power *= mid;
                if(power > M){
                    break;
                }
            }

            if(power == M){
                return mid;
            }else if(power < M){
                low = mid + 1;
            }else{
                high = mid - 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        Nth_root_of_a_number obj = new Nth_root_of_a_number();
        int N = 3;
        int M = 27;
        int result = obj.NthRoot(N, M);
        System.out.println(result);
    }
}

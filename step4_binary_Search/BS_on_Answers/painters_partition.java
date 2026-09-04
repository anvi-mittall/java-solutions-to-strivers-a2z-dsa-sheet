package step4_binary_Search.BS_on_Answers;

public class painters_partition{
    public int paint(int A, int B, int[] C){
        int n = C.length;
        int[] ans = new int[n];

        for(int i=0; i<n; i++){
            int time = C[i]*B;
            ans[i] = time;
        }

        int maxTime = ans[0];
        for(int i=0; i<n; i++){
            if(ans[i] > maxTime){
                maxTime = ans[i];
            }
        }
        return maxTime % 10000003;
    }

    public static void main(String[] args) {
        painters_partition obj = new painters_partition();
        int A = 2;
        int B = 5;
        int[] C = {1, 10};
        int result = obj.paint(A, B, C);
        System.out.println(result);
    }
}
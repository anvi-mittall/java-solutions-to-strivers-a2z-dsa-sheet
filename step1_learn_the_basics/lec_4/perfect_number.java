package step1_learn_the_basics.lec_4;

public class perfect_number {
    public boolean isPerfect(int n) {
        int sum = 0;
        for(int i=1; i<n; i++){
            if(n%i == 0){
                sum += i;
            }
        }

        if(sum == n){
            return true;
        }
        return false;
    }

    public static void main(String args[]){
        perfect_number p = new perfect_number();
        System.out.print(p.isPerfect(6));
    }
}

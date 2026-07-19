package step1_learn_the_basics.lec_5;

public class sum_first_Nnumbers {
    public int NumbersSum(int n){
        if(n==0){
            return 0;
        }

        return n + NumbersSum(n-1);
    }

    public static void main(String args[]){
        sum_first_Nnumbers s = new sum_first_Nnumbers();
        System.out.println(s.NumbersSum(5));
    }
}

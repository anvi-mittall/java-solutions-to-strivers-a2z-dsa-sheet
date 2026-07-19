package step1_learn_the_basics.lec_5;

public class factorial {
    public int fact(int n){
        if(n==0 || n==1){
            return 1;
        }

        return n * fact(n-1);
    }

    public static void main(String args[]){
        factorial f = new factorial();
        f.fact(4);
    }
}

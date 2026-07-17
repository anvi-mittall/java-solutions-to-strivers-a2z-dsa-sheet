package step1_learn_the_basics.lec_4;

public class PrimeNumber {
    public boolean isPrime(int n){
        if(n<=1) return false;

        for(int i=2; i*i<=n; i++){
            if(n%i==0){
                return false;
            }
        }
        return true;
    }

    public static void main(String args[]){
        PrimeNumber p = new PrimeNumber();
        p.isPrime(5);
    }
}

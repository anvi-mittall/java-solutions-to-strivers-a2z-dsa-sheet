package step1_learn_the_basics.lec_4;

public class CountAllDigitsOfANumber {
    public int countDigit(int n){
        if(n==0) return 1;
        int count = 0;
        while(n>0){
            count++;
            n = n/10;
        }
        return count;
    }

    public static void main(String args[]){
        CountAllDigitsOfANumber num = new CountAllDigitsOfANumber();
        num.countDigit(78);
    }
}

package step1_learn_the_basics.lec_4;

public class ReverseANumber {
    public int reverseNumber(int n){
        int rev = 0;
        while(n>0){
            int lastdigit = n%10;
            rev = rev * 10 + lastdigit;
            n = n/10;
        }
        return rev;
    }

    public static void main(String args[]){
        ReverseANumber rv = new ReverseANumber();
        rv.reverseNumber(67);
    }
}

package step1_learn_the_basics.lec_4;

public class PalindromeNumber {
    public boolean isPalindrome(int n){
        int original = n;
        int rev = 0;
        while(n>0){
            int lastdigit = n%10;
            rev = rev*10 + lastdigit;
            n = n/10;
        }
        if(original == rev){
            return true;
        }
        else{
            return false;
        }
    }

    public static void main(String args[]){
        PalindromeNumber p = new PalindromeNumber();
        p.isPalindrome(121);
    }
}

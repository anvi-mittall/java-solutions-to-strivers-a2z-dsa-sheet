package step1_learn_the_basics.lec_5;

public class String_is_palindrome_or_not {
    public boolean palindromeCheck(String s){
        int left = 0;
        int right = s.length()-1;

        while(left<right){
            if(s.charAt(left) != s.charAt(right)){
                return false;
            }

            left++;
            right--;
        }
        return true;
    }

    public static void main(String args[]){
        String_is_palindrome_or_not str = new String_is_palindrome_or_not();
        str.palindromeCheck("hannah");
    }
}

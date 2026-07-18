package step1_learn_the_basics.lec_5;

public class print1toN_2ndMethod {
    public void printNumbers(int n){
        helper(1,n);
    }

    public void helper(int i, int n){
        if(i>n){
            return;
        }

        System.out.println(i);

        helper(i+1,n);
    }

    public static void main(String args[]){
        print1toN_2ndMethod p = new print1toN_2ndMethod();
        p.printNumbers(5);
    }
}

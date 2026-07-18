package step1_learn_the_basics.lec_5;

public class printNto1_2ndMethod {
    public void printNumbers(int n){
        helper(n);
    }

    public void helper(int i){
        if(i==0){
            return;
        }

        System.out.println(i);
        helper(i-1);
    }

    public static void main(String args[]){
        printNto1_2ndMethod p = new printNto1_2ndMethod();
        p.printNumbers(5);
    }
}

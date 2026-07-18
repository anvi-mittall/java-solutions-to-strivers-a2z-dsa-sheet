package step1_learn_the_basics.lec_5;

public class print1toN {
    public void printNumbers(int n){
        if(n==0){
            return;
        }

        printNumbers(n-1);
        System.out.println(n);
    }

    public static void main(String args[]){
        print1toN p = new print1toN();
        p.printNumbers(5);
    }
}
package step1_learn_the_basics.lec_5;

public class printNto1 {
    public void printNumbers(int n){
        if(n==0){
            return;
        }

        System.out.println(n);

        printNumbers(n-1);
    }

    public static void main(String args[]){
        printNto1 p = new printNto1();
        p.printNumbers(5);
    }
}

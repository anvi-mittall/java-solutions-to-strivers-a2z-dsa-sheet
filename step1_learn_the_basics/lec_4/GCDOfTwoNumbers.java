package step1_learn_the_basics.lec_4;

public class GCDOfTwoNumbers {
    public int GCD(int n1, int n2){
        int gcd = 1;
        for(int i=1; i<=Math.min(n1, n2); i++){
            if(n1%i==0 && n2%i==0){
                gcd = i;
            }
        }
        return gcd;
    }

    public static void main(String args[]){
    GCDOfTwoNumbers gd = new GCDOfTwoNumbers();
    gd.GCD(4, 6);
    }
}

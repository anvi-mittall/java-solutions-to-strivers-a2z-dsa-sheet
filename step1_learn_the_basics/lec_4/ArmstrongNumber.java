package step1_learn_the_basics.lec_4;

public class ArmstrongNumber {
    public boolean isArmstrong(int n){
        int count = 0;
        int num = n;
        while(num>0){
            count++;
            num = num/10;
        }

        num = n;
        int sum = 0;
        while(num>0){
            int lastdigit = num%10;
            sum += (int) Math.pow(lastdigit, count);
            num = num/10;
        }

        if(sum == n) return true;
        else return false;
    }

    public static void main(String args[]){
        ArmstrongNumber arm = new ArmstrongNumber();
        arm.isArmstrong(153);
    }
}

package step1_learn_the_basics.lec_4;

public class PrintAllDivisors {
    public int[] divisors(int n){
        int count = 0;
        for(int i=1; i<=n; i++){
            if(n%i==0){
                count++;
            }
        }

        int[] arr = new int[count];
        int index = 0;
        for(int i=1; i<=n; i++){
            if(n%i==0){
                arr[index++] = i;
            }
        }
        return arr;
    }

    public static void main(String args[]){
        PrintAllDivisors p = new PrintAllDivisors();
        System.out.print(p.divisors(6));
    }
}

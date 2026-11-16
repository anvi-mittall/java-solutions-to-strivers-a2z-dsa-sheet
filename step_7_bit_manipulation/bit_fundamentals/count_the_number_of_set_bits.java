package step_7_bit_manipulation.bit_fundamentals;

public class count_the_number_of_set_bits {
    public int countSetBits(int n) {
        int count = 0;

        while(n>0){
            if((n & 1) == 1){
                count++;
            }
            n = n>>1;
        }
        return count;
    }

    public static void main(String[] args) {
        count_the_number_of_set_bits obj = new count_the_number_of_set_bits();
        int n = 29;
        int result = obj.countSetBits(n);
        System.out.println("Number of set bits in " + n + " is: " + result);
    }
}

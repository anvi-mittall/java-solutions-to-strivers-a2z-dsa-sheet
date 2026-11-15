package step_7_bit_manipulation.bit_fundamentals;

public class number_is_power_of_two_or_not {
    public boolean isPowerOfTwo(int n) {
        if(n>0 && (n&(n-1)) == 0){
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        number_is_power_of_two_or_not obj = new number_is_power_of_two_or_not();
        int n = 16;
        boolean result = obj.isPowerOfTwo(n);
        System.out.println(n + " is power of two: " + result);
    }
}

package step_5_strings.Easy;

public class largest_odd_number_in_a_string{
    public String largestOddNumber(String num) {
        int n = num.length();

        for(int i= n-1; i >= 0; i--){
            int digit = num.charAt(i) - '0';
            if(digit % 2 != 0){
                return num.substring(0, i+1);
            }
        }
        return "";
    }

    public static void main(String[] args) {
        largest_odd_number_in_a_string obj = new largest_odd_number_in_a_string();
        String num = "35427";
        System.out.println(obj.largestOddNumber(num));
    }
}
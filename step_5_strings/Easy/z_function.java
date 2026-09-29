package step_5_strings.Easy;

public class z_function {
    public int strStr(String haystack, String needle) {
        if(haystack.contains(needle)){
            return haystack.indexOf(needle);
        }else{
            return -1;
        }
    }

    public static void main(String[] args) {
        z_function obj = new z_function();
        String haystack = "hello";
        String needle = "ll";
        System.out.println(obj.strStr(haystack, needle));
    }
}

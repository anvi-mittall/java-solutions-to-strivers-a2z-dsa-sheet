package step_5_strings.Medium;

public class reverse_words_in_a_given_string {
    public String reverseWords(String s) {
        String[] words = s.trim().split("\\s+");

        StringBuilder ans = new StringBuilder();
        for(int i= words.length-1; i>=0; i--){
            ans.append(words[i]);

            if(i != 0) {
            ans.append(" ");
        }
        }
        return ans.toString();
    }

    public static void main(String[] args) {
        reverse_words_in_a_given_string obj = new reverse_words_in_a_given_string();
        String s = "  hello world  ";
        System.out.println(obj.reverseWords(s));
    }
}

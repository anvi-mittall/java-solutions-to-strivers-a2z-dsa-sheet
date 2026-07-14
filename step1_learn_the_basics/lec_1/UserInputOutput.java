package step1_learn_the_basics.lec_1;

import java.util.Scanner;

public class UserInputOutput {
    //Complete the function printNumber which takes an integer input from the user and prints it on the screen.
    public void printNumber(Scanner sc) {
        int x = sc.nextInt();
        System.out.print(x);
    }

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        UserInputOutput s = new UserInputOutput();
        s.printNumber(sc);
    }
}

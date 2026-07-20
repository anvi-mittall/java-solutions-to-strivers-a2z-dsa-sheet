package step1_learn_the_basics.lec_5;

public class ReverseArray{
    public void reverse(int[] arr, int n){
        int left = 0;
        int right = n-1;

        while(left<right){
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;

            left++;
            right--;
        }
    }

    public static void main(String args[]){
        ReverseArray a = new ReverseArray();
        int[] arr = {1,2,3,4,5};
        a.reverse(arr,5);
    }
}
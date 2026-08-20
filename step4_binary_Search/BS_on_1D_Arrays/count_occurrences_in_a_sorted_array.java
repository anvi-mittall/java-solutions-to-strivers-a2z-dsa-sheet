package step4_binary_Search.BS_on_1D_Arrays;

public class count_occurrences_in_a_sorted_array {
    public int countOccurrences(int[] arr, int target){
        int f = firstOccurrence(arr, target);
        int l = lastOccurrence(arr, target);
        int count = l - f + 1;
        return count;
    }

    public int firstOccurrence(int[] arr, int target){
        int low = 0;
        int high = arr.length - 1;
        int ans = -1;
        while(low <= high){
            int mid = low + (high - low)/2;
            if(arr[mid] == target){
                ans = mid;
                high = mid - 1;
            }else if(arr[mid] < target){
                low = mid + 1;
            }else{
                high = mid - 1;
            }
        }
        return ans;
    }

    public int lastOccurrence(int[] arr, int target){
        int low = 0;
        int high = arr.length - 1;
        int ans = -1;
        while(low <= high){
            int mid = low + (high - low)/2;
            if(arr[mid] == target){
                ans = mid;
                low = mid + 1;
            }else if(arr[mid] > target){
                high = mid - 1;
            }else{
                low = mid + 1;
            }
        }
        return ans;
    }

    public static void main(String args[]){
        count_occurrences_in_a_sorted_array s = new count_occurrences_in_a_sorted_array();
        int[] arr = {0,0,1,1,1,2,3};
        int target = 1;
        System.out.println(s.countOccurrences(arr,target));
    }
}

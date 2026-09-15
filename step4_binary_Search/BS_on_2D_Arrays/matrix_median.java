package step4_binary_Search.BS_on_2D_Arrays;

public class matrix_median {
    public int findMedian(int[][] matrix){
        int rows = matrix.length;
        int cols = matrix[0].length;

        int low = matrix[0][0];
        int high = matrix[0][cols-1];

        // Find minimum and maximum value
        for(int i=0; i<rows; i++){
            low = Math.min(low, matrix[i][0]);
            high = Math.max(high, matrix[i][cols-1]);
        }

        int required = (rows * cols)/2;
        while(low <= high){
            int mid = low + (high - low)/2;

            int count = 0;
            for(int i=0; i<rows; i++){
                count += upperBound(matrix[i], mid);
            }

            if(count <= required){
                low = mid + 1;
            }else{
                high = mid - 1;
            }
        }
        return low;
    }

    // Number of elements <= target
    public int upperBound(int[] arr, int target) {

        int low = 0;
        int high = arr.length;

        while (low < high) {

            int mid = low + (high - low) / 2;

            if (arr[mid] <= target) {
                low = mid + 1;
            } else {
                high = mid;
            }
        }

        return low;
    }
}

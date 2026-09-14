package step4_binary_Search.BS_on_2D_Arrays;

public class search_in_2D_matrix {
    public boolean searchMatrix(int[][] mat, int target){
        int rows = mat.length;
        int cols = mat[0].length;

        int low = 0;
        int high = rows * cols - 1;

        while(low <= high){
            int mid = low + (high - low)/2;

            int row = mid / cols;
            int col = mid % cols;

            if(mat[row][col] == target){
                return true;
            }
            else if(mat[row][col] < target){
                low = mid + 1;
            }
            else{
                high = mid - 1;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        search_in_2D_matrix obj = new search_in_2D_matrix();
        int[][] matrix = {
                {1, 3, 5, 7},
                {10, 11, 16, 20},
                {23, 30, 34, 60}
        };
        int target = 3;
        boolean result = obj.searchMatrix(matrix , target);
        System.out.println(result);
    }
}

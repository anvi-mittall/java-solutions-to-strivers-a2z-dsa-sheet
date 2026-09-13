package step4_binary_Search.BS_on_2D_Arrays;

public class search_in_2D_matrix_II {
    public boolean searchMatrix(int[][] matrix , int target){
        int r = 0;
        int c = matrix[0].length - 1;

        while(r < matrix.length && c >= 0){
            if(matrix[r][c] == target){
                return true;
            }
            if(matrix[r][c] < target){
                r++;
            }
            else{
                c--;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        search_in_2D_matrix_II obj = new search_in_2D_matrix_II();
        int[][] matrix = {
                {1, 4, 7, 11, 15},
                {2, 5, 8, 12, 19},
                {3, 6, 9, 16, 22},
                {10, 13, 14, 17, 24},
                {18, 21, 23, 26, 30}
        };
        int target = 5;
        boolean result = obj.searchMatrix(matrix , target);
        System.out.println(result);
    }
}

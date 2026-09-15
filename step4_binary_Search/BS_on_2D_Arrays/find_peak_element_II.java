package step4_binary_Search.BS_on_2D_Arrays;

public class find_peak_element_II {
    public int[] findPeakGrid(int[][] mat) {
        int rows = mat.length;
        int cols = mat[0].length;

        int low = 0;
        int high = rows - 1;

        while(low <= high){
            int mid = low + (high - low)/2;

            int col = 0;
            for(int j=0; j<cols; j++){
                if(mat[mid][j] > mat[mid][col]){
                    col = j;
                }
            }

            int up = (mid - 1 >= 0) ? mat[mid-1][col] : -1;
            int down = (mid + 1 < rows) ? mat[mid+1][col] : -1;

            if(mat[mid][col] > up && mat[mid][col] > down){
                return new int[]{mid,col};
            }

            if(up > mat[mid][col]){
                high = mid - 1;
            }else{
                low = mid + 1;
            }
        }
        return new int[]{-1,-1};
    }

    public static void main(String[] args) {
        find_peak_element_II obj = new find_peak_element_II();
        int[][] matrix = {
                {1, 4},
                {3, 2}
        };
        int[] result = obj.findPeakGrid(matrix);
        System.out.println("Peak Element found at: [" + result[0] + ", " + result[1] + "]");
    }
}

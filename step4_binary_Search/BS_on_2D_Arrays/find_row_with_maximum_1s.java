package step4_binary_Search.BS_on_2D_Arrays;

public class find_row_with_maximum_1s {
    public int rowWithMax1s(int[][] mat){
        int row = -1;
        int maxOnes = 0;

        for(int i=0; i<mat.length; i++){
            int low = 0;
            int high = mat[0].length - 1;

            while(low <= high){
                int mid = low + (high - low)/2;

                if(mat[i][mid] == 1){
                    high = mid - 1;
                }
                else{
                    low = mid + 1;
                }
            }

            int Ones = mat[0].length - low;
            if(Ones > maxOnes){
                maxOnes = Ones;
                row = i;
            }
        }
        return row;
    }

    public static void main(String[] args) {
        find_row_with_maximum_1s obj = new find_row_with_maximum_1s();
        int[][] mat = {
                {0, 0, 0, 1},
                {0, 1, 1, 1},
                {0, 0, 1, 1},
                {0, 0, 0, 0}
        };
        int result = obj.rowWithMax1s(mat);
        System.out.println(result);
    }
}

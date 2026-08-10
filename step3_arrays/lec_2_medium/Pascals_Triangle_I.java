package step3_arrays.lec_2_medium;

public class Pascals_Triangle_I {
    public int pascalTriangleI(int r, int c){
        if(c==1 || c==r){
            return 1;
        }
        return pascalTriangleI(r-1, c-1) + pascalTriangleI(r-1, c);
    }

    public static void main(String args[]){
        Pascals_Triangle_I s = new Pascals_Triangle_I();
        int r = 4;
        int c = 2;
        System.out.println(s.pascalTriangleI(r, c));
    }
}

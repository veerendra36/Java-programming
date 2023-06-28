package two_d_arrays;

public class DiagonalSum {
    // brute force approach 
    public static void diagonalSum(int matrix[][]) {
        int diaSum=0;
        for(int i=0; i<=matrix.length-1; i++){
            for(int j=0; j<=matrix[0].length-1; j++){
                if(i==j){
                    diaSum+=matrix[i][j];
                }
                else if(i+j==matrix.length-1){
                    diaSum+=matrix[i][j];
                }
            }
           
        } System.out.println(diaSum);

    }

    // optimized solution:
    public static void diagonalSUM(int matrix[][]) {
        int diaSum=0;
        for(int i=0; i<=matrix.length-1; i++){
                diaSum+=matrix[i][i];
                if(i!=matrix.length-i-1){     // i!=j
                    diaSum+=matrix[i][matrix.length-i-1];   // i+j = n-1   ===>  j= (n-1)-i
                }
        }
        System.out.println(diaSum);
    }
    public static void main(String[] args) {
        int matrix[][]={{ 1,  2,  3,  4},
                        {5, 6,  7,  8},
                        {9,10,11, 12},
                        {13, 14, 15,16,}};
        diagonalSum(matrix);
        diagonalSUM(matrix);
    }
}

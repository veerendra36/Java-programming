package two_d_arrays;

//Given a 2D matrix, print all elements of the given matrix in diagonal order. 
//For example, consider the following 5 X 4 input matrix.  
//  Example:
//  1     2     3     4
//  5     6     7     8
//  9    10    11    12
//  13    14    15    16
//  17    18    19    20

// output:
// 1
// 5 2
// 9 6 3
// 13 10 7 4
// 17 14 11 8
// 18 15 12
// 19 16
// 20

public class DSA1_ZigZagDiagonal {
    public static void zigZagDiagonal(int matrix[][]) {
        int no_of_Lines= (matrix.length-1) - (matrix[0].length-1); // declaring the no of line to be in diagonal of the matrix
        // 2 for loops for print the both half of the matrix 
        // one for the first half up to 1 to 4 rows and the second for the 
        for(int k=0; k<=matrix.length-1; k++){
            int i=k;    
            int j=0;
            while(i>=0){
                System.out.print(matrix[i][j]+" ");
                i=i-1;
                j+=1;
            }System.out.println();
        }

        for(int k=1; k<=matrix[0].length-1; k++){
            int j=k;
            int i=matrix[0].length-1;
            while(j<=matrix[0].length-1){
                System.out.print(matrix[i][j]+" ");
                i=i-1;
                j+=1;
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        int matrix[][]={{ 1,  2,  3,  4,  5},
                        { 6,  7,  8,  9, 10},
                        {11, 12, 13, 14, 15},
                        {16, 17, 18, 19, 20},
                        {21, 22, 23, 24, 25}};
        zigZagDiagonal(matrix);
    }
}

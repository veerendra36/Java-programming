package two_d_arrays;

public class spiralMatirx {

    public static void spiralMatrix(int matrix[][]) {
        int start_row=0;
        int start_col=0;
        int end_row=matrix.length-1;
        int end_col=matrix[0].length-1;
        while(start_row<=end_row && start_col<=end_col){
            // for printing top row
            for(int i=start_col; i<=end_col;i++){
                System.out.print(matrix[start_row][i]+" ");
            }
            // for printing right col
            for(int j=start_row+1; j<=end_row;j++){
                System.out.print(matrix[j][end_col]+" ");
            }
            // for printing bottom row 
            for(int k=end_col-1; k>=start_col;k--){
                if(start_col==end_col){      // to print one single time of the one element when the matrix has odd no of boundaries
                    break;
                }
                System.out.print(matrix[end_row][k]+" ");
            }
            // for printing left col
            for(int l=end_row-1; l>=start_row+1;l--){
                if(start_row==end_row){      // to print one single time of the one element when the matrix has odd no of boundaries
                    break;
                }
                System.out.print(matrix[l][start_col]+" ");
            }
            start_row++;
            end_row--;
            start_col++;
            end_col--;
        }
    }
    public static void main(String[] args) {
        int matrix[][]={{ 1,  2,  3,  4,  5},
                        { 6,  7,  8,  9, 10},
                        {11, 12, 13, 14, 15},
                        {16, 17, 18, 19, 20},
                        {21, 22, 23, 24, 25}};
        spiralMatrix(matrix);
    }
}







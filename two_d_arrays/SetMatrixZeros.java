package two_d_arrays;

public class SetMatrixZeros {
    public static void setMatrixZeros(int matrix[][]) {
        int col0=1, rows=matrix.length, cols=matrix[0].length;
        // top to bottom traversal 
        for(int i=0; i<rows; i++){       // for holding the rows in matrix
            if(matrix[i][0]==0){
                col0=0;            // if any of the first col element is 0 then make first element as 0
            }
            for(int j=1; j<cols; j++){   // for holding the cols in matrix
                if(matrix[i][j]==0){
                    matrix[i][0]=matrix[0][j]=0;    // making the dummy arrays as zeros 
                }
            }
        }
        // bottom to top traversal 
        for(int i=rows-1; i>=0; i--){       // for holding the rows in matrix
            for(int j=cols-1; j>=1; j--){   // for holding the cols in matrix
                if(matrix[i][0]==0 || matrix[0][j]==0 ){
                    matrix[i][j]=0;    // making the dummy arrays as zeros 
                }
                if(col0==0){
                    matrix[i][0]=0;             // if any of the first col element is 0 then make first element as 0
                }
            }
        }


    }
    public static void main(String[] args) {
        int matrix[][]={{ 1,  1,  1,  1  },
                        { 1,  0,  1,  1  },
                        { 1,  1,  0,  1  },
                        { 0,  0,  0,  1  }};
        setMatrixZeros(matrix);
        for(int i=0; i<=matrix.length-1; i++){
            for(int j=0; i<=matrix[0].length-1; j++){
                System.out.print(matrix[i][j]);
            }
            System.out.println();
        }
    }
}

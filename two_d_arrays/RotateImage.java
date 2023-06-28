package two_d_arrays;

public class RotateImage {
    public static void rotateImage(int matrix[][]) {
        int left=0, right=matrix.length-1;
        while(left<right){
            for(int i=0; i<=right-left; i++){
                int top=left, bottom= right;
                int temp=matrix[top][left+i];
                matrix[top][left+i]=matrix[bottom-i][left];
                matrix[bottom-i][left]=matrix[bottom][right-i];
                matrix[bottom][right-i]=matrix[top-i][right];
                matrix[top-i][right]=temp;
            }
            right--;
            left++;
        }
    }
    public static void printMatrix(int matrix[][]) {
        for(int i=0; i<=matrix.length-1; i++){
            for(int j=0; i<=matrix[0].length-1; j++){
                System.out.print(matrix[i][j]);
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
        rotateImage(matrix);
        printMatrix(matrix);
    }
}

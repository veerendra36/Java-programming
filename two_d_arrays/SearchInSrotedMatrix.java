package two_d_arrays;

public class SearchInSrotedMatrix {
    public static void searchInSortedMatrixBS(int matrix[][], int element ){
        // (1) using binary search algo:
        // iterate the loop  up via the rows and apply the binary search algo fro every row
        for(int i=0; i<=matrix.length-1; i++){
            // binary search for every row
            int start=0, end = matrix[0].length-1;
            int index=0;
            boolean found=false;
            while(start<=end){
                int mid=start+end/2;
                if(matrix[i][mid]==element){
                    found=true;
                    index=mid;
                    break;
                }
                else if( matrix[i][mid]> element){
                    end=mid-1;
                }
                else{
                    start=mid+1;
                }
            }
            if(found==true){
                System.out.println("( "+i+","+index+" )");
                break;
            }
        }
        
    }
    public static void searchInSortedMatrix(int matrix[][], int element ) {


        // (2) staircase approach:    O(n+m)
        // step-1 decide weather to start at the right top corner or left bottom corner
        // (0, M-1)  so row =0; and col=matrix[0].length-1    
        // n(no of rows) = matrix.length-1; m(no.of cols) = matrix[0].length-1
        int row=0, col=matrix[0].length-1;
        boolean found=false;
        while(row<=matrix.length-1 && col>=0){
            if(matrix[row][col] ==element){
                found=true;
                break;
            }
            else if(element < matrix[row][col]){
                col--;
            }
            else{
                row++;
            }

        }
        if(found==true){
            System.out.println("( "+row+","+col+" )");
        }
        else{
            System.out.println("element not there in the matrix");
        }
    
    }
    public static void main(String[] args) {
        int matrix[][]={{ 1,  2,  3,  4},
                        {5, 6,  7,  8},
                        {9,10,11, 12},
                        {13, 14, 15,16,}};
        int element=14;
        searchInSortedMatrix(matrix, element);
        searchInSortedMatrixBS(matrix, element);
    }
}

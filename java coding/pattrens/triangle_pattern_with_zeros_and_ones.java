import java.util.Scanner;
public class triangle_pattern_with_zeros_and_ones {

    // triangle pattern with 0 and 1
    // 1
    // 0 1
    // 1 0 1
    // 0 1 0 1
    // 1 0 1 0 1

    public static void trianglePattern(int nrows, int ncols){
        for(int i=1; i<=nrows; i++){        // Outer loop for printing the rows one by one
            for (int j=1; j<=i; j++){       // Inner loop for what to print in particular row
                if((i+j)%2==0){
                    System.out.print("1 ");
                }else{
                    System.out.print("0 ");
                }  
            }
            for(int j=1;j<=nrows-i;j++){
                System.out.print(" ");
            }System.out.println();
        }
    }
    // Main method
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);

        System.out.println("how many rows in matrix: ");
        int nrows=sc.nextInt();

        System.out.println("how many cols in matrix: ");
        int ncols=sc.nextInt();

        trianglePattern(nrows,  ncols);     // trianglePattern function call 
    } 
}

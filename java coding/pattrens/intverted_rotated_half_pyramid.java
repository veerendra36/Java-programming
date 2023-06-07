import java.util.Scanner;
public class intverted_rotated_half_pyramid {

    // first approach 
    // method for printing inverted_rotated_half_pyramid
    public static void inverted_rotated_half_pyramid(int nrows, int ncols){
        for(int i=1; i<=nrows; i++){         // outer loop for printing the rows one by one
            for (int j=1; j<=nrows-i; j++){  // inner loop for what to print in particular row
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }System.out.println();
        }
    } 

    // second approach
    public static void inverted_rotated_half_pyramid_2(int nrows, int ncols){
        for(int i=1; i<=nrows; i++){
            for (int j=1; j<=nrows-i; j++){
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }System.out.println();
        }
    } 

    // main method
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("how many rows in matrix: ");
        int nrows=sc.nextInt();
        System.out.println("how many cols in matrix: ");
        int ncols=sc.nextInt();
        inverted_rotated_half_pyramid(nrows,ncols);        //inverted_rotated_half_pyramid function call 
    } 
}

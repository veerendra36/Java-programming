import java.util.Scanner;
public class hallow_rectangle{  

    // method for printing hollowRectangle
    public static void hollowRectangle(int nrows, int ncols){
        for(int i=1;i<=nrows;i++){         // Outer loop for printing the rows one by one
            for(int j=1;j<=ncols;j++){     // Inner loop for what to print in particular row
                if(i==1||i==nrows||j==1||j==ncols){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }  
            }
            System.out.println();
        }
    }

    // main method
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("how many rows in matrix: ");
        int nrows=sc.nextInt();
        System.out.println("how many cols in matrix: ");
        int ncols=sc.nextInt();
        hollowRectangle(nrows,ncols);       // hollowRectangle function call 
    } 
}
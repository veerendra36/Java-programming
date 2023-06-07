import java.util.Scanner;
public class inverted_rotated_pyramid_with_numbers {
        
        // method for printing inverted_rotated_half_pyramid_with_numbers
        public static void inverted_rotated_half_pyramid_with_numbers(int no_of_lines){
            for(int i=1; i<=no_of_lines; i++){              // Outer loop for printing the rows one by one
                for (int j=1; j<=no_of_lines-i+1; j++){     // Inner loop for what to print in particular row
                    System.out.print(j);
                }
                for(int j=1;j<=i-1;j++){
                    System.out.print(" ");
                }System.out.println();
            }
        } 
    
        // main method
        public static void main(String args[]){
            Scanner sc=new Scanner(System.in);
            System.out.println("how many lines do you want in matrix: ");
            int no_of_lines=sc.nextInt();
            inverted_rotated_half_pyramid_with_numbers(no_of_lines);       // inverted_rotated_half_pyramid_with_numbers function call 
        } 
}

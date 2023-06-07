import java.util.Scanner;
public class diamond_pattern {
    // method for hollow_rhombus
    public static void diamond_pattern(int no_of_lines){
        // Outer loop-1 for printing the rows one by one of first half of diamond
        for(int i=1; i<=no_of_lines; i++){
            // Inner loop-1 to print spaces              
            for (int j=1; j<=(no_of_lines-i); j++){      
                System.out.print(" ");
            }
            // Inner loop-2 for printing hollow rhombus
            for(int j=1;j<=2*(i)-1;j++){             
             
                    System.out.print("*");
            }
            System.out.println();  
        }  

        // Outer loop-1 for printing the rows one by one of first half of diamond
        for(int i=no_of_lines; i>=1; i--){
            // Inner loop-1 to print spaces              
            for (int j=1; j<=(no_of_lines-i); j++){      
                System.out.print(" ");
            }
            // Inner loop-2 for printing hollow rhombus
            for(int j=1;j<=2*(i)-1;j++){             
                
                    System.out.print("*");
            }
            System.out.println();  
        }  
    } 

    // main method
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("how many lines do you want in matrix: ");
        int no_of_lines=sc.nextInt();
        diamond_pattern(no_of_lines);       // hollow_rhombus function call 
    } 
}

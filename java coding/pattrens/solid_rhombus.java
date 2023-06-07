import java.util.Scanner;
public class solid_rhombus {
            // method for solid_rhombus
        public static void solid_rhombus(int nlines){

            for(int i=1; i<=nlines; i++){               // Outer loop for printing the rows one by one
                for (int j=1; j<=(nlines-i); j++){      // Inner loop-1 to print spaces
                    System.out.print(" ");
                }
                for (int j=1; j<=(nlines); j++){        // Inner loop-2 to print stars
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
            solid_rhombus(no_of_lines);       // solid_rhombus function call 
        } 
    
}

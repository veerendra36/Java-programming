import java.util.Scanner;
public class floyds_triangle {
        
        // method for printing inverted_rotated_half_pyramid_with_numbers
        public static void floyd_Triangle(int nlines){
            int num=1;
            for(int i=1; i<=nlines; i++){        // Outer loop for printing the rows one by one
                for (int j=1; j<=nlines; j++){   // Inner loop for what to print in particular row
                    if(j<=i){
                        System.out.print(num);
                        num++; 
                    }else{
                        System.out.print("  ");
                    }
                }System.out.println();  
            }
        } 
    
        // main method
        public static void main(String args[]){
            Scanner sc=new Scanner(System.in);
            System.out.println("how many lines do you want in matrix: ");
            int no_of_lines=sc.nextInt();
            floyd_Triangle(no_of_lines);       // floyd_Triangle function call 
        } 
}

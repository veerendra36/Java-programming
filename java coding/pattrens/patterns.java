import java.util.*;
public class patterns {

    // patterns:
    // Main logic : 3 steps
    // step-1: Outer Loop (no.of lines(how many lines))
    // step-2: Inner Loop (how many characters per line)
    // step-3: what to print (* or character)

    // (1) question: 
    // *
    // **
    // ***
    // ****
    public static void starPattern(int no_of_lines){
        for(int i=1;i<=4;i++){              // Outer loop (for selecting the line) 
            for(int j=1;j<=i;j++){          // Inner loop (for printing the * in ith line)
                System.out.print("*");
            }
            System.out.println();
        }
    }

    
    // (2) character patterns
    // A
    // BC
    // DEF
    // GHAT
    public static void characterPatterns(int no_of_lines){
        char ch='A';
        for(int i=1;i<=no_of_lines;i++){              // Outer loop (for selecting the line) 
            for(int j=1;j<=i;j++){          // Inner loop (for printing the char in ith line)
                System.out.print(ch);
                ch++;
            }
            System.out.println();
        }
    }

    // (3) inverted star 
    // ****
    // ***
    // **
    // *
    public static void invertedStarPattern(int no_of_lines){
        for(int i=1;i<=no_of_lines;i++){              // Outer loop (for selecting the line) 
            for(int j=1;j<=no_of_lines-i+1;j++){          // Inner loop (for printing the * in ith line)
                System.out.print("*");
            }
            System.out.println();
        }
    } 

    // (4) Half pyramid:
    // 1
    // 12
    // 123
    // 1234
    public static void halfPyramid(int no_of_lines){
        for(int i=1;i<=no_of_lines;i++){        // outer loop (printing )
            for(int j=1;j<=i;j++){
                System.out.print(j);

            }   System.out.println();    
        }
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("How many line to print: ");
        int no_of_lines=sc.nextInt();

        // star pattern function call
        starPattern(no_of_lines);

        // character pattern function call
        characterPatterns(no_of_lines);

        // inverted star pattern function call
        invertedStarPattern(no_of_lines);

        // halfPyramid pattern function call
        halfPyramid(no_of_lines);
    }
}

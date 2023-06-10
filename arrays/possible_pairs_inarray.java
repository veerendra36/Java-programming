package arrays;
public class possible_pairs_inarray {
        // possible pairs method
        public static void possiblePairs(int arr[]){
            for(int i=0; i<arr.length; i++){           // For holding the first element
                for(int j=i; j<arr.length; j++){     // looping through the sub array of first element
                    for(int k=i; k<=j; k++){            // printing the sub array elements 
                        System.out.print(arr[k]+" ");
                    }
                    System.out.println();
                }
                System.out.println();
            }
        }
        public static void main(String args[]){
            int arr[]={1,2,3,4};
            possiblePairs(arr);
        }
}

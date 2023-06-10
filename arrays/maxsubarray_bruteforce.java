package arrays;

public class maxsubarray_bruteforce {
    
    public static void maxSubArray(int arr[]){
        int maximum_sum=0;
        int current_sum=0;
        for(int i=0; i<arr.length; i++){           // For holding the first element
            for(int j=i; j<arr.length; j++){       // looping through the sub array of first element
                current_sum=0;   
                for(int k=i; k<=j; k++){            // for finding the sum of every sub array
                    current_sum+=arr[k];  
                    System.out.println(current_sum);
                }
                if (maximum_sum<current_sum){      // comparing current sum and maximum sum
                    maximum_sum=current_sum;
                } 
            }            
        }
        System.out.println("the maximum sum of sub array is: "+maximum_sum);
    }
    public static void main(String args[]){
        int arr[]={1,-2,6,-1,3};
        maxSubArray(arr);
    }
    
}

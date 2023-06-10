package arrays;

public class subarray_prefixsum {

// (1)  using prefix sum approach
public static void maxSubArray(int arr[]){
    int maximum_sum=0;
    int current_sum=0;

    // created a prefix array for 
    int prefix_array[]=new int[arr.length];    // created a prefix array for 
    prefix_array[0]=arr[0];

    // for printing the prefix array
    for(int k=1; k<arr.length; k++){            
        prefix_array[k]=prefix_array[k-1]+arr[k];
    }

    // For holding the first element
    for(int i=0; i<arr.length; i++){

        // looping through the sub array of first element
        for(int j=i; j<arr.length; j++){ 
            // prefix sum formula to find the current sum      
            current_sum= i==0 ? prefix_array[j] : prefix_array[j]-prefix_array[i-1];   

            if (maximum_sum<current_sum){
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
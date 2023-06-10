package arrays;

public class maxsubarray_kadanes {
        
    public static void maxSubArrayKadanes(int arr[]){
        int maximum_sum=Integer.MIN_VALUE;
        int current_sum=0;
        for(int i=0; i<arr.length; i++){  
            // finding the current sum         
            current_sum=current_sum+arr[i];

            // checking weather current sum is negative
            if(current_sum<0){
                current_sum=0;
            }

            // updating the maximum value
            maximum_sum=Math.max(maximum_sum, current_sum);
        }
        System.out.println("the maximum sum of sub array is: "+maximum_sum);
    }
    public static void main(String args[]){
        int arr[]={-2,-3,4,-1,-2,1,5,-3};
        maxSubArrayKadanes(arr);
    }
}

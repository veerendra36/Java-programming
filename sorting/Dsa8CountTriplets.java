package sorting;

import java.util.Arrays;

public class Dsa8CountTriplets {
    public static void countTriplets(int arr[], int sum) {
        // brute force approach 
        int count=0;
        // sort the array 
        Arrays.sort(arr);

        // step-1: iterate through the array outer loop for holding the first element in the array 
        for(int i=0; i<arr.length-2;  i++){
            // step-2: inner while loop is for iterating through the remaining elements (j,k)
            int j=i+1;
            int k=arr.length-1;
            while(j<k){
                // step-3: if the current sum is grater than the given sum the decrease the k value 
                if((arr[i]+arr[j]+arr[k])>=sum){
                    k--;
                }
                else{
                    count+=k-j;
                    j++;
                }
            } 
        }
        System.out.println("the triplets count is: "+count);

    }


public static void main(String[] args) {
    int arr[]={5,1,3,4,7};
    int sum=12;
    countTriplets(arr, sum);
    }
}

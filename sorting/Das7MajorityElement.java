package sorting;
// Ques: (Majority Element)
// Find the majority element in the array. 
// A majority element in an array A[] of size n is an element 
// that appears more than n/2 times (and hence there is at most one such element). 

import java.util.Arrays;

// Solution: 
// (1) moore's algorithm   TC= O(n); SC = O(1)
// (2) sorting   TC= O(nlogn); SC = O(1)

public class Das7MajorityElement {
    public static void majorityElement(int arr[]) {
        // first approach moore's voting algo
        // initialize the parameters
        int count=0;
        int temp_element=0;

        // step-1: iterate through the array 
        for(int i=0; i<arr.length; i++){
            // step-2: if count==0 then update the element(changing the element)
            if(count==0){
                temp_element=arr[i];
            }
            
            // step-3: if element is same s the prev then increase the count else decrease the count
            if(temp_element==arr[i]){
                count+=1;
            }
            else{
                count-=1;
            }
        }
        System.out.println("The majority element is: "+temp_element);
    }

    // 2nd approach (sorting)
     public static void majorityElementSorting(int arr[]) {
        // 2nd approach using sorting
        // initialize the parameters
        int count=1;

        // sort the array
        Arrays.sort(arr);

        // step-1: iterate through the array 
        for(int i=0; i<arr.length; i++){
            // step-2: if count > n/2 then that is the majority element
            if(count > arr.length/2){
                System.out.println("The majority element is: "+arr[i]);
            }
            
            // step-3: iterate the looping and update the count util the adjacent element are equal
            if(arr[i]==arr[i+1]){
                count+=1;
            }
            else{
                count=1; // if the adjacent elements are not equal then make the count as 1 (starting)
            }
        }
        System.out.println("The majority element does not exist");
    }

public static void main(String[] args) {
    int arr[]={7,7,5,7,5,1,5,7,5,5,7,7,5,5,5,5};
    majorityElementSorting(arr);
    }
}
    

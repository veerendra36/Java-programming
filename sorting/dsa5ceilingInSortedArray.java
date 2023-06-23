package sorting;

// ques: 
// Given a sorted array and a value x, the ceiling of x is the smallest element 
// in an array greater than or equal to x, 
// and the floor is the greatest element smaller than or equal to x. 
// Assume that the array is sorted in non-decreasing order. 
// Write efficient functions to find the floor and ceiling of x.

// solution approach:
// first find the correct position to insert the given element (by binary search)
// after finding the position the ceil element is the element in that position.
// floor element is one element back to it.
public class dsa5ceilingInSortedArray {
    public static void ceilingInSortedArray(int arr[], int element){
        boolean found=false;
        int start=0, end=arr.length-1;
        while(start<=end){
            int mid=(start+end)/2;
            if (arr[mid]==element){
                System.out.println("The ceil element is: "+arr[mid+1]);   // returning the ceil element 
                System.out.println("The floor element is: "+arr[mid-1]);   // returning the floor element 
                found=true;
                break;
            }
            if(arr[mid]>element){
                end = mid - 1;
            }else{
                start=mid+1;
            }
        }
        if(found==false){
            if(start>=arr.length-1){
                System.out.println("The ceil element does not exist");  
                System.out.println("The floor element is: "+arr[start-1]); 
            }else{
                System.out.println("The ceil element is: "+arr[start]);   // returning the ceil element 
                System.out.println("The floor element is: "+arr[start-1]);  // returning the floor element 
            }
        }
    }

    public static void main(String args[]){
        int arr[]={1, 2, 8, 10, 10, 12, 19};
        //  System.out.println("enter the element you want to search in the given array: ");
        int element=20;
        ceilingInSortedArray(arr,element);
    }
    
}
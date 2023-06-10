package arrays;
import java.util.*;
public class binary_search {
        // Binary search method
        public static void binarySearch(int arr[], int element){
            boolean found=false;
            int start=0, end=arr.length-1;
            while(start<=end){
                int mid=(start+end)/2;
                if (arr[mid]==element){
                    System.out.println("The required element is at "+mid+" position.");
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
                System.out.println("the element you want to search is not there in the array");
            }
        }
    
        public static void main(String args[]){
            Scanner sc=new Scanner(System.in);
            int arr[]={1,2,3,4,5,6,7,8,9,10,100};
            System.out.println("enter the element you want to search in the given array: ");
            int element=sc.nextInt();
            binarySearch(arr,element);
        }
}

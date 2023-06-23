package sorting;

import java.util.Scanner;

public class SearchINsertPosition {
            // Binary search method
    public static void searchInsert(int arr[], int element){
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
            System.out.println("The correct position to insert "+element+" is: "+start);
        }
    }

    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int arr[]={1,3,5,6};
        //  System.out.println("enter the element you want to search in the given array: ");
        int element=2;
        searchInsert(arr,element);
    }
}

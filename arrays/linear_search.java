package arrays;
import java.util.*;
public class linear_search {
    // linear search method
    public static void linearSearch(int arr[], int element){
        boolean found=false;
        for(int i=0; i<arr.length; i++){
            if (arr[i]==element){
                System.out.println("the given element is at index: "+i);
                found=true;
                break;
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
        linearSearch(arr,element);
    }
}

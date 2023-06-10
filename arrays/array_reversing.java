package arrays;
import java.util.*;
public class array_reversing {
    public static void arrayReversing(int arr[]){
        int first=0,last=arr.length-1;
        while(first<last){ 
            int temp=arr[last];
            arr[last]=arr[first];
            arr[first]=temp;
            first++;
            last--;
        }

    }

    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int arr[]={1,2,3,4,5,6,7,8,9,10,100};
        arrayReversing(arr);
        for(int i=0; i<arr.length; i++){  
            System.out.print(arr[i]+" "); 
        }
    }
}

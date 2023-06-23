package sorting;

import java.util.ArrayList;
import java.util.List;

// Given three arrays sorted in non-decreasing order, print all common elements in these arrays. 

public class CommonElements {
    public static void checkCommons(int arr1[], int arr2[], int arr3[], List<Integer> listI) {
        int i=0,j=0,k=0;
        while((i>arr1.length) && (j>arr2.length) && (k>arr3.length)){
            while(i<arr1.length-1 && (arr1[i]==arr2[j])&& arr2[j]==arr3[k]){
                i++;
            }
            while(j<arr2.length-1 && (arr1[i]==arr2[j])&& arr2[j]==arr3[k]){
                j++;
            }
            while(k<arr3.length-1 && (arr1[i]==arr2[j])&& arr2[j]==arr3[k]){
                k++;
            }
            if(arr1[i]<arr2[j] && arr1[i]<arr3[k]){
                i++;
            }else if(arr2[j]<arr1[i] && arr2[j]<arr3[k]){
                j++;
            }else if(arr3[k]<arr1[i] && arr3[k]<arr2[j]){
                k++;
            }else{
                listI.add(arr1[i]);
                i++;
                j++;
                k++;
            }
        }System.out.println(listI);
    }
    public static void main(String[] args) {
        List<Integer> listI= new ArrayList<>();
        int arr1[]={1, 5, 10, 20, 40, 80};
        int arr2[]={6, 7, 20, 80, 100};
        int arr3[]={3, 4, 15, 20, 30, 70, 80, 120};
        checkCommons(arr1,arr2,arr3,listI);
    }
}

//***
package sorting;
public class Insertion_Sort{
    public static void insertionSort(int arr[]){
    // outer loop for holding the iterations 
        for(int i=1; i<arr.length; i++){
            int curr = arr[i];
            int prev = i-1;
            // finding the correct pos to insert the current element
            while(prev>=0 && arr[prev]>curr){   // if prev is bigger than current then we enter into loop to change the pos
                arr[prev+1]=arr[prev];   // here arr[prev+1] == arr[curr]
                prev--;
            }
            // insertion\
            arr[prev+1] = curr;
        }  
    }

    // printing array
    public static void printArr(int arr[]){
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
    }

    public static void main(String args[]){
    int arr[]={5,4,1,3,2};
    insertionSort(arr);
    printArr(arr);
    }
}

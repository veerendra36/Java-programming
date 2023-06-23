package sorting;

public class selection_sort {
    public static void selectionSort(int arr[]){
    // outer loop for holding the iterations 
        for(int i=0; i<arr.length; i++){
            int minPos=i;
            // inner loop for comparisons of particular iterations  
            for(int j=i+1; j<arr.length; j++){
                if(arr[minPos]>arr[j]){
                    minPos=j;
                }
            }
            // swap
            int temp=arr[minPos];
            arr[minPos]=arr[i];
            arr[i]=temp;
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
    selectionSort(arr);
    printArr(arr);
    }
}

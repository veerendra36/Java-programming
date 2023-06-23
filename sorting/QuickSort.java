package sorting;


// step-1: selecting the pivot element, left pinter and right pointer
// step-2 partitioning the array like [small]  [pivot] [high]
// step-3 partitioning the left and right sub arrays

public class QuickSort {
    public static void quickSort(int arr[], int low_index, int high_index){
        if(low_index>=high_index){    // array with one element then nothing to do
            return;
        }

        // step-1
        int pivot= arr[high_index];
        int left_pointer = low_index;
        int right_pointer = high_index;

        // step-2
        while(left_pointer < right_pointer){      // run the loop until LF >= RF

            while(arr[left_pointer]<=pivot && left_pointer<right_pointer){   // run the loop until the LF > pivot
                left_pointer++;
            }
            while(arr[right_pointer]>=pivot && left_pointer<right_pointer){  // run the loop until the RF < pivot
                right_pointer--;
            }
            swap(arr, left_pointer,right_pointer);     // LF > pivot and RF < pivot (so swapping LF and RF)
        }
        swap(arr,left_pointer,high_index);

        // step-3 
        quickSort(arr,low_index,left_pointer-1);    // left sub array 
        quickSort(arr,left_pointer+1,high_index);    // right sub array 
    }
    private static void swap(int arr[], int num1, int num2) {
        int temp=num1;
        num1=num2;
        num2=temp;
    }
    public static void printArr(int arr[]){
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
    }

    // main method
    public static void main(String args[]){
        int arr[]={1,8,3,9,4,5,7};
        int low_index=0;
        int high_index=arr.length-1;
        //quick sort method call 
        quickSort(arr, low_index,  high_index);
        printArr(arr);
    }
}

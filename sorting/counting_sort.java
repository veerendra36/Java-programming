package sorting;

public class counting_sort {
    public static void countingSort(int arr[]){
    // (1) outer loop for finding largest element in the array:
        int largest=Integer.MIN_VALUE;
        for(int i=0; i<arr.length; i++){
            largest=Math.max(arr[i],largest);
        }

    // (2) building the frequency(count) array
        int count[]=new int[largest+1];
        for(int i=0; i<arr.length; i++ ){
            count[arr[i]]++;    // incrementing the count of 
        }
    
    // (3) sorting the array using the frequency array
        int j=0;
        for(int i=0; i<count.length; i++){
            while(count[i]>0){     // for multiple elements
                arr[j]=i;          // (1)  arr[j] iterates through the 0 to count for each element
                count[i]--;        // decreasing the count for the element
                j++;               // increasing the iteration
            }
        }
    }

    // printing array
    public static void printArr(int arr[]){
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
    }

    public static void main(String args[]){
    int arr[]={1,4,1,3,2,4,3,7};
    countingSort(arr);
    printArr(arr);
    }
}

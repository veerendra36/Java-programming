package sorting;
// Question: (ds Sheet sorting-1)
// Given two arrays of equal size n and an integer k. 
// The task is to permute both arrays such that sum of 
// their corresponding element is greater than or equal to k i.e a[i] + b[i] >= k. 
// The task is to print “Yes” if any such permutation exists, otherwise print “No”.


// Solution approach:
// (1) sort the first array in ascending order 
// (2) sort the second array in descending order 
// (3) check weather the given condition is satisfied  (if yes return yes) (if false return No)


public class permutations_in_arrays {

    public static void permutationInArrays(int arr[], int arr2[]){
        // counting sort 
    }

    

    public static void main(String args[]){
    int arr1[]={1,4,1,3,2,4,3,7};
    int arr2[]={1,4,1,3,2,4,3,7};
    permutationInArrays(arr1,arr2);
    }
}

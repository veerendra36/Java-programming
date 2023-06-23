package sorting;
// ques: Searching in an array where adjacent differ by at most k
public class DsaSheetQ4 {
    public static void searchElement(int arr[], int key, int element) {
        int i=0;
        if(arr[1]==element){
            System.out.println(1);
        }
        else{
            while(i<arr.length){
                // step-1: find the difference bw the current and element to be search
                int diff=arr[i]-element;
                // step-2: find the no of positions to be jump (jump= diff/key)
                int jump=Math.abs(Math.max(diff/key,1));
                // move to the position or jump to the position
                i=i+jump;
                if(arr[i]==element){
                    System.out.println(i);
                    break;
                }
            }
        }

    }
    public static void main(String[] args) {
        int arr[]={20,40,50,70,70,60};
        int k=20;
        int x=70;
        searchElement(arr,k,x);
    }
}

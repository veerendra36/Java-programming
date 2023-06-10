package arrays;

public class Trapped_water {
    public static void trappedWater(int arr[]){

        // step-1: build the left max boundaries (helper array-1)
        int helper_arr1[]=new int[arr.length];
        helper_arr1[0]=arr[0];
        for(int i=1; i<arr.length;i++){
            helper_arr1[i]=Math.max(arr[i],helper_arr1[i-1]);
        }

        // step-2: build right max boundaries (helper array-1)
        int helper_arr2[]=new int[arr.length];
        helper_arr2[arr.length-1]=arr[arr.length-1];
        for(int i=arr.length-2; i>=0;i--){
            helper_arr2[i]=Math.max(arr[i],helper_arr2[i+1]);
        }
        int trapped_water_sum=0;
        // loop for
        for (int i=0;i<arr.length;i++){
            // water level=min(left max boundary, right max boundary)
            int water_level=Math.min(helper_arr1[i],helper_arr2[i]);

            // Trapped water = (water level- current height of building)
            int Trapped_water=water_level-arr[i];

            // Updating the trapped water sum
            trapped_water_sum+=Trapped_water;
        }
        System.out.println("the amount of water trapped is: "+trapped_water_sum);
    }
    public static void main(String args[]){
        int arr[]={0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1};
        trappedWater(arr);
    }
}

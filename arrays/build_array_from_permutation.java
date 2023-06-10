package arrays;

public class build_array_from_permutation {
    public static void buildPermutationArray(int nums[]){
        int ans[]=new int[nums.length];
        for(int i=0; i<ans.length; i++){
            ans[i]=nums[nums[i]];
        }
        for(int i=0; i<ans.length; i++){
            System.out.print(ans[i]+" ");
        }
    }

        public static void main(String args[]){
        int nums[]={0,2,1,5,3,4};
        buildPermutationArray(nums);
    }

}

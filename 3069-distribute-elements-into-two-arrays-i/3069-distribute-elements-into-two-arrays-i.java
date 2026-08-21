class Solution {
    public int[] resultArray(int[] nums) {
        int  n= nums.length;
        int[] arr1= new int[n];
        int[] arr2= new int[n];

        int x=0,y=0;
        
        arr1[x++]=nums[0];
        arr2[y++]=nums[1];

        for(int i=2;i<n;i++){
            if(arr1[x-1]>arr2[y-1]){
        arr1[x++]=nums[i];
            }
            else{
                arr2[y++]=nums[i];
            }
        }

        int[] ans = new int[n];

        int k=0;

        for(int i =0;i<x;i++){
            ans[k++]=arr1[i];
        }
        for(int i =0;i<y;i++){
            ans[k++]=arr2[i];
        }
        return ans;
    }
}
class Solution {
    public int dominantIndex(int[] nums) {
      int n=nums.length;
      int max=0;
      for(int i=1;i<nums.length;i++){
        if(nums[i]>nums[max]){
            
            max=i;
        }
      }
        for(int j=0;j<nums.length;j++){
            if(j!=max && nums[max]< 2 * nums[j])
            return -1;
        }
      
      return max; 
    }
}
class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int tempSize=0;
        int maxSize=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==1){
                tempSize++;
            }
            else{
                maxSize=Math.max(maxSize,tempSize);
                tempSize=0;
            }
        }
        return Math.max(maxSize,tempSize);
    }

}
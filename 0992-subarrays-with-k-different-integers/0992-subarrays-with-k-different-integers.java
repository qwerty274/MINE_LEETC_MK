class Solution {
    public int subarraysWithKDistinct(int[] nums, int k) {

        //brute

        // int count=0;

        // for(int i=0;i<nums.length;i++){

        //     HashSet<Integer>set=new HashSet<>();
            
        //     for(int j=i;j<nums.length;j++){
        //         set.add(nums[j]);

        //         if(set.size()==k) count++;

        //         else if(set.size()>k) break;
        //     }
        // }
        // return count;


        //optimal
        
        return func(nums,k)-func(nums,k-1);
    }
    public int func(int[] nums,int k){

        int left=0, count=0;

        HashMap<Integer,Integer>map=new HashMap<>();

        for(int right=0;right<nums.length;right++){

            map.put(nums[right],map.getOrDefault(nums[right],0)+1);

            while(map.size()>k){
                map.put(nums[left],map.get(nums[left])-1);

                if(map.get(nums[left])==0){
                    map.remove(nums[left]);
                }

                left++;
            }
            count+=right-left+1;
        }
        return count;
    }
}
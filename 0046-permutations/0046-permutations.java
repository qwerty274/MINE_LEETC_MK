class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        List<Integer> ds = new ArrayList<>();
        boolean[] bool = new boolean[nums.length];
        per(nums,ds,bool,res);
        return res;
    }
    public void per(int[] nums,List<Integer> ds,boolean[]bool,List<List<Integer>> res){
        if(ds.size()==nums.length){
            res.add(new ArrayList<>(ds));
            return;
        }
        else{
            for(int i=0;i<nums.length;i++){
                if(!bool[i]){
                    bool[i]=true;
                    ds.add(nums[i]);
                    per(nums, ds,bool,res);
                    ds.remove(ds.size()-1);
                    bool[i]=false;
                    
                }
            }
        }
    }
}
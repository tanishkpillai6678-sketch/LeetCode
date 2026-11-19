class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        solve(0,nums,ans,new ArrayList<>());
        return ans;
    }
    public void solve(int ind,int nums[],List<List<Integer>> ans,List<Integer> curr){
        if(ind==nums.length){
            ans.add(curr);
            return;
        }
        solve(ind+ 1, nums, ans, new ArrayList<>(curr));
        List<Integer> temp = new ArrayList<>(curr);
        temp.add(nums[ind]);

        solve(ind + 1, nums,ans, temp);
    }
}
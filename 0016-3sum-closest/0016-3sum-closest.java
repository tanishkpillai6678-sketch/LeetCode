class Solution {
    public int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
        int maxdiff=Integer.MAX_VALUE;
        int result=0;
        int n=nums.length;
        for(int i=0;i<=n-3;i++){
            int s=i+1;
            int e=n-1;
            while(s<e){
                int sum=nums[i]+nums[s]+nums[e];
                int diff=Math.abs(sum-target);
                if(diff<maxdiff){
                    maxdiff=diff;
                    result=sum;
                }
                if(sum==target){
                    return sum;
                }
                if(sum<target){
                    s++;
                }
                else{
                    e--;
                }
            }
        }
        return result;
    }
}
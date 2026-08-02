class Solution {
    static boolean isValidAns(int weights[],int days,int mid){
        int day=1,weight=0;
        for(int i=0;i<=weights.length-1;i++){
            if(weight+weights[i]<=mid){
                weight=weight+weights[i];
            }
            else{
                day++;
                if(day>days || weights[i]>mid){
                    return false;
                }
                else{
                    weight=0;
                    weight=weight+weights[i];
                }
            }
        }
        return true;
    }
    public int shipWithinDays(int[] weights, int days) {
        if(days>weights.length){
            return -1;
        }
        int n=weights.length,s=1,sum=0,ans=-1;
        for(int i=0;i<=n-1;i++){
            sum=sum+weights[i];
        }
        int e=sum;
        while(s<=e){
            int mid=s+(e-s)/2;
            if(isValidAns(weights,days,mid)){
                ans=mid;
                e=mid-1;
            }
            else{
                s=mid+1;
            }
        }
        return ans;
    }
}
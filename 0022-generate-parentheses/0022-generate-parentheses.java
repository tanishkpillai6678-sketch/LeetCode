class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> list=new ArrayList<>();
        solve(0,0,"",list,n);
        return list;
    }
    public void solve(int open,int close,String ans,List<String> list,int n){
        if(ans.length()==2*n){
            list.add(ans);
            return;
        }
        if(open<n){
            solve(open+1,close,ans+"(",list,n);
        }
        if(close<open){
            solve(open,close+1,ans+")",list,n);
        }
    }
}
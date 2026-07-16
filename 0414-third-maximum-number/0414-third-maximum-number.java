class Solution {
    public int thirdMax(int[] nums) {
        ArrayList<Integer> list=new ArrayList<>();
        for(int i=0;i<=nums.length-1;i++){
            list.add(nums[i]);
        }
        Collections.sort(list);
        for(int i=0;i<=list.size()-1;i++){
            for(int j=i+1;j<=list.size()-1;j++){
                if(list.get(i).equals(list.get(j))){
                    list.remove(j);
                    j--;
                }
            }
        }
        if(list.size()<3){
            return list.get(list.size()-1);
        }
        return list.get(list.size()-3);
    }
}
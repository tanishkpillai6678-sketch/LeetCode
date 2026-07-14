class Solution 
{
    public int[] smallerNumbersThanCurrent(int[] nums) 
    {
        ArrayList<Integer> list=new ArrayList<>();
        for(int i=0;i<=nums.length-1;i++)
        {
            int count=0;
            for(int j=0;j<=nums.length-1;j++)
            {
                if(nums[i]>nums[j])
                {
                    count++;
                }
            }
            list.add(count);
        }
        int arr[]=new int[list.size()];
        for(int i=0;i<=list.size()-1;i++)
        {
            arr[i]=list.get(i);
        }
        return arr;
    }
}
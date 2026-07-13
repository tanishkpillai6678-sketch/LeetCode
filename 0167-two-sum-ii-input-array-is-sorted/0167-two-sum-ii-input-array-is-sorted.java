class Solution 
{
    public int[] twoSum(int[] numbers, int target) 
    {
        for(int fst=0;fst<=numbers.length-1;fst++)
        {
            for(int i=fst+1;i<=numbers.length-1;i++)
            {
                if(numbers[fst]+numbers[i]==target)
                {
                    return new int[]{fst+1,i+1};
                }
            }
        }
        return new int[]{};
    }
}
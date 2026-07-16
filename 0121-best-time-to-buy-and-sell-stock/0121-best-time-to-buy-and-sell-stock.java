class Solution 
{
    public int maxProfit(int[] prices) 
    {
        int min=prices[0];
        int maxpro=0;
        for(int i=1;i<=prices.length-1;i++)
        {
            if(prices[i]<min)
            {
                min=prices[i];
            }
            else
            {
                maxpro=Math.max(maxpro,Math.abs(min-prices[i]));
            }
        }
        return maxpro;
    }
}
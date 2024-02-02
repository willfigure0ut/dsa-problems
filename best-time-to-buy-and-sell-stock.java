class Solution {
    public int maxProfit(int[] prices) {
        int lsf = Integer.MAX_VALUE;
        int overallProfit = 0;
        int recent = 0;
        
        for(int i = 0; i < prices.length; i++){
            if(prices[i] < lsf){
                lsf = prices[i];
            }
            recent = prices[i] - lsf;
            if(overallProfit < recent){
                overallProfit = recent;
            }
        }
        return overallProfit;
    }
}
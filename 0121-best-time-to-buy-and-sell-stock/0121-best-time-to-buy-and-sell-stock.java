class Solution {
    public int maxProfit(int[] prices) {
        int bu=prices[0];
        int pro=0;
        for(int i=0;i<prices.length;i++){
            if(prices[i]<bu){
                bu=prices[i];
            }
            else if(prices[i] - bu >pro){
                pro=prices[i] - bu;
            }
        }
        return pro;
    }
}
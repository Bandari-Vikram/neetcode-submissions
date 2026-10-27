class Solution {
    public int maxProfit(int[] prices) {
        int profit = 0;
        for(int i=0;i<prices.length-1;i++){
            for(int j=i+1;j<prices.length;j++){
                int today = prices[i];
                int tmrw = prices[j];
                if(today<tmrw){
                    if(profit<(tmrw-today)){
                        profit = tmrw-today;
                    }
                }
            }
        }
        return profit;
    }
}

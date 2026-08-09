class Solution {
    public int maxProfit(int[] prices) {
        int min = -1;
        int diff = 0;

        for(int i=0; i< prices.length; i++) {
            if(min == -1 || prices[i] < min) {
                min = prices[i];
            } else if (diff < prices[i] - min){
                diff = prices[i] - min;
            }
        }

        return diff;
    }
}
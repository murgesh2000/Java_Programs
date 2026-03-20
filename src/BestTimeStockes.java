public class BestTimeStockes {

	public static int maxProfit(int[] prices) {
		int max=0;
		for (int i = 0; i < prices.length; i++) {
			for(int j=i+1; j< prices.length; j++)
			{
				int profit = prices[j]-prices[i];
				if(profit>max)
				{
					max = profit;
				}
			}
			
		}
		
		
		return max;
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		int[] prices = {7,1,5,3,8,4};
		int max_profit = maxProfit(prices);
		System.out.println(max_profit);

	}

}

package arrays;

public class buy_and_sell_stocks {
    public static void buySellStocks(int arr[]){
        // step-1: initialize BuyPrice and MaxProfit
        int BuyPrice=Integer.MAX_VALUE;
        int MaxProfit=0;

        // step-2: calculate the the profit and max profit
        for(int i=0; i<arr.length; i++){
            if(BuyPrice<arr[i]){
                int profit=arr[i]-BuyPrice;
                MaxProfit=Math.max(MaxProfit, profit);
            }else{
                BuyPrice=arr[i];
            }
        }
        System.out.print("The maximum profit of the days is: "+MaxProfit);
    }
    public static void main(String args[]){
        int arr[]={7,1,5,3,6,4};
        buySellStocks(arr);
    }
}

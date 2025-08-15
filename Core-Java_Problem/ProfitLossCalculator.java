public class ProfitLossCalculator {
    public static void main(String[] args) {
        double costPrice = 129.0;
        double sellingPrice = 191.0;
        double profit = sellingPrice - costPrice;
        double profitPercentage = (profit / costPrice) * 100;
        System.out.println("The Cost Price is INR " + costPrice + " and Selling Price is INR " + sellingPrice);
        System.out.println("The Profit is INR " + profit);
        System.out.println("and the Profit Percentage is " + profitPercentage + "%");
    }
}

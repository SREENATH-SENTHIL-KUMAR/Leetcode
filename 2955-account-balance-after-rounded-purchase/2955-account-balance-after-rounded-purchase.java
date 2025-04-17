class Solution {
    public int accountBalanceAfterPurchase(int purchaseAmount) {
        int n=purchaseAmount;
        int c=((n+5)/10)*10;
        return 100-c;
    }
}
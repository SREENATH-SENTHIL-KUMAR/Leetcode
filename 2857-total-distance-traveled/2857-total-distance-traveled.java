class Solution {
    public int distanceTraveled(int mainTank, int additionalTank) {
        int a=mainTank,b=additionalTank;
        return (a + Math.min((a - 1) / 4, b)) * 10;
    }
}
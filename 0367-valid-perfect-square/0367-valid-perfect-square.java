class Solution {
    public boolean isPerfectSquare(int num) {
        for(int i=0;i<=Math.sqrt(num);i++){
            if(i*i==num){
                return true;
            }
        }
        return false;
    }
}
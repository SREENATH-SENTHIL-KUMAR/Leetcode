class Solution {
    public boolean isPalindrome(int x) {
        if(x < 0){
            return false;
        }
        int rev=0;
        int tem=x;
        while(tem!=0){
            int dig=(int) (tem % 10);
            rev=rev*10+dig;
            tem/=10;
        }
        return (rev == x);
    }
}
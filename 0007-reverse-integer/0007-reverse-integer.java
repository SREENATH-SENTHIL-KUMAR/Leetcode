class Solution {
    public int reverse(int x) {
        long r=0,l=0;
        while(x!=0){
            r=x%10;
            l=r+l*10;
            x=x/10;
        }
        if(l>Integer.MAX_VALUE || l<Integer.MIN_VALUE){
            return 0;
        }
        return (int)l;
    }
}
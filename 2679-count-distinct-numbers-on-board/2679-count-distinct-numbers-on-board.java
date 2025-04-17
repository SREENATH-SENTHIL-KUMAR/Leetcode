class Solution {
    public int distinctIntegers(int n) {
        if(n<2){
            return n;
        }
        return n-1;
    }
}
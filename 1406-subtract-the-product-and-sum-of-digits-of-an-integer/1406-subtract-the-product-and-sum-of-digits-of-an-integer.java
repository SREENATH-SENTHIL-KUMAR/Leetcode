class Solution {
    public int subtractProductAndSum(int n) {
       int rem=0,total=1,s=0;
       while(n!=0){
        rem = n %10;
        total =total*rem;
        s=s+rem;
        n=n/10;
       } 
       return total-s;
    }
}
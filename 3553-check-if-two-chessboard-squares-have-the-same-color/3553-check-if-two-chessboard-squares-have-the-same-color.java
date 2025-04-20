class Solution {
    public boolean checkTwoChessboards(String coordinate1, String coordinate2) {
       int a=coordinate1.charAt(0)-'a';
       int b=coordinate1.charAt(1)-'0';
       int c=coordinate2.charAt(0)-'a';
       int d=coordinate2.charAt(1)-'0';
       return (a+b)%2==(c+d)%2;
    }
}
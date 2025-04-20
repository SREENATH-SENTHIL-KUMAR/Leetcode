class Solution {
    public char repeatedCharacter(String s) {
         for(int i=0;i<s.length();i++){
            char d=s.charAt(i);
            if(s.indexOf(d)<i){
                return d;
            }
         }
         return ' ';
    }
}
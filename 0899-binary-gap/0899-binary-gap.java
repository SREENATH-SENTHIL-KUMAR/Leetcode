class Solution {
    public int binaryGap(int n) {
        int p=-1;
        int i=0;
        int m=0;
        while(n>0){
            if((n&1)==1){
                if(p==-1){
                    p=i;
                }
                else{
                    int diff=i-p;
                    p=i;
                    if(m<diff){
                        m=diff;
                    }

                }
            }
            i++;
        n>>=1;
        }
    return m;
    }
    
}
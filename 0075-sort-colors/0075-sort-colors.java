class Solution {
    public void sortColors(int[] nums) {
        int cnto=0;
        int cntt=0;
        int cntth=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==0) cnto++;
            else if(nums[i]==1) cntt++;
            else cntth++;
        }
        for(int i=0;i<cnto;i++){
            nums[i]=0;
        }
        for(int i=cnto;i<cnto+cntt;i++){
            nums[i]=1;
        }
        for(int i=cnto+cntt;i<nums.length;i++){
            nums[i]=2;
        }
    }
}
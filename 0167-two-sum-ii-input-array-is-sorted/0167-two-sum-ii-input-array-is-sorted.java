class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int s=0;
        int l=numbers.length-1;
        while(s<l){
            int sum=numbers[s]+numbers[l];
            if(sum==target){
                return new int[]{s+1,l+1};
            }
            else if(sum<target){
                s++;
            }
            else{
                l--;
            }
        }
        return new int[]{};
    }
}
class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        Map<Integer, Integer> cmt = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if(cmt.containsKey(nums[i])){
                int a=cmt.get(nums[i]);
                if(Math.abs(a-i)<=k) return true;
                cmt.put(nums[i],i);
            }
            else{
                cmt.put(nums[i],i);
            }
        }
        return false;
    }
}
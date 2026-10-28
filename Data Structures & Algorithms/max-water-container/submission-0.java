class Solution {
    public int maxArea(int[] nums) {
        int i = 0;
        int j = nums.length-1;
        int max = 0;
        while(i!=j){
            int width = j-i;
            int length = Math.min(nums[i],nums[j]);
            int area = length*width;
            max = Math.max(area,max);
            if(nums[i]<nums[j]){
                i++;
            }
            else j--;
        }
        return max;
    }
}

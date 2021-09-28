/**
* https://leetcode.com/problems/two-sum/
*/
class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] ans = new int[2];
        for (int i = 0; i < nums.length; i++){
            int checker = target-nums[i];
            for (int j =  i+1; j < nums.length; j++){
                if (nums[j]==checker){
                    ans[0]=i;
                    ans[1]=j;
                }
            }
        }
    return ans;
    }
}
// subtract index number from target and search for the result in array.
// if matches then get the index location.

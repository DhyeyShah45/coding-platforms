/**
* https://leetcode.com/problems/binary-search/
*/
class Solution {
    public int search(int[] nums, int target) {
        int start=0,end=nums.length-1;
        return binarySearch(start,end,target,nums);
    
    }
    
    public int binarySearch(int start,int end, int target, int[]nums)
        {
            if(start<=end){
                int mid=(start+end)/2;
                if(nums[mid]==target)
                    return mid;
                if(target>nums[mid])
                    return binarySearch(mid+1,end,target,nums);
                if(target<nums[mid])
                    return binarySearch(start,mid-1,target,nums);
            }
        return -1;
        }
}

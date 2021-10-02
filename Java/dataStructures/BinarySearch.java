// video explanation - https://youtu.be/IJDJ0kBx2LM?t=2368

package dataStructures;

public class BinarySearch {

	public static void main(String[] args) {
		int[] arr1 = {2,5,8,12,55,89};
		int target = 0;
		System.out.println(search(arr1,target));
	}
   
	public static int search(int[] nums, int target) {
        int start=0,end=nums.length-1;
        return binarySearch(start,end,target,nums);
    }
    
    public static int binarySearch(int start,int end, int target, int[]nums){
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

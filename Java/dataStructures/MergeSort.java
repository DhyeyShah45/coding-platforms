// Python Tutor Visualisation - https://pythontutor.com/java.html#mode=edit
// Video Explanation - https://youtu.be/IJDJ0kBx2LM?t=2948

package dataStructures;

import java.util.Arrays;

public class MergeSort {

    public static void mergeSort(int[] nums, int start, int end) {
        if(start<end) {
        int mid = (start+end)/2;
        
        // Breaks the array into part until it has atleast 2 elements
        mergeSort(nums,start,mid);
        mergeSort(nums,mid+1,end);
        
        //It merges the sub-arrays
        merge(nums,start,mid,end);
        }
    }
    
    public static void merge(int[] nums, int start, int mid, int end) {
        int[] ans = new int[end-start+1];
        int i=start,j=mid+1,k=0;
        
        //merges upto to which one of the sub-array is not empty
        while(i<=mid && j<=end) {
            if(nums[i]<nums[j])
                ans[k++] = nums[i++];
            else
                ans[k++] = nums[j++];
        }
        
        //merges the leftover part of sub-array
        while(i<=mid){
            ans[k] = nums[i];
            k++;i++;
        }
        while(j<=end){
            ans[k] = nums[j];
            k++;j++;
        }
        
        //copies the temp sub-array into the main array
        for(i=start;i<=end;i++)
            nums[i] = ans[i-start];
        
    }
    
    public static void main(String[] args) {
        int[] arr = {9,8,4,5,0,2,1,3};
        mergeSort(arr,0,arr.length-1);
        System.out.println(Arrays.toString(arr));
    }

}
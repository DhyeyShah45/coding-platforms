//  https://leetcode.com/problems/container-with-most-water/

/**
The solution uses the logic that start the area from boundaries.
Calculate the area.
Traverse down inwards by changing the pointer of the lesser height inwards.
Example Height = [1,8,5,6,4,3,8,7]
Here i = 0 (pointer to 1)
j = 7 (pointer to 7)
now calulate the area 
the height of pointer i < j therefore i++
*/
class Solution {
    public int maxArea(int[] height) {
        int area=0,max_area=0;
        int i=0,j=height.length-1;
        while(i<j){
            area = (j-i)*Math.min(height[i],height[j]);
            if(area>max_area)
                max_area = area;
            if(height[i]<height[j])
                i++;
            else
                j--;
        }
    return max_area;
    }
}

// O(n^2) solution - time limit exceeded

// class Solution {
//     public int maxArea(int[] height) {
//         int area=0,max_area=0;
//         for(int i=0;i<=height.length-2;i++){
         
//             for(int j = i+1;j<height.length;j++){
                
//                 area = (j-i)*(Math.min(height[i],height[j]));
               
//                 if(area>max_area){
//                     max_area = area;
//                 }
//             }
//         }
//     return max_area;
//     }
// }

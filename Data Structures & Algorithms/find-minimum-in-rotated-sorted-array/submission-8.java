class Solution {
    public int findMin(int[] nums) {
        int start = 0;
        int end = nums.length-1;
        int N = nums.length;
        int result = -1;
        // loop through the nums[]
        while (start<end) {
            int mid = start + (end-start)/2;
            
            if (nums[mid] > nums[end]){
                start = mid + 1; 
            }
            else {
                end = mid;
            }
        }
        return nums[start];
    }
}

class Solution {
    public int longestConsecutive(int[] nums) {
        if (nums.length == 0) return 0;
    Arrays.sort(nums);
    int longest = 1, current = 1;
    for (int i = 1; i < nums.length; i++) {
        if (nums[i] == nums[i - 1]) continue;          // duplicate: skip, run continues
        if (nums[i] == nums[i - 1] + 1) current++;     // consecutive: extend
        else current = 1;                              // gap: reset
        longest = Math.max(longest, current);
    }
    return longest;
    }
}
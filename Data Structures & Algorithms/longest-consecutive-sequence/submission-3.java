class Solution {
    public int longestConsecutive(int[] nums) {
       // Add the array to hashset
       Set<Integer> set = new HashSet<>();
       for (int num: nums) {
        set.add(num);
       }
       int  longest = 0;
       // For each num in set check if n-1 exists ?  if yes skip, if no check n+1 exists and keep cheking 
       for(Integer num: set) {
            if (set.contains(num - 1)) continue;
            int current = num;
            int count = 1;
            while (set.contains(current + 1)){
                current++;
                count++;
            }
            longest = Math.max(longest,count);
       }
       return longest;
    }
}
class Solution {
    public int longestConsecutive(int[] nums) {
       // Add the num toset
       Set<Integer> set = new HashSet<>();
       for (int num : nums) {
            set.add(num);
       }
       // Create a for loop & check if num-1 is present : if yes then skip as it is a run condition 
       // if num-1 is not present then check num+1 is present; if yes then increment count & current value and at end of while loop check Math.max(longest, count)
        int longest = 0;
       for(int num: set) {

        if (set.contains(num-1)) continue;
        int current=num;
        int count=1;
        while(set.contains(current+1)){
            current++;
            count++;
        }

        longest = Math.max(longest,count);
       }
        return longest ;
    }
}
class Solution {
    public int lengthOfLongestSubstring(String s) {
        Set<Character> charSet = new HashSet<>();
        int left= 0;
        int right=0;
        int maxLength=0;
        char[] ca = s.toCharArray();
        
        while (right < ca.length) {

            while(charSet.contains(ca[right])){
                charSet.remove(ca[left]);
                left++;
            }
            charSet.add(ca[right]);
            maxLength = Math.max(maxLength, charSet.size());
            right++;
        }


        return maxLength;
    }
}

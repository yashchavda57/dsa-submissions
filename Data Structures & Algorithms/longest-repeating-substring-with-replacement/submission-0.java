class Solution {
    public int characterReplacement(String s, int k) {
        HashMap<Character, Integer> countMap = new HashMap<>();
        char[] charArray = s.toCharArray();
        int max = 0;
        int left=0;
        int right=0;
        for(right=0;right<charArray.length;right++){
            countMap.put( charArray[right] , 1 + countMap.getOrDefault(charArray[right],0));
            while( (right-left+1) -  Collections.max(countMap.values()) > k ){
                countMap.put(charArray[left], countMap.getOrDefault( charArray[left], 0) -1 );
                left++;
            }
            max = Math.max(max, right-left+1);
        }
        return max;
    }
}

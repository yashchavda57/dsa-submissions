class Solution {
    public String minWindow(String s, String t) {

        if (t.isEmpty()){
            return "";
        }

        HashMap<Character, Integer> needMap = new HashMap<>();
        HashMap<Character,Integer> haveMap = new HashMap<>();
        char[] tArray = t.toCharArray();
        char[] sArray = s.toCharArray();
        
        for (int i=0; i < tArray.length; i++ ){
            needMap.put(tArray[i] , needMap.getOrDefault(tArray[i],0) + 1);
        }

        int need = needMap.size();
        int have = 0;
        int[] resArray = {-1,-1};
        int resLength = Integer.MAX_VALUE;
        int l=0;
        
        for (int r = 0; r < sArray.length ; r++ ){
            // get the char c from string s
            char c = sArray[r];
            if (needMap.containsKey(c)){
                haveMap.put(c, haveMap.getOrDefault(c,0)+1);
                if (needMap.get(c).equals(haveMap.get(c))) {
                    have += 1;
                }
            }

            // While loop till the haveMap stays valid 
            while (have == need) {
                // update the result 
                if (r-l+1 < resLength) {
                    resArray[0] = l;
                    resArray[1] = r;
                    resLength = r-l+1;
                }
                // Shrink the haveMap by incrementing the l and updating the haveMapMap
                if(needMap.containsKey(sArray[l])){
                    haveMap.put(sArray[l], haveMap.get(sArray[l]) - 1 );
                    if (haveMap.get(sArray[l]) < needMap.get(sArray[l]) ) {
                        have -= 1;
                    }
                }
                l+=1;
                
            }
        }
        return resLength == Integer.MAX_VALUE ? "" : s.substring(resArray[0], resArray[1] + 1);
    }
}
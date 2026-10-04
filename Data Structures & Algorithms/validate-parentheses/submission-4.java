class Solution {
    public boolean isValid(String s) {
        Map<Character, Character> openToCloseMap = new HashMap<>();
        openToCloseMap.put('(', ')');
        openToCloseMap.put('[', ']');
        openToCloseMap.put('{', '}');

        Deque<Character> stack = new ArrayDeque<>();

        char[] sArray = s.toCharArray();

        for(int i =0 ; i < sArray.length;i++) {
            if (openToCloseMap.containsKey(sArray[i]) ){
                stack.push(sArray[i]);
            } else if ( stack.isEmpty() || openToCloseMap.get(stack.pop()) != sArray[i]) {
                return false;
            }
        }
        return stack.isEmpty();
    }
}

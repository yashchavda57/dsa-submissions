class Solution {
    public boolean isPalindrome(String s) {
        // initialize two pointers 
        int i =0 ; 
        char[] charArray = s.toCharArray();
        int j = charArray.length-1;

        while(i<j){
            while (i<j && !Character.isLetterOrDigit(charArray[i])) i++;
            while (i<j && !Character.isLetterOrDigit(charArray[j])) j--;
            if (Character.toLowerCase(charArray[i]) != Character.toLowerCase(charArray[j])) {
                return false;
            }
            i++;
            j--;
        }
         return true;
    }
}

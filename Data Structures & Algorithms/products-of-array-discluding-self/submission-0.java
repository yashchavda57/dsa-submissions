class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] prefix = new int[nums.length];
        int[] postfix = new int[nums.length];
        int[] result = new int[nums.length];
        int product = 1;

        //create prefix array
        for(int i=0; i<nums.length;i++) {
            prefix[i]= product;
            product = product * nums[i]; 
        }
        product = 1;
        // Create postfix array 
        for(int i=nums.length-1;i>=0;i--) {
            postfix[i] = product;
            product = product * nums[i];
        }

        // Create result array
        for(int i=0; i< nums.length; i++) {
            result[i] = prefix[i] * postfix[i];

        }
        return result;

    }
}
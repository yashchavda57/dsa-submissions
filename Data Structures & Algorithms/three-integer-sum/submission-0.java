class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Set<List<Integer>> result = new HashSet<>();
        Arrays.sort(nums);
        for(int fixed = 0; fixed<nums.length ; fixed++) {
            if(nums[fixed] > 0) break;
            // two pointer for the remaining array
            int i = fixed+1;
            int j = nums.length-1;
            while(i<j){
                int sum = nums[fixed]+ nums[i] + nums[j];
                if ( sum == 0) {
                    result.add(Arrays.asList(nums[fixed],nums[i],nums[j]));
                    i++;
                    j--;
                } else if (sum < 0) {
                    i++;
                } else {
                    j--;
                }
            }
        }
        return new ArrayList<>(result);
    }
}

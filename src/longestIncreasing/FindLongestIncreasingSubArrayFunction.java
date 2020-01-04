package longestIncreasing;

public class FindLongestIncreasingSubArrayFunction {
    public int findLengthOfLCIS(int[] nums) {
    	// Error checking
        if(nums == null || nums.length == 0){
            return 0;
        }
        
        // Starts from one cause there is always one sub array
        int result = 1;
        int count = 1;
        
        for(int i = 1; i < nums.length; i++){
        	// Compare current with previous
            if(nums[i - 1] < nums[i]){
            	// ++count will increasing the count before hand
            	result = Math.max(result, ++count);
            } else {
            	// Reset the count back to 1 when there is another subsequence
                count = 1;
            }
        }
        
        return result;
    }
}

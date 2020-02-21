package longestIncreasing;

public class FindLongestIncreasingSubArrayFunction {
    public int findLengthOfLCIS(int[] nums) {
    	// Error checking
        if(nums == null || nums.length == 0){
            return 0;
        }
        
        // Starts from one cause there is always one sub array
        int result = 1;
        
        // Count should not be 0 because when we compare, there is already two increasing subarray
        int count = 1;
        
        for(int i = 0; i < nums.length - 1; i++){
        	// Compare current with previous
            if(nums[i] < nums[i + 1]){
            	// ++count will increasing the count before hand
            	count++;
            	
            	// shouldn't be in else because what if there is only increasing number
            	result = Math.max(result, count);
            } else {
            	// Reset the count back to 1 when there is another subsequence
                count = 1;
            }
        }
        
        return result;
    }
    
    // another way to do it
	public int findLengthOfLCIS2(int[] nums) {
		
		if (nums.length == 0 || nums.length == 1) {
			return nums.length;
		}

		int left = 0;

		int right = left + 1;

		int count = 1;

		int max = 1;

		// boolean firstCurrentIncrement = true;

		while (right < nums.length) {

			// If num at i is less than num at j, increment j, and current.
			// Check if current is greater than ouput. If so, make output ==
			// current.
			if (nums[left] < nums[right]) {
				left++;
				
				right++;
				
				count++;
				
				if (count > max) {
					max = count;
				}
			} else {
				left++;
				right++;
				
				count = 1;
			}
		}

		return max;

	}
}

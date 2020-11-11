package longestIncreasing;

import java.util.Arrays;

public class Main {
	public static void main(String[] args) {
		int[] nums = {6,7,8,1,2};
		
		System.out.println("Input: " + Arrays.toString(nums));
		
		FindLongestIncreasingSubArrayFunction solution = new FindLongestIncreasingSubArrayFunction();
		
		System.out.println("Solution: " + solution.findLengthOfLCIS(nums));
	}
}

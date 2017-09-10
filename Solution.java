/**
 * 674. Longest Continuous Increasing Subsequence
 * 
 * Given an unsorted array of integers, find the length of longest continuous
 * increasing subsequence.
 * 
 * Example 1:
 * 
 * Input: [1,3,5,4,7] Output: 3 Explanation: The longest continuous increasing
 * subsequence is [1,3,5], its length is 3. Even though [1,3,5,7] is also an
 * increasing subsequence, it's not a continuous one where 5 and 7 are separated
 * by 4.
 * 
 * Example 2:
 * 
 * Input: [2,2,2,2,2] Output: 1 Explanation: The longest continuous increasing
 * subsequence is [2], its length is 1.
 * 
 * Note: Length of the array will not exceed 10,000.
 * 
 */

public class Solution {
  public int findLengthOfLCIS(int[] nums) {
    if (nums.length == 0) {
      return 0;
    }
    int start = 0;
    int maxLength = 1;
    for (int i = 1; i < nums.length; i++) {
      if (nums[i] > nums[i - 1]) {
        int currentLength = i - start + 1;
        if (currentLength > maxLength) {
          maxLength = currentLength;
        }
      } else {
        start = i;
      }
    }
    return maxLength;
  }

  public static void main(String[] args) {
    Solution s = new Solution();
    int[] input1 = { 1, 3, 5, 4, 7 };
    int output1 = s.findLengthOfLCIS(input1);
    System.out.println("output1=" + output1);

    int[] input2 = { 2, 2, 2, 2, 2 };
    int output2 = s.findLengthOfLCIS(input2);
    System.out.println("output2=" + output2);
  }
}

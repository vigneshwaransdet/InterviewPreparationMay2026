package interviewPreparationMay2026.Week1WarmUp;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

/*
https://leetcode.com/problems/maximum-average-subarray-i/description/
643. Maximum Average Subarray I
You are given an integer array nums consisting of n elements, and an integer k.
Find a contiguous subarray whose length is equal to k that has the maximum average value and return this value. Any answer with a calculation error less than 10-5 will be accepted.
Example 1:
Input: nums = [1,12,-5,-6,50,3], k = 4
Output: 12.75000
Explanation: Maximum average is (12 - 5 - 6 + 50) / 4 = 51 / 4 = 12.75
Example 2:
Input: nums = [5], k = 1
Output: 5.00000
Constraints:
n == nums.length
1 <= k <= n <= 105
-104 <= nums[i] <= 104
 */

public class Maximum_Average_Subarray_I_643 {
    @Test
    public void test01() {
        int[]  nums = {1,12,-5,-6,50,3};
        int k = 4;
        assertEquals(findMaxAverage(nums,k),12.75);
    }

    @Test
    public void test02() {
        int[]  nums = {5};
        int k = 1;
        assertEquals(findMaxAverage(nums,k),5.0);
    }

    @Test
    public void test03() {
        int[]  nums = {9,7,3,5,6,2,0,8,1,9};
        int k = 6;
        assertEquals(findMaxAverage(nums,k),4.333333333333333);
    }

    @Test
    public void test04() {
        int[]  nums = {4,0,4,3,3};
        int k = 5;
        assertEquals(findMaxAverage(nums,k),2.80000);
    }

    public double findMaxAverage(int[] nums, int k) {
        int cSum = 0, mSum = Integer.MIN_VALUE;
        double resSum = 0.0;
        for (int i = 0; i < k; i++) {
            cSum += nums[i];
        }
        if(k==1 || !(k>nums.length)) {
            mSum = cSum;
            resSum = (double) mSum/k;
        }
        for(int i = k; i < nums.length; i++) {
            cSum = cSum - nums[i-k] + nums[i];
            mSum = Math.max(cSum, mSum);
        }
        resSum = (double) mSum/k;
        return resSum;
    }
}

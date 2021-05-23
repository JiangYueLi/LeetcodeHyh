package LeetCode;

import java.util.ArrayList;
import java.util.List;

public class Leetcode448 {
    public List<Integer> findDisappearredNumbers(int[] nums) {
        List<Integer> results = new ArrayList<Integer>();
        for (int i = 0; i < nums.length; i++) {
            if (nums[Math.abs(nums[i]) - 1] > 0) {
                nums[Math.abs(nums[i]) - 1] = -nums[Math.abs(nums[i]) - 1];
            }
        }
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > 0) {
                results.add(i + 1);
            }
        }
        return results;
    }
}

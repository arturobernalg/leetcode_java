package medium.Sum3Closest;

import java.util.Arrays;

public class Sum3Closest {

    public static void main(String arg[]) {

        // Sum3Closest.threeSumClosest(new int[]{-1,2,1,-4},1);
        //Sum3Closest.threeSumClosest(new int[]{0,0,0},1);
        Sum3Closest.threeSumClosest(new int[]{4, 0, 5, -5, 3, 3, 0, -4, -5}, -2);

    }

    public static int threeSumClosest(int[] nums, int target) {

        Arrays.sort(nums);

        int result = Integer.MAX_VALUE;
        for (int i = 0; i < nums.length; i++) {

            int left = i + 1;
            int right = nums.length - 1;

            while (left < right) {

                int count = nums[left] + nums[right] + nums[i];
                if (count == target) {
                    return count;
                }
                result = Math.abs(result) > Math.abs(target - count) ? target - count : result;
                if (count < target) {
                    left++;
                } else {
                    right--;
                }
            }
        }

        return target - result;
    }
}

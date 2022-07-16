package hard.MedianTwoSortedArrays;

import java.util.Arrays;

public class MedianTwoSortedArrays {

    public static void main(String[] arg) {
        MedianTwoSortedArrays.findMedianSortedArrays(new int[]{1, 3}, new int[]{2});
    }


    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {

        int[] result = concat(nums1, nums2);  //resultant array of size first array and second array
        Arrays.sort(result);

        double median;
        if (result.length % 2 == 0) {
            median = (result[result.length / 2] + result[result.length / 2 - 1]) / 2d;
        } else {
            median = result[result.length / 2];
        }

        return median;
    }

    public static int[] concat(int[] first, int[] second) {
        int[] result = Arrays.copyOf(first, first.length + second.length);
        System.arraycopy(second, 0, result, first.length, second.length);
        return result;
    }
}

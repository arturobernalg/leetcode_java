package easy.LongestCommonPrefix;

import java.util.Arrays;

public class LongestCommonPrefix {

    public static void main(String[] arg) {
        // LongestCommonPrefix.longestCommonPrefix(new String[]{"flower", "flow", "flight"});
        LongestCommonPrefix.longestCommonPrefix(new String[]{"", "b"});
    }

    public static String longestCommonPrefix(String[] strs) {

        Arrays.sort(strs);
        char[] chars = strs[0].toCharArray();
        char[] last = strs[strs.length - 1].toCharArray();
        String result = "";

        for (int i = 0; i < chars.length; i++) {

            if (chars[i] == last[i]) {
                result = result + chars[i];
            } else {
                break;
            }
        }

        return result;

    }
}

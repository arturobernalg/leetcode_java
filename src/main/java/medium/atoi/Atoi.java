package medium.atoi;

public class Atoi {

    public static void main(String arg[]) {
        assert Atoi.myAtoi("   -42") ==-42;
        assert (Atoi.myAtoi("3.14159") == 3);
        assert (Atoi.myAtoi("20000000000000000000") == 2147483647);
    }

    public static int myAtoi(String s) {

        s = s.trim();
        char[] words = s.toCharArray();
        String newInt = "";
        for (int i = 0; i < words.length; i++) {

            if (i == 0) {
                if (words[i] == '+' || words[i] == '-') {
                    newInt = newInt + words[i];
                    continue;
                } else if (!Character.isDigit(words[i])) {
                    return 0;
                }
            }
            if (Character.isDigit(words[i])) {
                newInt = newInt + words[i];
            } else {
                break;
            }
        }
        double value;
        try {
            value = Double.parseDouble(newInt);
        } catch (Exception e) {
            return 0;
        }

        if (value > Integer.MAX_VALUE) {
            return Integer.MAX_VALUE;
        } else if (value < Integer.MIN_VALUE) {
            return Integer.MIN_VALUE;
        }

        return Integer.parseInt(newInt);
    }
}

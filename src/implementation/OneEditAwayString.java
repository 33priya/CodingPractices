package implementation;

public class OneEditAwayString {
    public static boolean isOneEditAway(String a, String b) {
        if (a.length() - b.length() >= 2 || b.length() - a.length() >= 2) {
            return false;
        } else if (a.length() == b.length()) {
            return isOneAwaySameLength(a, b);
        } else if (a.length() > b.length()) {
            return isOneAwayDiffLength(a, b);
        } else {
            return isOneAwayDiffLength(b, a);
        }
    }

    private static boolean isOneAwayDiffLength(String s1, String s2) {
        int countDifference = 0;
        int index = 0;

        while (index < s2.length()) {
            if (s1.charAt(index + countDifference) == s2.charAt(index)) {
                ++index;
            } else {
                ++countDifference;
                if (countDifference > 1) {
                    return false;
                }
            }
        }

        return true;
    }

    private static boolean isOneAwaySameLength(String a, String b) {
        int countDifference = 0;
        for (int i = 0; i < a.length(); ++i) {
            if (a.charAt(i) != b.charAt(i)) {
                ++countDifference;
                if (countDifference > 1) {
                    return false;
                }
            }
        }

        return true;
    }
}

package leetcode;

public class _5_Longest_Palindromic_Substring {

    public String longestPalindrome(String s) {

        for (int length = s.length(); length > 0; length-- ) {
            for (int start = 0; start <= s.length() - length; start++) {
                if (check(s, start, start + length)) {
                    return s.substring(start, start + length);
                }
            }
        }

        return "";
    }

    private boolean check(String s, int i, int j) {
        int left = i;
        int right = j - 1;

        while (left < right) {
            if (s.charAt(left) != s.charAt(right)) {
                return false;
            }

            left++;
            right--;
        }

        return true;
    }

}

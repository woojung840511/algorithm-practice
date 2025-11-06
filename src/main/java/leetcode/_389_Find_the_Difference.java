package leetcode;

public class _389_Find_the_Difference {

    public char findTheDifference(String s, String t) {

        char result = 0;
        for (char c : t.toCharArray()) {
            result ^= c;
        }
        for (char c : s.toCharArray()) {
            result ^= c;
        }

        return result;
    }

    public static void main(String[] args) {

    }

}

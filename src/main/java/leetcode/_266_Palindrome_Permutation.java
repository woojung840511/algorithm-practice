package leetcode;

import java.util.HashMap;
import java.util.Map;

public class _266_Palindrome_Permutation {

    public static void main(String[] args) {
        String s = "code";
//        String s = "carerac";
        System.out.println(new _266_Palindrome_Permutation().canPermutePalindrome(s));
    }

    public boolean canPermutePalindrome(String s) {
        int unpairedCount = 0;

        Map<Character, Integer> map = new HashMap<>();
        for (char c : s.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }

        for (Character c : map.keySet()) {
            if (map.get(c) % 2 != 0) {
                unpairedCount++;
            }

            if (unpairedCount > 1) {
                return false;
            }
        }

        return true;
    }
}

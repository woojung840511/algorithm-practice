package leetcode;

import java.sql.Array;
import java.util.ArrayList;
import java.util.List;

public class _438 {
    public List<Integer> findAnagrams(String s, String p) {

        List<Integer> startIdxList = new ArrayList<>();

        int[] alphaCountOfP = new int[26];
        for (char c : p.toCharArray()) {
            alphaCountOfP[c - 'a']++;
        }

        int[] countForDiff = new int[26];
        for (int i = 0; i < p.length(); i++){
            countForDiff[s.charAt(i) - 'a']++;
        }

        for (int i = p.length(); i < s.length(); i++) {

            if (isAnagram(alphaCountOfP, countForDiff)) {
                startIdxList.add(i - p.length());
            }

            countForDiff[s.charAt(i) - 'a']--;
            if (i + 1 < s.length()) {
                countForDiff[s.charAt(i + p.length()) - 'a']++;
            }
        }

        return startIdxList;
    }


    private boolean isAnagram(int[] a, int[] b) {
        for (int i = 0; i < 26; i++) {
            if (a[i] != b[i]) {
                return false;
            }
        }
        return true;
    }
}

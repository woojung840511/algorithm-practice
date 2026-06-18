package leetcode;

import java.sql.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class _438 {
    public List<Integer> findAnagrams(String s, String p) {

        if (s.length() < p.length()) return List.of();

        List<Integer> startIdxList = new ArrayList<>();

        int[] checkP = new int[26];
        int[] checkWindow = new int[26];

        for (int i = 0; i < p.length(); i++) {
            checkP[p.charAt(i) - 'a']++;
            checkWindow[s.charAt(i) - 'a']++;
        }

        for (int i = 0; i <= s.length() - p.length(); i++) {
            if (isAnagram(checkP, checkWindow)) {
                startIdxList.add(i);
            }

            checkWindow[s.charAt(i) - 'a']--;
            int nextRightIdx = i + p.length();
            if (nextRightIdx < s.length() ) {
                checkWindow[s.charAt(nextRightIdx) - 'a']++;
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

    public static void main(String[] args) {
        try {
            List<Integer> anagrams = new _438().findAnagrams("cbaebabacd", "abc");
            anagrams.stream().forEach(a -> System.out.println(a));
        } catch (Exception e) {
            e.getStackTrace();
            System.out.println(Arrays.toString(e.getStackTrace()));
        }
    }
}

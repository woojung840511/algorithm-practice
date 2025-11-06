package leetcode;

public class _1768_Merge_Strings_Alternately {
    public String mergeAlternately(String word1, String word2) {
        int i = 0;
        StringBuilder sb = new StringBuilder();

        while(i < word1.length() || i < word2.length()) {

            if (i < word1.length()) {
                sb.append(word1.charAt(i));
            }
            if (i < word2.length()) {
                sb.append(word2.charAt(i));
            }
            i++;
        }

        return sb.toString();
    }

    public static void main(String[] args) {
        String s = new _1768_Merge_Strings_Alternately().mergeAlternately("ab", "pqrs");
        System.out.println(s);
    }
}

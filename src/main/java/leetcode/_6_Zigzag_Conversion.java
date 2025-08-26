package leetcode;

public class _6_Zigzag_Conversion {

    /**
     * 6. Zigzag Conversion https://leetcode.com/problems/zigzag-conversion/
     * <p>
     * Example: Input: s = "PAYPALISHIRING", numRows = 3 Output: "PAHNAPLSIIGYIR"
     */

    public static void main(String[] args) {
//        String s = "PAYPALISHIRING";
//        int numRows = 3;
        String s = "PAYPALISHIRING";
        int numRows = 5;
        String result = new _6_Zigzag_Conversion().convert(s, numRows);
        System.out.println(result); // Expected output: "PAHNAPLSIIGYIR"
    }

    public String convert(String s, int numRows) {
        if (numRows == s.length()) {
            return s;
        }

        int depth = 0;
        int left = 0;
        int sl = s.length();
        int strLengthOfSection = numRows == 1 ? 1 : 2 * numRows - 2;
        int sectionWidth = numRows == 1 ? 1 : numRows - 1;
        int sectionTotalWidth = sl < strLengthOfSection ?
            1 : (sl / strLengthOfSection) * sectionWidth;
        int remainder = (sl % strLengthOfSection) - numRows;
        int extra = remainder < 0 ? 1 : remainder + 1;
        int colNum = sectionTotalWidth + extra;
        char[][] charArray = new char[numRows][colNum];
        int processCnt = 0;

        for (char c : s.toCharArray()) {
            charArray[depth][left] = c;
            int processStatusData = ++processCnt % strLengthOfSection;
            boolean newSection = processStatusData == 0;
            boolean topToBottom = processStatusData < numRows;
            if (newSection) {
                if (depth > 0) {
                    depth--;
                }
                left++;
            } else if (topToBottom) {
                depth++;
            } else {
                depth--;
                left++;
            }
        }

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < numRows; i++) {
            for (int j = 0; j < colNum; j++) {
                if (charArray[i][j] != '\u0000') {
                    sb.append(charArray[i][j]);
                }
            }
        }
        return sb.toString();
    }
}

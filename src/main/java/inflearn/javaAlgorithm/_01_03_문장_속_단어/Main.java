package inflearn.javaAlgorithm._01_03_문장_속_단어;

import java.util.Scanner;

/**
 * 3. 문장 속 단어
 * 첫 줄에 가장 긴 단어를 출력한다. 가장 길이가 긴 단어가 여러개일 경우 문장속에서 가장 앞쪽에 위치한 단어를 답으로 합니다.
 * ex
 *  input : it is time to study
 *  output : study
 */
public class Main {

    // 강사님 풀이
    public String solution(String str) {
        String answer = "";
        int max = Integer.MIN_VALUE, pos;

        while ((pos = str.indexOf(" ")) != -1) {
            String temp = str.substring(0, pos);
            int tempLength = temp.length();
            if (tempLength > max) {
                answer = temp;
                max = tempLength;
            }
            str = str.substring(pos + 1);
        }
        if (str.length() > answer.length()) answer = str;

        return answer;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        System.out.println(new Main().solution(str));
    }
}

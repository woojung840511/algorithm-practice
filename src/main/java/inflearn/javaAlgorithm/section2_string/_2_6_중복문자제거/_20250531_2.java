package inflearn.javaAlgorithm.section2_string._2_6_중복문자제거;

import java.util.Scanner;

public class _20250531_2 {
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        String s = in.next();

        String answer = "";
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);

            if (!answer.contains( String.valueOf(c) )) {
                answer += c;
            }
        }
        System.out.println(answer);
        return ;
    }

}

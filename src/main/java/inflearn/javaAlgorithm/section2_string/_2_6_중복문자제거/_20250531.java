package inflearn.javaAlgorithm.section2_string._2_6_중복문자제거;

import java.util.Scanner;

public class _20250531 {
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        String s = in.next();
        StringBuilder sb = new StringBuilder();
        for (char c : s.toCharArray()) {
            if (sb.indexOf(String.valueOf(c)) == -1) {
                sb.append(c);
            }
        }
        System.out.println(sb);
        return ;
    }

}

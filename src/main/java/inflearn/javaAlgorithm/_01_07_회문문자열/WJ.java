package inflearn.javaAlgorithm._01_07_회문문자열;

import java.util.Scanner;

public class WJ {
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        String s = in.nextLine().toLowerCase();
        String answer = "YES";

        int i = 0;
        while(i <= s.length()/2) {
            char right = s.charAt(i);
            char left = s.charAt(s.length() - i - 1);
            if (right != left) {
                answer = "NO";
            }
            i++;
        }

        System.out.println(answer);
        return ;
    }
}

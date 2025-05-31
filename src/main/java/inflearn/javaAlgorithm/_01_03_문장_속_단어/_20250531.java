package inflearn.javaAlgorithm._01_03_문장_속_단어;

import java.util.Arrays;
import java.util.Scanner;

public class _20250531 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        String sentence = in.nextLine();
        String[] words = sentence.split(" ");

        String answer = "";
        int maxlength = 0;

        for (String word : words) {
            if (word.length() > maxlength) {
                maxlength = word.length();
                answer = word;
            }
        }

        System.out.println(answer);

        return ;
    }

}

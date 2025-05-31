package inflearn.javaAlgorithm._01_04_단어_뒤집기;

import java.util.Scanner;

public class _20250531 {
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        int i = in.nextInt(); // 숫자만 읽고 개행문자(\n)는 버퍼에 남겨둠
        for (int j = 0; j < i; j++){
            String word = in.next();
//            String word = in.nextLine(); // 남은 개행문자를 읽어서 빈 문자열 반환

            char[] chars = new char[word.length()];
            int pos = word.length()-1;
            int index = 0;
            while (pos >= 0) {
                chars[index] = word.charAt(pos);
                index++;
                pos--;
            }
            System.out.println(new String(chars));
        }
        return ;
    }
}

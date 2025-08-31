package inflearn.javaAlgorithm.section2_string._2_10_문자거리;

import java.util.Scanner;

public class _2025_0602 {
    //teachermode e  1 0 1 2 1 0 1 2 2 1 0


    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        String str = in.next();
        String target = in.next();

        int[] ints = new int[str.length()];

        int distance = 0;
        for (int i = 0; i < str.length(); i++) {
            String current = str.substring(i, i + 1);
            if (current.equals(target)) {
                ints[i] = distance;
            } else {
                distance ++;
                

                for (int j = i - 1; j >= i/2 ; j--) {
                    ints[j] = distance--;
                }

            }
        }

        return ;
    }
}

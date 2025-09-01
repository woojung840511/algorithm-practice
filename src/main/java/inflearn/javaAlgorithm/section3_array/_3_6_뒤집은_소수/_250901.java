package inflearn.javaAlgorithm.section3_array._3_6_뒤집은_소수;

import java.util.Scanner;

public class _250901 {
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        int total = in.nextInt();

        for (int i = 0; i < total; i++) {
            int num = in.nextInt();

            num = getReversedNum(num);

            // 출력
        }


        return ;
    }

    private static int getReversedNum(int num){

        int reversedNum = 0;
        while (num != 0) {
            reversedNum = reversedNum * 10 + num % 10;
            num /= 10;
        }

        return reversedNum;
    }


}

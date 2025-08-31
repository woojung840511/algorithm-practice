package inflearn.javaAlgorithm.section3_array._3_7_점수계산;

import java.util.Scanner;

public class _250901 {
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        int gameCount = in.nextInt();

        int[] InfoA  = new int[gameCount];
        int[] InfoB  = new int[gameCount];

        for (int i = 0; i < gameCount; i++) {
            InfoA[i] = in.nextInt();
        }

        for (int i = 0; i < gameCount; i++) {
            InfoB[i] = in.nextInt();
        }

        for (int i = 0; i < gameCount; i++) {
            System.out.println(getGameResult(InfoA[i], InfoB[i]));
        }

        return ;
    }

    public static char getGameResult(int a, int b) {

        if (a < 1 || a > 3 || b < 1 || b > 3 ) {
            throw new IllegalArgumentException();
        }

        char winner = 0;
        // 1 : 가위
        // 2 : 바위
        // 3 : 보

        if (a == b) { // 둘다 같은 것
            winner = 'D';

        } else if (a == 1) { // a가 가위

            winner = (b == 3) ? 'A' : 'B'; // b가 보?

        } else if(a == 2) { // a가 바위

            winner = (b == 1) ? 'A' : 'B'; // b가 가위?

        } else if(a == 3) { // a가 보

            winner = (b == 2) ? 'A' : 'B'; // b가 바위?
        }

        return winner;
    }
}

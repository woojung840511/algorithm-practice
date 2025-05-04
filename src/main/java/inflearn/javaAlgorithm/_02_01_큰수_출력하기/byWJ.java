package inflearn.javaAlgorithm._02_01_큰수_출력하기;

import java.util.Scanner;

public class byWJ {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int[] ints = new int[in.nextInt()];

        for (int i = 0; i < ints.length; i++) {
            ints[i] = in.nextInt();
        }

        for (int i = 0; i < ints.length; i++) {
            if (i == 0) {
                System.out.print(ints[i] + " ");
            } else {
                if (ints[i] > ints[i - 1]) {
                    System.out.print(ints[i] + " ");
                }
            }
        }
        return ;
    }
}

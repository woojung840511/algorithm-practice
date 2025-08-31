package inflearn.javaAlgorithm.section3_array._3_5_소수_에라스토스체;

import java.util.Scanner;

public class _250831 {
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        int total = in.nextInt();
        int[] arr = new int[total];
        int resultCount = 0;

        for (int i = 1; i < total; i++) {
            arr[i] = i + 1;
        }

        for (int i = 1; i < total; i++) {
            if (arr[i] == 0) continue;

            for (int j = i + 1; j < total; j++) {
                if (arr[j] == 0) continue;
                if (arr[j] % arr[i] == 0) {
                    arr[j] = 0;
                }
            }
        }

        for (int i = 0; i < total; i++) {
            if (arr[i] != 0) resultCount++;
        }

        System.out.print(resultCount);
        return ;
    }
}

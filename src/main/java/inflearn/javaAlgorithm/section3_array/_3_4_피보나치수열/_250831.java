package inflearn.javaAlgorithm.section3_array._3_4_피보나치수열;

import java.util.Scanner;

public class _250831 {
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        int total = in.nextInt();
        int[] arr = new int[total];
        arr[0] = 1;
        arr[1] = 1;

        for (int i = 2; i < total; i++) {
            arr[i] = arr[i-1] + arr[i-2];
        }

        for (int i : arr) {
            System.out.print(i + " ");
        }
        return ;
    }
}

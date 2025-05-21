package inflearn.javaAlgorithm._03_04_피보나치수열;

import java.util.Scanner;

public class Main {

    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        int input = in.nextInt();
        int[] nums = new int[input];
        nums[0] = 1;
        nums[1] = 1;

        for (int i = 2; i < input; i++) {
            nums[i] = nums[i-1] + nums[i-2];
        }

        for (int i = 0; i < input; i++) {
            System.out.print(nums[i] + " ");
        }

        return ;
    }
}

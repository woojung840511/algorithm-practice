package inflearn.javaAlgorithm._03_05_소수;

import java.util.Scanner;

public class byWJ {

    /*
    추가 개선사항
    // 2는 첫 번째 소수
    if (n >= 2) answer = 1;

    // 홀수만 검사 (짝수는 2의 배수이므로 2를 제외하고 모두 합성수)
    for (int i = 3; i <= n; i += 2) {  // 3, 5, 7, 9, ... 검사
        if (ch[i] == 0) {  // i가 소수라면
            answer++;
            // i의 배수 중 홀수 배수만 표시 (짝수 배수는 이미 2의 배수로 표시됨)
            for (int j = i*i; j <= n; j += i*2) {
                ch[j] = 1;
            }
        }
    }
     */
    public int solution(int n) {
        // 1부터 n까지의 소수의 개수를 출력하기
        int answer = 0;
        int[] ch = new int[n+1];
        for (int i = 2; i <= n; i++) {
            if (ch[i] == 0) {
                answer++;
                for (int j = i * 2; j <= n; j = j + i) {
                    ch[j] = 1;
                }
            }
        }
        return answer;
    }


    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int answer = new byWJ().solution(n);
        System.out.println(answer);
        in.close();
    }
}

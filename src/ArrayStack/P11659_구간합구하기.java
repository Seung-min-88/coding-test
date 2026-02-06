package ArrayStack;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class P11659_구간합구하기 {
    public static void main(String[] args) throws IOException {
        // N개의 수가 주어졌을 때 i번째 수에서 j번쨰 수 까지의 합을 구하시오
        // 첫번째 줄에 n개의 수와 합을 구해야 하는 횟수 m을
        // 두번째 줄에 n개의 수가 주어지고
        // 3번째 줄부터는 m개의 줄에 합을 구하는 구간 i,j가 주어진다
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int suNum = Integer.parseInt(st.nextToken());
        int quizNum = Integer.parseInt(st.nextToken());

        // 합 배열 생성
        long[] S = new long[suNum + 1]; // +1을 한 이유는 배열은 0번째부터 생성되기에 편의상 +1을 해서 간단하게 풀기 위해서

        st = new StringTokenizer(br.readLine());
        for(int i = 1; i <= suNum; i++){
            S[i] = S[i-1] + Integer.parseInt(st.nextToken());
        }
        // 구간 합 계산
        for(int q = 0; q < quizNum; q++){
            st = new StringTokenizer(br.readLine());
            int i = Integer.parseInt(st.nextToken());
            int j = Integer.parseInt(st.nextToken());
            System.out.println(S[j] - S[i - 1]);
        }
    }
}

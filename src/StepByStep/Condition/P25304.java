package StepByStep.Condition;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class P25304 {
    public static void main(String[] args) throws IOException {
        //첫째 줄에는 영수증에 적힌 총 금액 x가 주어진다.
        //둘째 줄에는 영수증에 적힌 구매한 물건의 종류의 수 n이 주어진다.
        //이후 n개의 줄에는 각 물건의 가격 a와 개수 b가 공백을 사이에 두고 주어진다.
        //구매한 물건의 가격과 개수로 계산한 총 금액이 영수증에 적힌 총 금액과 일치하면 Yes를 출력한다. 일치하지 않는다면 No를 출력한다.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int x = Integer.parseInt(br.readLine());
        int n = Integer.parseInt(br.readLine());
        int total = 0;

        for (int i = 1; i <= n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());

            total += a * b;
        }
        if (x == total) {
            System.out.println("Yes");
        } else  {
            System.out.println("No");
        }
    }
}

package StepByStep.Condition;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P8393 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int total;

        total = n * (n + 1) / 2;

        System.out.println(total);

//        // 반복문 사용
//        for (int i = 1; i <= n; i++) {
//            total += (n+1) - i;
//        }
//        System.out.println(total);

    }
}

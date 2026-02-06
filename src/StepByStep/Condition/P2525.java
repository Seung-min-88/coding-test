package StepByStep.Condition;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class P2525 {
    public static void main(String[] args) throws IOException {
        // 첫 줄에 현재 시각이 주어지고 두번째 줄에 요리 시간이 주어진다
        // 출력에선 요리 완료 시간을 출력
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int H = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int T = Integer.parseInt(br.readLine());

        M += T;
        H += M / 60;
        M %= 60;
        H %= 24;
        System.out.println(H + " " + M);
    }
}

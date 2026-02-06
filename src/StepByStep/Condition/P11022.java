package StepByStep.Condition;

import java.io.*;
import java.util.StringTokenizer;

public class P11022 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());
        int total;
        // 누적으로 합을 더해야하는 상황이 아니면 0으로 초기화를 안해도 된다.

        for (int i = 1; i <= n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());

            total = a + b;

            bw.write("Case #" + i + ": " + a + " + " + b + " = " + total +"\n");
        }
        bw.flush();
    }
}

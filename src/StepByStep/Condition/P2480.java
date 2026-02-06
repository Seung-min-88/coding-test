package StepByStep.Condition;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class P2480 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        int c = Integer.parseInt(st.nextToken());


        // 이게 조금 헷갈리는게 같은 수를 곱을 해야하니깐 같은 수를 변수로 하나 만드어서 지정해야할긋 하기도 하고
        // 그리고 두개만 같을 때가 젤 어려운듯
        int s;

        if (a == b && a == c) {
            s = 10000 + (a * 1000);
        } else if (a == b) {
            s = 1000 + (a * 100);
        } else if (a == c) {
            s = 1000 + (a * 100);
        } else if (b == c) {
            s = 1000 + (b * 100);
        } else {
            int max = Math.max(a, Math.max(b, c));
            s = max * 100;
        }

        System.out.println(s);
    }
}

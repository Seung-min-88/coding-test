package StepByStep.Condition;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class P1330 {
    public static void main(String[] args) throws IOException {
        // 첫째 줄에 A와 B가 주어진다. A와 B는 공백 한 칸으로 구분되어져 있다.
        //첫째 줄에 다음 세 가지 중 하나를 출력한다.
        //A가 B보다 큰 경우에는 '>'를 출력한다.
        //A가 B보다 작은 경우에는 '<'를 출력한다.
        //A와 B가 같은 경우에는 '=='를 출력한다.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        if (N > M) {
            System.out.println(">");
        } else if (N < M) {
            System.out.println("<");
        } else {
            System.out.println("==");
        }
    }
}

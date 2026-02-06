package StepByStep.Four_Operations;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class P1000 {
    public static void main(String[] args) throws IOException {
        // 두 정수 A와 B를 입력받은 다음, A+B를 출력하는 프로그램을 작성하시오.
        // 첫째 줄에 A와 B가 주어진다. (0 < A, B < 10)
//        Scanner sc = new Scanner(System.in);
//        int a = sc.nextInt();
//        int b = sc.nextInt();

        // 더 빠르게
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());

        System.out.println(a + b);
    }
}

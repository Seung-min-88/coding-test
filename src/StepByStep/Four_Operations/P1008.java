package StepByStep.Four_Operations;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class P1008 {
    public static void main(String[] args) throws IOException {
        // 두 정수 A와 B를 입력받은 다음, A/B를 출력하는 프로그램을 작성하시오.
        // 첫째 줄에 A/B를 출력한다. 실제 정답과 출력값의 절대오차 또는 상대오차가 10-9 이하이면 정답이다.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        double a = Integer.parseInt(st.nextToken());
        double b = Integer.parseInt(st.nextToken());

        System.out.println(a/b);

        // 반올림 메소드
        // 1. Math.round()
//        double num = 111.12345;
//
//        double test = Math.round(num);
//        System.out.println(test); // 라운드는 소수점 첫째자리 기준으로 모두 올리거나 내리는 메서드이다.
//
//        // Math.round()는 소수 첫째자리 반올림 해주지만
//        // 다음과 같은 방법으로 여러 소수점 자리를 표현할 수 있다.
//        // 소수점 둘째자리 까지
//        double result2 = Math.round(num * 100) / 100.0;
//        System.out.println(result2);
//        // 소수점 셋째자리 까지
//        double result3 = Math.round(num * 1000) / 1000.0;
//        System.out.println(result3);

        // 2. String.format()
//        double num = 111.12345;
//
//        // 정수처럼 표현
//        String result4 = String.format("%.0f", num);
//        System.out.println(result4);
//        // 소수점 첫째자리 까지
//        String result5 = String.format("%.1f", num);
//        System.out.println(result5);
//        // 소수점 둘째자리 까지
//        String result6 = String.format("%.2f", num);
//        System.out.println(result6);
//        // 소수점 셋째자리 까지
//        String result7 = String.format("%.3f", num);
//        System.out.println(result7);
    }
}

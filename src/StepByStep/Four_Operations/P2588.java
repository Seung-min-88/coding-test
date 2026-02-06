package StepByStep.Four_Operations;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P2588 {
    public static void main(String[] args) throws IOException {
        // (1)과 (2)위치에 들어갈 세 자리 자연수가 주어질 때 (3), (4), (5), (6)위치에 들어갈 값을 구하는 프로그램을 작성하시오.
        // 첫째 줄에 (1)의 위치에 들어갈 세 자리 자연수가, 둘째 줄에 (2)의 위치에 들어갈 세자리 자연수가 주어진다.
        // 첫째 줄부터 넷째 줄까지 차례대로 (3), (4), (5), (6)에 들어갈 값을 출력한다.

        // b를 문자열로 받아 charAt로 하나씩 짤라 곱하는 방식
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        int a = Integer.parseInt(br.readLine());
//        String b = br.readLine();
//
//        System.out.println(a * (b.charAt(2)- '0'));
//        System.out.println(a * (b.charAt(1)- '0'));
//        System.out.println(a * (b.charAt(0)- '0'));
//        System.out.println(a * Integer.parseInt(b));

        // b를 int로 받아 자릿수별로 짤라서 곱하는 방식
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(br.readLine());
        int b = Integer.parseInt(br.readLine());

        System.out.println(a * (b%10));
        System.out.println(a * ((b%100)/10));
        System.out.println(a * (b/100));

        // % 몫을 남김
        // / 나누고 난 나머지를 남김
    }
}

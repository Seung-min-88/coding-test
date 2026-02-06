package StepByStep.Condition;

import java.io.*;
import java.util.StringTokenizer;

public class P10952 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        //
        StringTokenizer st;

        while (true) {
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());

            if (a == 0 && b == 0){
                break;
            }
            System.out.println(a + b); // 96ms println을 통해 입력값을 바로바로 출력하는 형태 값이 적을떄는 이 방식이 제일 빠름
        }
//        StringTokenizer st;
//        StringBuilder sb = new StringBuilder();
//
//        while (true) {
//            st = new StringTokenizer(br.readLine());
//            int a = Integer.parseInt(st.nextToken());
//            int b = Integer.parseInt(st.nextToken());
//
//            if (a == 0 && b == 0) {
//                break;
//            }
//            sb.append(a+b).append("\n");
//        }
//        System.out.println(sb); // 104ms StringBuilder를 통해 0 0이 나오기전까지의 값을 다 저장했다가 0 0이 입력되면 출력
//        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
//        StringTokenizer st;
//
//        while (true) {
//            st = new StringTokenizer(br.readLine());
//            int a = Integer.parseInt(st.nextToken());
//            int b = Integer.parseInt(st.nextToken());
//
//            if (a == 0 && b == 0) {
//                break;
//            }
//            bw.write(a + b + "\n");
//        }
//        bw.flush(); // 108ms BufferedWriter로 출력을 통해 0 0이 입력되기 전까지의 값을 저장하고 한번에 출력하는방식
    }
}

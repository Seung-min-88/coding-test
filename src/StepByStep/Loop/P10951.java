package StepByStep.Loop;

import java.io.*;
import java.util.StringTokenizer;

public class P10951 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();

        String str;

        // 이 문제는 종료조건이 없다
        // 즉 입력에서 더이상 읽을 수 있는 데이터가 없을 때 종료하라는 뜻
        // 이렇게 데이터가 더 이상 존재하지 않을 때 EOF(End of File)
        while ((str= br.readLine()) != null) {
            st = new StringTokenizer(str);
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());

            sb.append(a+b).append("\n");
        }
        System.out.print(sb); // 96ms
//        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
//        StringTokenizer st;
//
//        String s;
//        while ((s = br.readLine()) != null) {
//            st = new StringTokenizer(s);
//            int a = Integer.parseInt(st.nextToken());
//            int b = Integer.parseInt(st.nextToken());
//
//            bw.write(a+b+"\n");
//        }
//        bw.flush(); // 104ms
    }
}

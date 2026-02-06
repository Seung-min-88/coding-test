package StepByStep.Condition;

import java.io.*;

public class P2439 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        StringBuilder sb = new StringBuilder();
//        int n = Integer.parseInt(br.readLine());
//
//        for (int i = 1; i <= n; i++) {
//            for (int j = 1; j <= n-i; j++) {
//                sb.append(" ");
//            }
//            for (int k = 1; k <= i; k++) {
//                sb.append("*");
//            }
//            sb.append("\n");
//        }
//        System.out.println(sb); == 108ms
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n-i; j++) {
                bw.write(" ");
            }
            for (int k =1; k <= i; k++) {
                bw.write("*");
            }
            bw.write("\n");
        }
        bw.flush();
        // 104ms
    }
}

package StepByStep.Condition;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P25314 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        for (int i = 0; i < N; i++) {
            if (i % 4 == 0) {
                System.out.print("long ");
            }
        }
        System.out.println("int");
    }
}

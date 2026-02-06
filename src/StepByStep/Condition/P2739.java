package StepByStep.Condition;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P2739 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(br.readLine());

        int s;

        for (int i = 1; i <= 9; i++) {
            s = a * i;
            System.out.println(a + " * " + i + " = " + s);
        }

    }
}

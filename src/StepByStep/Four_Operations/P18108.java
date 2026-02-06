package StepByStep.Four_Operations;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class P18108 {
    public static void main(String[] args) throws IOException {
        // 1998년생인 내가 태국에서는 2541년생?!
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int Bage = Integer.parseInt(st.nextToken());

        int Sage = 543;

        System.out.println(Bage - Sage);
    }
}

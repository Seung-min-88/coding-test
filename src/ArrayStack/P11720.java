package ArrayStack;

import java.util.Scanner;

public class P11720 {
    public static void main(String[] args) {
        // n개의 숫자가 공백 없이 쓰여 있다. 이 숫자를 모두 합해 출력하는 프로그램을 작성하라
        // [입력] 1번째 줄에 숫자 n(1<= n <= 10), 2번째 줄에 숫자 n개가 공백 없이 주어진다.
        // ex) (입력) 25 / 7000000000000000000000000  >  (출력) 7

        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        String sNum = sc.next();
        char[] cNum = sNum.toCharArray();

        int sum = 0;
        for(int i = 0; i < cNum.length; i++){
            sum += cNum[i] - '0'; // char에서 [0~9까지의 숫자들에서 0을 뺴면 아스키코드 값에 의해 그대로 0~9까지의 수가 나옴]
        }
        System.out.println(sum);
    }
}

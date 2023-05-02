package BaekJoon.src.java.bronze.B2.B2_15829_Hashing;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


/**
 * BaekJoon
 * https://www.acmicpc.net/problem/15829
 * Problem: Hashing
 * Level: B2
 * Algorithm: 모듈러 연산
 */

/**
 * 모듈러 연산의 성질..
 * (A+B) mod C = (A mod C + B mod C) mod C
 * (A - B) mod C = (A mod C - B mod C) mod C
 * (A * B) mod C = (A mod C * B mod C) mod C
 */
public class Main {
    static final int disjoint = 1234567891;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int size = Integer.parseInt(br.readLine());
        String word = br.readLine();

        long answer = 0;
        long pow = 1; //시작은 31^0
        for (int i = 0; i < size; i++) {
            int num = word.charAt(i) - 'a' + 1;
            answer += (num * pow) % disjoint;
            pow = pow*31%disjoint;
            //answer += num * Math.pow(31,i);
        }

        System.out.println(answer%disjoint);
    }
}

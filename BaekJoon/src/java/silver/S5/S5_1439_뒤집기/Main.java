package BaekJoon.src.java.silver.S5.S5_1439_뒤집기;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Programmers
 * https://school.programmers.co.kr/learn/courses/30/lessons/1439
 * Problem: 뒤집기
 * Level: S5
 * Algorithm: 문자열
 */
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();

        int cnt1 = 0;
        int cnt2 = 0;

        boolean one = false;
        boolean zero = false;

        for(int i=0; i<str.length(); i++) {
            if(str.charAt(i) == '0') {
                one = false;
                if(zero) continue;
                zero = true;
                cnt1++;
            }else {
                zero = false;
                if(one) continue;
                one = true;
                cnt2++;
            }
        }
        System.out.println(Math.min(cnt1,cnt2));
    }
}

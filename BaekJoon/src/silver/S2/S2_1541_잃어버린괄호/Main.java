package BaekJoon.src.silver.S2.S2_1541_잃어버린괄호;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Programmers
 * https://www.acmicpc.net/problem/1541
 * Problem: 잃어버린 괄호
 * Level: S2
 * Algorithm: 문자열
 */
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        String[] str = s.split("-");

        int answer = 0;

        for(int i=0; i<str.length; i++) {
            String[] arr = str[i].split("\\+");
            if(i == 0) {
                for(String sss : arr) {
                    answer += Integer.parseInt(sss);
                }
            }else {
                for(String sss : arr) {
                    answer -= Integer.parseInt(sss);
                }
            }
        }

        System.out.println(answer);
    }
}

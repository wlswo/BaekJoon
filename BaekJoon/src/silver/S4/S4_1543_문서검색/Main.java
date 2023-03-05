package BaekJoon.src.silver.S4.S4_1543_문서검색;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


/**
 * Programmers
 * https://www.acmicpc.net/problem/1543
 * Problem: 문서검색
 * Level: S4
 * Algorithm: 문자열
 */
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String target = br.readLine();
        String temp = br.readLine();

        int size1 = target.length();
        int size2 = temp.length();

        target = target.replace(temp,"");

        System.out.println( (size1-target.length())/size2 );
    }
}
/**
 * abcababcabc : abc
 * (abc)ab(abc)(abc) -> ab
 * 원래 길이 (11) -> replace 후 길이 (2) = 9개의 길이문자가 바뀜
 * 이는 즉 9개의 길이를 temp 로 나누면 바꾼 단어의 개수를 알 수 있다.
 */

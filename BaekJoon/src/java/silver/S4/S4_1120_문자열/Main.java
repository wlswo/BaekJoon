package BaekJoon.src.java.silver.S4.S4_1120_문자열;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * Programmers
 * https://www.acmicpc.net/problem/1120
 * Problem: 문자열
 * Level: S4
 * Algorithm: 문자열
 */
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine()," ");
        String t1 = st.nextToken();
        String t2  = st.nextToken();

        int answer = Integer.MAX_VALUE;

        int start = 0;
        int end = t1.length();
        for(int i=0; i<t2.length()-t1.length()+1; i++) {
            answer = Math.min(answer, counting(t1,t2.substring(start++,end++)));
        }
        System.out.println(answer);
    }
    public static int counting(String s1, String s2) {
        int sum = 0;
        for(int i=0; i<s1.length(); i++) {
            if(s1.charAt(i) != s2.charAt(i)) sum++;
        }
        return sum;
    }
}

package BaekJoon.src.java.bronze.B3.B3_5073_삼각형과세변;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * Programmers
 * https://www.acmicpc.net/problem/5073
 * Problem: 삼각형과 세 변
 * Level: B3
 * Algorithm: 수학
 */
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        while (true) {

            StringTokenizer st = new StringTokenizer(br.readLine(), " ");

            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            int c = Integer.parseInt(st.nextToken());

            if(a == 0 && b == 0 && c == 0) break;

            int max = Math.max(Math.max(a, b), c);

            if((max == a && b+c <= a) || (max == b && a+c <= b) || (max == c && a+b <= c)) {
                System.out.println("Invalid");
                continue;
            }


            if(a == b && b == c) {
                System.out.println("Equilateral");
                continue;
            }

            if(a == b || a == c || b == c){
                System.out.println("Isosceles");
                continue;
            }

            if(a != b && b != c) {
                System.out.println("Scalene");
            }
        }
    }
}

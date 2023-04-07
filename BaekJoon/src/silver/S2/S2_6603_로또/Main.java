package BaekJoon.src.silver.S2.S2_6603_로또;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;


/**
 * BaekJoon
 * https://www.acmicpc.net/problem/6603
 * Problem: 로또
 * Level: S2
 * Algorithm: 조합론
 */
public class Main {
    static int[] lotto;
    static int[] choice = new int[6];
    static StringBuilder sb;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        while (true) {
            StringTokenizer st = new StringTokenizer(br.readLine()," ");
            int k = Integer.parseInt(st.nextToken());
            if(k == 0)
                return;

            sb = new StringBuilder();
            lotto = new int[k];

            for (int i = 0; i < k; i++) {
                lotto[i] = Integer.parseInt(st.nextToken()) ;
            }

            //집합에서 6가지를 고르는 모든 경우 ,순서유지, 중복되는 조합 제거
            combination(0,0);
            System.out.println(sb);
        }
    }

     static void combination(int start, int depth) {
        if(depth == 6) {
            for(int i=0; i<6; i++) {
                sb.append(choice[i]).append(" ");
            }
            sb.delete(sb.length()-1,sb.length());
            sb.append("\n");

            return;
        }


        for(int i=start; i<lotto.length; i++) {
            choice[depth] = lotto[i];
            combination(i+1, depth+1);
        }
    }
}

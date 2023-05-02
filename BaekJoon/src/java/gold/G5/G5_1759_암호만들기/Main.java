package BaekJoon.src.java.gold.G5.G5_1759_암호만들기;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

/**
 * BaekJoon
 * https://www.acmicpc.net/problem/1759
 * Problem: 암호 만들기
 * Level: G5
 * Algorithm: 조합
 */
public class Main {
    static int L, C;
    static char[] code;
    static char[] password;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        L = Integer.parseInt(st.nextToken()); //암호글자수 L개
        C = Integer.parseInt(st.nextToken()); //C개의 문자

        code = new char[L];
        password = new char[C];

        st = new StringTokenizer(br.readLine()," ");
        for (int i = 0; i < password.length; i++) {
            password[i] = st.nextToken().charAt(0);
        }
        Arrays.sort(password);

        //모든 조합을구한다. 순서는 유지 (순열x)
        dfs(0, 0);
    }

    static void dfs(int start, int idx) {
        if (idx == L) {
            if (check()) {
                System.out.println(code);
            }
            return;
        }

        for (int i = start; i < C; i++) {
            code[idx] = password[i];
            dfs(i + 1, idx + 1);
        }
    }

    private static boolean check() {
        int ja = 0; //자음
        int mo = 0; //모음

        for (char c : code) {
            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
                mo++;
            } else {
                ja++;
            }
        }

        return ja >= 2 && mo >= 1;
    }
}

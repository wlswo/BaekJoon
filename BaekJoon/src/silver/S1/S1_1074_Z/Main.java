package BaekJoon.src.silver.S1.S1_1074_Z;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import java.util.StringTokenizer;

public class Main {
    static int answer = 0;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine()," ");

        int n = Integer.parseInt(st.nextToken());
        int r = Integer.parseInt(st.nextToken()); //행 (y축)
        int c = Integer.parseInt(st.nextToken()); //열 (x축)

        solve((int)Math.pow(2,n),r,c);
        System.out.println(answer);
    }
    static public void solve(int size, int r,int c) {
        if(size == 1) {
             return;
        }
        //1사 분면 (첫시작점이 0,0, 이기때문에 그대로 재귀 )
        if( r < size/2 && c <size/2) {
            solve(size/2,r,c);
        }
        //2사 분면
        if( r < size/2 && size/2 <= c) {
            answer += size*size / 4;
            solve(size/2,r, c - size/2);
        }
        //3사 분면
        if(  size/2 <= r && c < size/2) {
            answer += size*size / 4 * 2;
            solve(size/2,r - size/2,c);
        }
        //4사 분면
        if(  size/2 <= r && size/2 <= c) {
            answer += size*size / 4 * 3;
            solve(size/2,r - size/2,c - size/2);
        }
    }
}

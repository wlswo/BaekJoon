package BaekJoon.src.silver.S5.S5_1652_누울자리를찾아라;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        String[] height = new String[N];
        Arrays.fill(height,"");
        int width_max = 0;
        int height_max = 0;

        for (int i = 0; i < N; i++) {
            String str = br.readLine();
            String[] _width = str.split("X");
            /* 입력과 동시에 가로 길이 최댓값 구하기 */
            for(String s : _width) {
                if(s.length() >=2 ) width_max++;
            }
            /* 세로 문자열 삽입 */
            for(int j=0; j< N; j++) {
                height[j] += String.valueOf(str.charAt(j));
            }
        }
        for(String s : height) {
            for(String ss : s.split("X")){
                if(ss.length() >= 2) height_max++;
            }
        }
        System.out.println(width_max+" "+height_max);
    }
}

/*
    가로는 입력과 동시에 최대값 계산
    세로는 입력과 동시에 값 저장
 */
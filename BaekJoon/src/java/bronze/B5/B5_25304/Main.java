package BaekJoon.src.java.bronze.B5.B5_25304;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    static  StringTokenizer st;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int target = Integer.parseInt(br.readLine());

        int repeat = Integer.parseInt(br.readLine());
        int total = 0;

        for(int i=0; i<repeat; i++) {
             st = new StringTokenizer(br.readLine(), " ");
             total += Integer.parseInt(st.nextToken()) * Integer.parseInt(st.nextToken());
        }

        if(target != total) {
            System.out.println("No");
        }else {
            System.out.println("Yes");
        }
    }
}

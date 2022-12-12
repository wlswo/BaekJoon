package BaekJoon.src.bronze.B5.B5_3003;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public  static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine()," ");
        StringBuilder sb = new StringBuilder();

        for(int i=0; i<6; i++) {
            if(i == 0 || i == 1) {
                int a = Integer.parseInt(st.nextToken());
                sb.append(-a+1+" ");
                continue;
            }
            if(i > 1 && i <5 ) {
                int a = Integer.parseInt(st.nextToken());
                sb.append(-a+2+" ");
                continue;
            }
            int a = Integer.parseInt(st.nextToken());
            sb.append(-a+8);
        }
        System.out.println(sb);
    }
}

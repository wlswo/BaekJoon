package BaekJoon.src.java.bronze.B1.B1_11050_이항계수;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        // N! , (N-K)!, K!
        //N!/( (N-K)! * K! )
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());
        int result = factorial(n)/ ((factorial(n-k)) * factorial(k));
        System.out.println(result);

    }

    static public int factorial(int num) {
        if(num <= 1) {
            return 1;
        }
        return num * factorial(num - 1);
    }

}

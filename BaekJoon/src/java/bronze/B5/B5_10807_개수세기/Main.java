package BaekJoon.src.java.bronze.B5.B5_10807_개수세기;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        int[] arr = new int[201];
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        br.readLine();
        StringTokenizer st= new StringTokenizer(br.readLine()," ");
        while (st.hasMoreElements()) {
            arr[Integer.parseInt(st.nextToken())+100]++;
        }
        int index = Integer.parseInt(br.readLine());
        System.out.println(arr[index+100]);
    }
}
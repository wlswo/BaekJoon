package BaekJoon.src.java.silver.S3.S3_1003_피보나치함수;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Main {
    static int dpZero[] = new int[41];
    static int dpOne[] = new int[41];

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int num = Integer.parseInt(br.readLine());

        dpZero[0] = 1;
        dpZero[1] = 0;
        dpZero[2] = 1;

        dpOne[0] = 0;
        dpOne[1] = 1;
        dpOne[2] = 1;


        for(int i=0; i<num; i++){
            int target = Integer.parseInt(br.readLine());
            sb.append(fibonacci(target));
        }
        System.out.println(sb);

    }
    static public StringBuilder fibonacci(int num) {
        StringBuilder sb = new StringBuilder();
        if (num == 0) {
            return sb.append(dpZero[0]+" "+dpOne[0]+"\n");
        }else if(num == 1) {
            return sb.append(dpZero[1]+" "+dpOne[1]+"\n");
        } else if (num == 2) {
            return sb.append(dpZero[2]+" "+dpOne[2]+"\n");
        }
        for(int i=3; i<=num; i++) {
            dpZero[i] = dpZero[i-1] + dpZero[i-2];
            dpOne[i] = dpOne[i-1] + dpOne[i-2];
        }
        return sb.append(dpZero[num]+" "+dpOne[num]+"\n");
    }

}

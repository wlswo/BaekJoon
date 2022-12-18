package BaekJoon.src.bronze.B2.B2_2920_음계;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int target[] = new int[9];
        for (int i = 0; i < 8; i++) {
            target[i] = Integer.parseInt(st.nextToken());
        }

        String answer = "";

        for(int i=0; i<7; i++){
            if(target[i] == target[i+1] - 1) {
               answer = "ascending";
            }else if(target[i] - 1 == target[i+1] ) {
                answer = "descending";
            }else {
                answer = "mixed";
                break;
            }
        }
        System.out.println(answer);

    }
}

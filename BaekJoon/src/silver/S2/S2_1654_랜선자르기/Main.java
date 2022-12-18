package BaekJoon.src.silver.S2.S2_1654_랜선자르기;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int k = Integer.parseInt(st.nextToken()); /* 랜선 개수 */
        int n = Integer.parseInt(st.nextToken()); /* 필요 랜선 개수 */

        long max = 0;

        int arr[] = new int[k];

        for(int i=0; i<k; i++) {
            arr[i] = Integer.parseInt(br.readLine());

            if(max < arr[i]) max = arr[i];
        }
        max++;

        long min = 1;
        long mid = 0;

        /* 길이 찾기 */
        while (min < max) {

            mid = (min + max) / 2;

            long count = 0;

            for(int i=0; i<k; i++) {
                 count += arr[i]/mid;
            }

            /* 자르는 길이를 줄이기 => 최댓값을 줄이기 */
            if(count < n) {
                max = mid;
            }
            /* 자르는 길이를 늘리기 => 최솟값을 늘리기 */
            else {
                min = mid + 1;
            }
        }
        System.out.println(min - 1);

    }
}

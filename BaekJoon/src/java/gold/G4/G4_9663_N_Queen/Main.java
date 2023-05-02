package BaekJoon.src.java.gold.G4.G4_9663_N_Queen;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class Main {
    static int count = 0;
    static int[] arr;
    static int N ;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        N = Integer.parseInt(br.readLine());
        arr = new int[N];
        nQueen(0);
        System.out.println(count);
    }

    /* 재귀 호출 */
    public static void nQueen(int depth) {
        if(depth == N) {
            count++;
            return;
        }

        for(int i=0; i<N; i++) {
            arr[depth] = i; //depth : 열 , i : 행
            if(possibility(depth)) {
                nQueen(depth + 1);
            }
        }
    }

    /* 각 열마다 배치할수 있는 자리에 배치하기 */
    public static boolean possibility(int column) {
        /* 같은 행에 존재하는지 검사 , 해당 열의 행과 i열의 행이 같은 경우 => 같은 행에 존재하는 경우(일직선)*/
        for(int i=0; i<column; i++) {
           if(arr[column] == arr[i]) {
               return false;
           }

           /* 대각선에 존재하는지 검사 */
           else if (Math.abs(column - i) == Math.abs(arr[column] - arr[i])) {
               return false;
           }
        }

        return true;
    }
}

//인덱스를 '열', 값을 '행'으로 생각하여 1차원 배열로 구현한다. => 2차원 배열을 사용했을때보다 속도의 우위가 존재한다.

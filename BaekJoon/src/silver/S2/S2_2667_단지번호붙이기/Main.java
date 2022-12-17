package BaekJoon.src.silver.S2.S2_2667_단지번호붙이기;

import java.awt.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    static int[][] map;
    static int dx[] = {-1,0,1,0};
    static int dy[] = {0,-1,0,1};
    static ArrayList<Integer> arr = new ArrayList<>();
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        map = new int[n][n];

        for(int i=0; i<n; i++) {
            String str = br.readLine();
            for(int j=0; j<str.length(); j++) {
                map[i][j] = str.charAt(j) - '0';
            }
        }
        int answer = 0;

        for(int i=0; i<n; i++) {
            for(int j=0; j<n; j++) {
                if ( map[j][i] == 1 ) {
                    answer++;
                    bfs(i,j);
                }
            }
        }

        System.out.println(answer);
        Collections.sort(arr);

        for(Integer i : arr) {
            System.out.println(i);
        }

    }

    static public void bfs(int x, int y) {
        int cnt = 0;
        Queue<Point> queue = new LinkedList<>();
        queue.add(new Point(x,y));
        map[y][x] = 0;

        while (!queue.isEmpty()) {
            cnt++;
            Point current = queue.remove();
            int c_x = current.x;
            int c_y = current.y;

            //1. 상하좌우 탐색
            for(int i=0; i<4; i++) {
                int new_x = c_x + dx[i];
                int new_y = c_y + dy[i];

                //2. 맵 밖으로 넘어가는지 체크 + 집이라면
                if ( mapCheck(new_x,new_y) && map[new_y][new_x] == 1) {
                    //3. 방문체크 + 해당 집을 큐에 삽입
                    map[new_y][new_x] = 0;
                    queue.add(new Point(new_x,new_y));
                }
            }
        }
        arr.add(cnt);
    }

    static public boolean mapCheck(int x, int y) {
        if( map.length > x && x >= 0 && map.length > y && y >= 0) {
            return true;
        }
        return false;
    }
}

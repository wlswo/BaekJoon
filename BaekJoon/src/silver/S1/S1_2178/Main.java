package BaekJoon.src.silver.S1.S1_2178;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

/* 미로 찾기 */
public class Main {
    /* 동서남북 체크 */
    static int[] checkX = {0,0,1,-1};
    static int[] checkY = {1,-1,0,0};
    /* 방문 체크*/
    static boolean[][] isChecked;
    /* 미로 */
    static int[][] maze;
    /* N = 세로 , M = 가로 */
    static int N;
    static int M;
    /* 이어지는 노드끼리 구해야함 */
    static Queue<Node> queue = new LinkedList<>();

    /* 좌표를 담을 노드 */
    static class Node {
        int x;
        int y;
        public Node(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }

    public static void main(String[] args) throws  Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine()," ");
        // (2 ≤ N, M ≤ 100)
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        isChecked = new boolean[N][M];
        maze = new int[N][M];
        for(int i=0; i<N; i++){
            String numbers = br.readLine();
            for (int j = 0; j < M; j++) {
                maze[i][j] = Character.getNumericValue(numbers.charAt(j));
            }
        }
        bfs(0,0);
        System.out.println(maze[N-1][M-1]);
    }

   static void bfs(int x, int y) {
        /* 방문한 노드를 큐에 삽입 */
        queue.offer(new Node(x,y));
        /* 방문한 지점 체크 */
        isChecked[y][x] = true;

        while (!queue.isEmpty()) {
            Node node = queue.poll();

            for(int i=0; i<4; i++) {
                int new_x = node.x + checkX[i];
                int new_y = node.y + checkY[i];

                if (RangeCheck(new_x, new_y) && !isChecked[new_y][new_x] && maze[new_y][new_x] == 1) {
                    queue.offer(new Node(new_x,new_y));
                    isChecked[new_y][new_x] = true;

                    maze[new_y][new_x] = maze[node.y][node.x] + 1;
                    if(isChecked[N-1][M-1]) {
                        return;
                    }
                }
            }
        }
    }
    // 맵 밖으로 벗어 나는지 체크
    public static boolean RangeCheck(int x, int y) {
        return ( x >= 0 && x < M && y >= 0 && y < N);
    }

}


/**
 지도 - 2차원 배열
 동서남북 체크 - 동서남북 체크용 배열2개 선언
              0 1 위 / 0 -1 아래 / 1 0 오른쪽 / 1 0 왼쪽
             arr x =  [0,0,1,1]
             arr y = [1,-1,0,0]
 탐색
 <<입력값>>
 110110
 110110
 111111
 111101

 <<노드 탐색 순서>>
 1 2 0 8 9 0
 2 3 0 7 8 0
 3 4 5 6 7 8
 4 5 6 7 0 9
 */
package BaekJoon.src.java.silver.S2.S2_2644_촌수계산;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    /* 연결되어 있는 노드 */
    static int[][] map;
    /* 방문 노드 체크 */
    static int[] visited;
    static int answer = -1;
    static int end ;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int person_cnt = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int start = Integer.parseInt(st.nextToken());
        end = Integer.parseInt(st.nextToken());

        int repeat = Integer.parseInt(br.readLine());
        map = new int[person_cnt + 1][person_cnt + 1];
        visited = new int[person_cnt+1];

        for (int i = 0; i <repeat; i++) {
            st = new StringTokenizer(br.readLine(), " ");
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            map[a][b] = 1;
            map[b][a] = 1;
        }

        dfs(start, 0);
        System.out.println(answer);
    }

    static public void dfs(int node, int depth) {
        if(node == end) {
            answer = depth;
            return;
        }
        //1. 방문한 노드 체크
       visited[node] = 1;

        //2. 인접한 노드 스택에 담고 깊이 들어가기
        for(int i=1; i<visited.length; i++) {
            if(map[node][i] == 1 && visited[i] == 0) {
                dfs(i,depth + 1);
            }
        }
    }
}


/*
9
7 3
7
1 2
1 3
2 7
2 8
2 9
4 5
4 6
        7 -> 2 -> 1 -> 3 ( +3 )
               -> 7 (x)
               -> 8
               -> 9
 */
package beakjoon.bfs;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class N11724 {

    static boolean[] visit;

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int[][] map = new int[N][N];
        visit = new boolean[map.length];

        for (int i = 0; i < M; i++) {
            String[] inputs = br.readLine().split(" ");
            int y = Integer.parseInt(inputs[0]) - 1;
            int x = Integer.parseInt(inputs[1]) - 1;

            map[y][x] = 1;
            map[x][y] = 1;
        }
        int count = 0;

        for (int i = 0; i < visit.length; i++) {
            if (!visit[i]) {
                bfs(map, i);
                count++;
            }
        }

        System.out.println(count);
    }

    private static void bfs(int[][] map, int node) {

        Queue<Integer> que = new LinkedList<>();
        visit[node] = true;
        que.add(node);

        while (!que.isEmpty()) {
            int current = que.remove();
            for (int i = 0; i < map.length; i++) {
                if (map[current][i] == 1 && !visit[i]) {
                    map[current][i] = 0;
                    map[i][current] = 0;
                    visit[i] = true;
                    que.add(i);
                }
            }

        }

    }

}

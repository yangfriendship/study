package beakjoon.bfs;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class N1012 {

    static int count = 0;
    static boolean[][] map;

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int T = Integer.parseInt(br.readLine());
        while (T-- > 0) {
            String[] inputs = br.readLine().split(" ");
            int N = Integer.parseInt(inputs[1]);
            int M = Integer.parseInt(inputs[0]);
            int cnt = Integer.parseInt(inputs[2]);
            map = new boolean[N][M];

            for (int i = 0; i < cnt; i++) {
                String[] point = br.readLine().split(" ");
                int x = Integer.parseInt(point[0]);
                int y = Integer.parseInt(point[1]);
                map[y][x] = true;
            }
            // finish input

            for (int i = 0; i < N; i++) {
                for (int j = 0; j < M; j++) {
                    if (map[i][j]) {
                        search(i, j);
                        count++;
                    }
                }
            }
            System.out.println(count);
            count = 0;
        }
    }

    private static void search(int y, int x) {
        map[y][x] = false;

        if (canMove(y + 1, x) && map[y + 1][x]) {
            search(y + 1, x);
        }
        if (canMove(y - 1, x) && map[y - 1][x]) {
            search(y - 1, x);
        }
        if (canMove(y, x + 1) && map[y][x + 1]) {
            search(y, x + 1);
        }
        if (canMove(y, x - 1) && map[y][x - 1]) {
            search(y, x - 1);
        }
    }

    private static boolean canMove(int y, int x) {
        if (y < 0) {
            return false;
        } else if (x < 0) {
            return false;
        } else if (y >= map.length) {
            return false;
        } else if (x >= map[0].length) {
            return false;
        }
        return true;
    }

}

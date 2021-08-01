package beakjoon.bfs;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class N4963 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = "";
        while (!(input = br.readLine()).equals("0 0")) {
            StringTokenizer st = new StringTokenizer(input);
            int w = Integer.parseInt(st.nextToken());
            int h = Integer.parseInt(st.nextToken());
            int[][] map = new int[h][w];
            int count = 0;

            for (int i = 0; i < h; i++) {
                Integer[] numbers = Arrays.stream(br.readLine()
                    .split(" "))
                    .map(Integer::valueOf)
                    .toArray(Integer[]::new);
                for (int j = 0; j < numbers.length; j++) {
                    map[i][j] = numbers[j];
                }
            }

            for (int i = 0; i < h; i++) {
                for (int j = 0; j < w; j++) {
                    if (map[i][j] == 1) {
                        search(map, i, j);
                        count++;
                    }
                }
            }
            System.out.println(count);

        }
    }

    private static void search(int[][] map, int y, int x) {
        map[y][x] = 0;
        if (canMove(map, y + 1, x)) {
            search(map, y + 1, x);
        }
        if (canMove(map, y - 1, x)) {
            search(map, y - 1, x);
        }
        if (canMove(map, y, x + 1)) {
            search(map, y, x + 1);
        }
        if (canMove(map, y, x - 1)) {
            search(map, y, x - 1);
        }
        // 대각선
        if (canMove(map, y - 1, x - 1)) {
            search(map, y - 1, x - 1);
        }
        if (canMove(map, y + 1, x - 1)) {
            search(map, y + 1, x - 1);
        }
        if (canMove(map, y + 1, x + 1)) {
            search(map, y + 1, x + 1);
        }
        if (canMove(map, y - 1, x + 1)) {
            search(map, y - 1, x + 1);
        }

    }

    private static boolean canMove(int[][] map, int y, int x) {
        int height = map.length;
        int width = map[0].length;

        if (y < 0 || x < 0) {
            return false;
        }
        if (y >= height || x >= width) {
            return false;
        }
        if (map[y][x] != 1) {
            return false;
        }
        return true;
    }

}
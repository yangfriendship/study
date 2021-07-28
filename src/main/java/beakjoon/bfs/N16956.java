package beakjoon.bfs;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class N16956 {

    static final char EMPTY = '.';
    static final char W = 'W';
    static final char S = 'S';
    static int R;
    static int C;
    static boolean stop = false;
    static char[][] map;

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        R = Integer.parseInt(st.nextToken());
        C = Integer.parseInt(st.nextToken());

        map = new char[R][C];

        for (int i = 0; i < R; i++) {
            char[] inputAsChar = br.readLine().toCharArray();
            for (int j = 0; j < C; j++) {
                char mark = inputAsChar[j];
                if (mark == EMPTY) {
                    map[i][j] = 'D';
                    continue;
                }
                map[i][j] = inputAsChar[j];
            }
        }

        for (int i = 0; i < R; i++) {

            for (int j = 0; j < C; j++) {
                char target = map[i][j];
                if (target == W) {
                    boolean result = search(i, j);
                    if (result) {
                        stop = true;
                        break;
                    }
                }
            }
            if (stop) {
                break;
            }
        }

        if (stop) {
            System.out.println('0');
        } else {
            System.out.println('1');
            printMap();
        }
    }

    private static void printMap() {
        for (int i = 0; i < map.length; i++) {
            for (int j = 0; j < map[0].length; j++) {
                System.out.print(map[i][j]);
            }
            System.out.println();
        }
    }

    private static boolean search(int y, int x) {

        if (canMove(y + 1, x) && map[y + 1][x] == S) {
            return true;
        }
        if (canMove(y - 1, x) && map[y - 1][x] == S) {
            return true;
        }
        if (canMove(y, x + 1) && map[y][x + 1] == S) {
            return true;
        }
        if (canMove(y, x - 1) && map[y][x - 1] == S) {
            return true;
        }
        return false;
    }

    private static boolean canMove(int y, int x) {

        if (y < 0) {
            return false;
        } else if (x < 0) {
            return false;

        } else if (y >= R) {
            return false;

        } else if (x >= C) {
            return false;

        }
        return true;
    }

}

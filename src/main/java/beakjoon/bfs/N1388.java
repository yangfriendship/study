package beakjoon.bfs;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class N1388 {

    static int count = 0;
    static final char VERTI = '-';
    static final char HOLI = '|';
    static final char EMPTY = '@';
    static char[][] board;
    static int height;
    static int length;

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] input = br.readLine().split(" ");
        height = Integer.parseInt(input[0]);
        length = Integer.parseInt(input[1]);
        board = new char[height][length];
        for (int i = 0; i < height; i++) {
            char[] chars = br.readLine().toCharArray();
            for (int j = 0; j < chars.length; j++) {
                board[i][j] = chars[j];
            }
        }

        for (int i = 0; i < height; i++) {
            for (int j = 0; j < length; j++) {
                char mark = board[i][j];
                if (mark != EMPTY) {
                    search(i, j, mark);
                    count = count + 1;
                }
            }
        }

        System.out.println(count);

    }

    public static void search(int y, int x, char mark) {
        board[y][x] = EMPTY;
        if (mark == VERTI && x + 1 < length && board[y][x + 1] == mark) {
            search(y, x + 1, mark);
        } else if (mark == HOLI && y + 1 < height && board[y + 1][x] == mark) {
            search(y + 1, x, mark);
        }
    }

}